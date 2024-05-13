package com.ProGeeks.ContactsManager.Model.Contact;

import java.util.ArrayList;
import java.util.List;

import com.ProGeeks.ContactsManager.Model.Email.Email;
import com.ProGeeks.ContactsManager.Model.PhoneNumber.PhoneNumber;



public class Contact extends ContactBasic{
	public List<Email> emails;
	public List<PhoneNumber> phoneNumbers;
	public Contact() {
		this.firstName = "";
		this.lastName = "";
		this.emails = new ArrayList();
		this.phoneNumbers = new ArrayList();
	}
} 
