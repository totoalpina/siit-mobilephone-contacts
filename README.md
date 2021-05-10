### Create a program that implements a simple mobile phone with the following capabilities.
1.  Implement the master class MobilePhone, that holds the List<> of Contacts, with the following attributes:
    -  Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
    -  A constructor that takes a String (the phone number) and initialises myNumber and instantiates List<> myContacts.
    -  And seven methods, they are (their functions are in their names):
        -  addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact doesn't exists, or false if the contact already exists.
        -  updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
        -  removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact exists and was removed successfully, or false if the contact doesn't exists.
        -  findContact(), has one parameter of type Contact and returns an int.
        -  findContact(), same as above, only it has one parameter of type String.
        -  queryContact(), has one parameter of type String and returns a Contact. Use the String to search for the name and then return the Contact.
        -  printContacts(), has no parameters and doesn't return anything.
2. Implement the Contact class with the following attributes:
    -  Two fields, both String, one called name and the other phoneNumber.
    -  A constructor that takes two Strings, and initialises name and phoneNumber.
    -  And Three methods, they are:
        -  getName(), getter for name.
        -  getPhoneNumber(), getter for phoneNumber.
        -  createContact(), has two parameters of type String (the persons name and phone number) and returns an instance of Contact. This is the only method that is static.
In MobilePhone, use findContact() in the other methods (except printContacts()) to check if it exists before proceeding.
Two Contact objects are equal if they have the same name.
