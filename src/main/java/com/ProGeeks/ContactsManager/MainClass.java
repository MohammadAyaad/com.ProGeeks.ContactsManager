package com.ProGeeks.ContactsManager;

import com.ProGeeks.ContactsManager.Data.ContactsManager;
import com.ProGeeks.ContactsManager.GUI.*;
import com.ProGeeks.ContactsManager.Model.Contact.*;
import com.ProGeeks.ContactsManager.Model.Email.*;
import com.ProGeeks.ContactsManager.Model.PhoneNumber.*;
import com.ProGeeks.ContactsManager.Data.LevenshteinDistance;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainClass {
    public static ContactsManager manager;
    public static void main(String[] args) throws SQLException, InvalidPhoneNumberException, InvalidEmailAddressException
    {
        manager = new ContactsManager();
        
        try {
                    new MainContactsList().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
    public static void test(ContactsManager m) throws SQLException, InvalidPhoneNumberException, InvalidEmailAddressException {
        System.out.println("Contacts List : ");
        pContactList(m.getContacts());
        Contact ayaad = new Contact();
        ayaad.firstName = "Mohammad";
        ayaad.lastName = "Ayaad";
        ayaad.jobTitle = "Software Developer";
        ayaad.phoneNumbers.add(new PhoneNumber(201124456645l));
        ayaad.phoneNumbers.add(new PhoneNumber(201102198815l));
        ayaad.emails.add(new Email("ayaadm730@gmail.com"));
        ayaad.emails.add(new Email("mohammadayaad256@gmail.com"));
        m.addContact(ayaad);
        //======= Hady
        Contact c = new Contact();
        c.firstName = "Hady";
        c.lastName = "Mostafa";
        c.jobTitle = "Software Developer";
        c.phoneNumbers.add(new PhoneNumber(201142924668l));
        c.phoneNumbers.add(new PhoneNumber(201102198816l));
        c.emails.clear();
        c.emails.add(new Email("hadymostafa10.1999@gmail.com"));
        c.emails.add(new Email("ktatny365@gmail.com"));
        m.addContact(c);
        ayaad.id =1;
        ayaad.emails.add(new Email("mohammadayaad1024@gmail.com"));
        m.updateContactDetails(ayaad);
        System.out.println(m.getContactDetails(1).toString());
        System.out.println("Contacts List : ");
        pContactList(m.getContacts());
        
        
        
        System.out.println("Contacts List : ");
        pContactList(m.getContacts());
        
        String term = "most";
        System.out.println("===================SEARCH '" + term +"' ====================");
        System.out.println(m.searchContact(term));
        
    }
    public static void pContactList(List<ContactBasic> l){
        System.out.println("[");
        for(int i=0;i<l.size();i++)    
            System.out.print(l.get(i).toString() + ",\n");
        System.out.println("]");
    }
}
