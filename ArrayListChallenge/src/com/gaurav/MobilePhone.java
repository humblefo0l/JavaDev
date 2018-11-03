package com.gaurav;

import java.util.ArrayList;


public class MobilePhone{
    private  String myNumber;
    private  ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){

        if (findContact(contact) >= 0){
            System.out.println(contact.getName()+ " is already in the contact list.");
            return false;
        }

        this.myContacts.add(contact);
        return true;
    }

    public int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    public int findContact(String name){
        for(int i=0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)){
                System.out.println("It already in contact list.");
                return i;
            }
        }

        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int findPosition = findContact(oldContact);
        if (findPosition < 0) {
            System.out.println(oldContact.getName() + " not found in contact list.");
            return false;
        }
        this.myContacts.set(findPosition, newContact);
        System.out.println(newContact.getName() + " , was replaced with " + oldContact.getName());
        return true;
    }

    public String queryContact(Contact contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if (position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public boolean removeContact(Contact contact){
        int index = findContact(contact);
        if (index >= 0 ){
            this.myContacts.remove(contact);
            System.out.println(contact.getName() + " was deleted successfully.");
            return true;
        }

        System.out.println(contact.getName() + " not in contact list.");
        return false;
    }


    public void printContacts(){
        for(int i = 0; i < this.myContacts.size(); i++){
            System.out.println((i+1) + ". " + this.myContacts.get(i).getName() +
                    " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
