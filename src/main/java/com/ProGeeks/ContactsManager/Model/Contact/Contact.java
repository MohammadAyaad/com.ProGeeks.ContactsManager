package com.ProGeeks.ContactsManager.Model.Contact;

import java.util.ArrayList;
import java.util.List;

import com.ProGeeks.ContactsManager.Model.Email.Email;
import com.ProGeeks.ContactsManager.Model.PhoneNumber.PhoneNumber;



public class Contact extends ContactBasic {
	public List<Email> emails;
	public List<PhoneNumber> phoneNumbers;
	public Contact() {
		this.firstName = "";
		this.lastName = "";
		this.emails = new ArrayList();
		this.phoneNumbers = new ArrayList();
	}
        
        @Override
        public String toString() {
            String s = "{"+super.toString() + ",\n[";
            for(int i=0;i<this.phoneNumbers.size();i++) s+= phoneNumbers.get(i).toString();
            s+= "],\n[";
            for(int i=0;i<this.emails.size();i++) s+= emails.get(i).toString();
            s += "]}";
            return s;
        }
} 
