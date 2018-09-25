package PhoneBook;

import sun.awt.geom.AreaOp;

import java.util.List;
import java.util.Scanner;

public class AddContactToPhoneBook {
    public List<Contact> addContactToPhoneBook(List<Contact> contactList, Contact contact){
        contactList.add(contact);
        return contactList;

    }
}
