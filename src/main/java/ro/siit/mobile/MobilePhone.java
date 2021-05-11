package ro.siit.mobile;

import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(String name, String phoneNumber) {
//        Returns true if the contact doesn't exists, or false if the contact already exists.

        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
//        The old contact that will be updated with the new contact) and returns a boolean.
//        Returns true if the contact exists and was updated successfully
        return true;
    }

    public boolean removeContact(Contact contact) {
//        Returns true if the contact exists and was removed successfully
        return true;
    }

    public int findContact(Contact contact) {
        return 1;
    }

    public int findContact(String name) {
        return 1;
    }

    public Contact queryContacts(String name) {
//        Use the String to search for the name and then return the Contact.
        return null;
    }

    public void printContacts() {

    }
}

//    In MobilePhone, use findContact() in the other methods (except printContacts()) to check if
//        it exists before proceeding. Two Contact objects are equal if they have the same name.
