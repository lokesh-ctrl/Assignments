package PhoneBook;

import java.util.List;

public class AddContactToPhoneBook {
    public List<Contact> addContactToPhoneBook(List<Contact> contactList, Contact newcontact){
        contactList.add(newcontact);
        return contactList;

    }
}
