package com.ProGeeks.ContactsManager.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ProGeeks.ContactsManager.Model.Contact.*;
import com.ProGeeks.ContactsManager.Model.Email.Email;
import com.ProGeeks.ContactsManager.Model.Email.InvalidEmailAddressException;
import com.ProGeeks.ContactsManager.Model.PhoneNumber.InvalidPhoneNumberException;
import com.ProGeeks.ContactsManager.Model.PhoneNumber.PhoneNumber;

public class ContactsManager {

    private Connection _connection;
    private Statement _statement;

    public ContactsManager() {

        try {
            _connection = DriverManager.getConnection("jdbc:sqlite:contacts.db");
            _statement = _connection.createStatement();
            _statement.setQueryTimeout(30);
            if(!isDatabaseInit()) initDatabase();
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }

    public List<Contact> getContacts() throws SQLException {
        ResultSet rs = _statement.executeQuery("SELECT * FROM Contacts");
        List<Contact> contacts = new ArrayList();
        Contact c;
        while (rs.next()) {
            c = new Contact();
            c.id = rs.getInt("id");
            c.firstName = rs.getString("firstName");
            c.lastName = rs.getString("lastName");
            c.jobTitle = rs.getString("jobTitle");
            contacts.add(c);
        }
        return contacts;
    }

    public Contact getContactDetails(int id) throws SQLException, InvalidEmailAddressException, InvalidPhoneNumberException {
        ResultSet rs = _statement.executeQuery("SELECT Contacts.*,GROUP_CONCAT(DISTINCT PhoneNumbers.phoneNumber) AS numbers,GROUP_CONCAT(DISTINCT emails.email) AS emails FROM Contacts LEFT JOIN PhoneNumbers ON Contacts.id = PhoneNumbers.contact_id LEFT JOIN emails ON Contacts.id = emails.contact_id WHERE Contacts.id="+id+" GROUP BY Contacts.id ;");
        Contact c = new Contact();
        c.id = rs.getInt("id");
        c.firstName = rs.getString("firstName");
        c.lastName = rs.getString("lastName");
        c.jobTitle = rs.getString("jobTitle");
        String[] emails = rs.getString("emails").split(",");
        for(int i = 0;i < emails.length;i++) {
            Email e = new Email(emails[i]);
            c.emails.add(e);
        }
        String[] numbers = rs.getString("numbers").split(",");
        for(int i = 0;i < numbers.length;i++) {
            PhoneNumber n = PhoneNumber.FromString(numbers[i]);
            c.phoneNumbers.add(n);
        }
        return c;
    }
    
    public void addContact(Contact c) throws SQLException {
        String qry= "BEGIN;INSERT INTO Contacts(firstName,lastName,jobTitle) VALUES('"+c.firstName+"','"+c.lastName+"','"+c.jobTitle+"');SELECT last_insert_rowid() INTO @last_id;";
        if(c.phoneNumbers.size() != 0) {
            qry += "INSERT INTO PhoneNumbers(contact_id,phoneNumber) VALUES";
            for(int i = 0;i < c.phoneNumbers.size();i++) {
                qry += "(@last_id," + c.phoneNumbers.get(i).get() + ")";
            }
            qry += ";";
        }
        if(c.emails.size() != 0) {
            qry += "INSERT INTO emails(contact_id,email) VALUES";
            for(int i = 0;i < c.emails.size();i++) {
                qry += "(@last_id,'" + c.emails.get(i)+ "')";
            }
            qry += ";";
        }
        qry += "COMMIT;";
        _statement.executeQuery(qry);
    }
    
    public void updateContactDetails(Contact c) throws SQLException {
        String qry= "BEGIN;UPDATE Contacts SET firstName='"+c.firstName+"',lastName='"+c.lastName+"',jobTitle='"+c.jobTitle+"' WHERE Contacts.id="+c.id+";DELETE FROM PhoneNumbers WHERE PhoneNumbers.contact_id=" + c.id + ";DELETE FROM emails WHERE emails.contact_id=" + c.id + ";";
        if(c.phoneNumbers.size() != 0) {
            qry += "INSERT INTO PhoneNumbers(contact_id,phoneNumber) VALUES";
            for(int i = 0;i < c.phoneNumbers.size();i++) {
                qry += "(" + c.id + "," + c.phoneNumbers.get(i).get() + ")";
            }
            qry += ";";
        }
        if(c.emails.size() != 0) {
            qry += "INSERT INTO emails(contact_id,email) VALUES";
            for(int i = 0;i < c.emails.size();i++) {
                qry += "(" + c.id + ",'" + c.emails.get(i)+ "')";
            }
            qry += ";";
        }
        qry += "COMMIT;";
        _statement.executeQuery(qry);
    }
    
    public void deleteContact(int id) throws SQLException {
        _statement.executeQuery("BEGIN;DELETE FROM PhoneNumbers WHERE PhoneNumbers.contact_id="+id+";DELETE FROM emails WHERE emails.contact_id="+id+";DELETE FROM Contacts WHERE Contacts.id=" + id + ";COMMIT;");
    }
    
    private void initDatabase() throws SQLException {
        String contactsTable = "CREATE TABLE Contacts (\r\n"
                + "    id        INTEGER PRIMARY KEY NOT NULL,\r\n"
                + "    firstName TEXT,\r\n"
                + "    lastName  TEXT,\r\n"
                + "    jobTitle  TEXT,\r\n"
                + "    UNIQUE (\r\n"
                + "        firstName,\r\n"
                + "        lastName\r\n"
                + "    )\r\n"
                + "    ON CONFLICT FAIL\r\n"
                + ");";
        String phoneNumbersTable = "CREATE TABLE PhoneNumbers (\r\n"
                + "    id          INTEGER      PRIMARY KEY\r\n"
                + "                             NOT NULL,\r\n"
                + "    contact_id  INTEGER      REFERENCES Contacts (id),\r\n"
                + "    phoneNumber INTEGER (64) UNIQUE\r\n"
                + "                             NOT NULL\r\n"
                + ");";
        String emailsTable = "CREATE TABLE emails (\r\n"
                + "    id         INTEGER PRIMARY KEY\r\n"
                + "                       NOT NULL,\r\n"
                + "    contact_id INTEGER REFERENCES Contacts (id),\r\n"
                + "    email      TEXT    NOT NULL\r\n"
                + "                       UNIQUE\r\n"
                + ");";
        _statement.executeUpdate("BEGIN;\r\n" + contactsTable + "\r\n" + phoneNumbersTable + "\r\n" + emailsTable + "\r\nCOMMIT;");
    }

    private boolean isDatabaseInit() {
        Map<String, Boolean> InitMap = new HashMap();
        InitMap.put("contacts", false);
        InitMap.put("phonenumbers", false);
        InitMap.put("emails", false);
        boolean allinit = true;
        try {
            ResultSet rs = _statement.executeQuery("SELECT name FROM sqlite_master WHERE type = 'table' AND name NOT LIKE 'sqlite_%';");
            while (rs.next()) {
                InitMap.put(rs.getString(0), true);
            }
            for (int i = 0; i < InitMap.size(); i++) {
                allinit &= InitMap.get(InitMap.keySet().toArray()[i]);
            }
            return allinit;
        } catch (Exception ex) {
            return false;
        }
    }

    /*
	 create LS-CRUD+S
	 L-CRUD+S :
	 Create Contacts n
	 Read Contacts y
	 Update Contacts n
	 Delete Contacts y
	 Search Contacts y
	 
	 S-CRUD+S :
	 Create Contact y
	 Read Contact y
	 Update Contact y
	 Delete Contact y
	 Search Contact n

	Other :
	Search Contacts By Number y
	Search Contacts By Name y
     */
}
