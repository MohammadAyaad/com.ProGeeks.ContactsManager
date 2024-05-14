package com.ProGeeks.ContactsManager.Model.Contact;

public class ContactBasic {
    public int id;
    public String firstName = "";
    public String lastName = "";
    public String jobTitle = "";
    
    @Override
    public String toString() {
        return "[id:"+id+",fn:"+firstName+",ln:"+lastName+",jt:"+jobTitle+"]";
    }
    
}