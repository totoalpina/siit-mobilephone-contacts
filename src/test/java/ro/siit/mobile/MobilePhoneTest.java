package ro.siit.mobile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MobilePhoneTest {
    final List<Contact> myContacts = new ArrayList<>();
    final MobilePhone mobilePhone = new MobilePhone("454563", myContacts);

    @Test
    void whenNewContactIsAddedAndDuplicated() {
        mobilePhone.addNewContact("Mama", "02345566");
        mobilePhone.addNewContact("Mama", "457657");

        Assertions.assertEquals(1, mobilePhone.getContactsListSize());
    }

    @Test
    void whenContactIsRemoved() {
        mobilePhone.addNewContact("Radu", "3454656");
        mobilePhone.addNewContact("Alex", "35446645");
        mobilePhone.addNewContact("Corina", "43543643");
        mobilePhone.addNewContact("Claudiu", "23343");

        int expectedSize = mobilePhone.getContactsListSize() - 1;
        Contact contactToBeRemoved = Contact.createContact("Radu", "3454656");
        mobilePhone.removeContact(contactToBeRemoved);
        int actualSize = mobilePhone.getContactsListSize();

        Assertions.assertEquals(expectedSize, actualSize);
    }

    @Test
    void whenContactIsUpdated() {
        mobilePhone.addNewContact("Radu", "3454656");
        mobilePhone.addNewContact("Alex", "35446645");
        mobilePhone.addNewContact("Corina", "43543643");
        mobilePhone.addNewContact("Claudiu", "23343");
        mobilePhone.printContacts();
        System.out.println("****");
        int expectedSize = mobilePhone.getContactsListSize();
        Contact contactToBeUpdated = Contact.createContact("Radu", "3454656");
        Contact newContact = Contact.createContact("Radu L.", "3454656");
        mobilePhone.updateContact(contactToBeUpdated, newContact);
        int actualSize = mobilePhone.getContactsListSize();

        boolean isContactUpdated = false;
        if (mobilePhone.findContact(newContact) >= 0 && expectedSize == actualSize) {
            isContactUpdated = true;
        }

        mobilePhone.printContacts();
        Assertions.assertTrue(isContactUpdated);
    }
}
