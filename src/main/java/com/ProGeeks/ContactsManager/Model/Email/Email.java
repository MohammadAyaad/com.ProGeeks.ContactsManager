package com.ProGeeks.ContactsManager.Model.Email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	private String _email;
	private static Pattern emailValidationPattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
	public Email(String email) throws InvalidEmailAddressException {
		this.set(email);
	}
	public void set(String email) throws InvalidEmailAddressException {
		if(isEmailValid(email))
			this._email = email;
		else throw new InvalidEmailAddressException();
	}
	public String get() {
		return this._email;
	}
	
	public boolean isEmailValid(String email) {
		Matcher matcher = emailValidationPattern.matcher(email);
		return matcher.matches();
	}
	
	@Override
	public String toString() {
		return get();
	}
}
