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
        int contactPosition = findContact(name);
        if (contactPosition >= 0) {
            return false;
        }
        myContacts.add(Contact.createContact(name, phoneNumber));
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int contactPosition = findContact(oldContact);
        if (contactPosition >= 0) {
            myContacts.set(contactPosition, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        int contactPosition = findContact(contact);
        if (contactPosition >= 0) {
            myContacts.remove(contactPosition);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (contact.equals(myContacts.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (name.equals(myContacts.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContacts(String name) {
        int contactPosition = findContact(name);
        if (contactPosition >= 0) {
            return myContacts.get(contactPosition);
        }
        return Contact.createContact("No contact", "No number");
    }

    public void printContacts() {
        for (Contact contact: myContacts) {
            System.out.println(contact);
        }
    }

    public int getContactsListSize() {
        return myContacts.size();
    }
}
