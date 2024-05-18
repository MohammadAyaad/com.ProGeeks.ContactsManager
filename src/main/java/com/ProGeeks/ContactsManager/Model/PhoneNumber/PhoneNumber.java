package com.ProGeeks.ContactsManager.Model.PhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
	private long _number;
	private static Pattern phoneNumberPattern = Pattern.compile("^+?([0-9]{0,13})$");// Pattern.compile("^+?([0-9]{0,15})$");
	public PhoneNumber(long number) throws InvalidPhoneNumberException {
	    this.set(number);
	}
	public PhoneNumber(String number) throws InvalidPhoneNumberException {
	    this.set(number);
	}
	public void set(String number) throws InvalidPhoneNumberException
	{
		if (isPhoneNumberValid(number)) _number = Long.valueOf(number);
        else throw new InvalidPhoneNumberException();
	}
	public void set(long number) throws InvalidPhoneNumberException
	{
		if (isPhoneNumberValid(number)) _number = number;
        else throw new InvalidPhoneNumberException();
	}
	public long get()
	{
		return this._number;
	}
	@Override
	public String toString()
	{
		return "+" + Long.toString(get());
	}

	public static boolean isPhoneNumberValid(String number)
	{
		Matcher matcher = phoneNumberPattern.matcher(number);
	    return matcher.matches();
	}
	public static boolean isPhoneNumberValid(long number) {
		return number <= 9999999999999l;
	}
	public static PhoneNumber FromLong(long number) throws InvalidPhoneNumberException 
	{
	    return new PhoneNumber(number);
	}
	public static PhoneNumber FromString(String number) throws InvalidPhoneNumberException
	{
	    Matcher matcher = phoneNumberPattern.matcher(number);
	    if(matcher.matches())
	    	return new PhoneNumber(Long.parseLong(matcher.group(1)));
	    else throw new InvalidPhoneNumberException();
	}
}
