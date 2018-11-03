package com.gaurav;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static MobilePhone mobilePhone = new MobilePhone("123123123");

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

        boolean quit = false;
        startPhone();
        printAction();
        while (!quit){
            System.out.println("\nEnter action: (6 to show available action.)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action ){
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    quertContact();
                    break;
                case 6:
                    printAction();
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = " + name + "," +
                    "phone = " + phone);
        }else{
            System.out.println("Cannot add, "+ name + " already on file.");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact:");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new COntact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter the new contact number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContact, newContact)){
            System.out.println("Successfully updated record");
        }else{
            System.out.println("Error updating record.");
        }

    }


    private static void removeContact(){
        System.out.println("Enter existing contact:");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found.");
            return;
        }

        if (mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully deleted.");
        }else{
            System.out.println("Error deleting contact.");
        }
    }

    private static void quertContact(){
        System.out.println("Enter existing contact:");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContact.getName() +
                ", PhoneNumber: " + existingContact.getPhoneNumber());

    }





    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void printAction(){
        System.out.println("\nAvilable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add new contacts\n" +
                "3 - to update the exisiting contacts\n" +
                "4 - to remove\n" +
                "5 - to query\n" +
                "6 - to print the list of avialbe contacts.");
    }
}
