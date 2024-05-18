package com.ProGeeks.ContactsManager.Model.Contact;

public class ContactBasic extends Printable {
    public int id;
    public String firstName = "";
    public String lastName = "";
    public String jobTitle = "";
    
    @Override
    public String toString() {
        return "[id:"+id+",fn:"+firstName+",ln:"+lastName+",jt:"+jobTitle+"]";
    }

    @Override
    public void printDetails() {
        System.out.println(this.toString());
    }
    
}



