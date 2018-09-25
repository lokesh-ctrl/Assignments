import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchContactInPhoneBookTest {


    @Test
    public void searchingContactBynumber() {

        PhoneBook phoneBook = new PhoneBook();
        AddContactToPhoneBook addContactToPhoneBook = new AddContactToPhoneBook();
        List<Contact> contactList = phoneBook.getPhoneBook();

        Contact contact = new Contact();
        contact.setFirstName("Loki");
        contact.setLastname("R");
        contact.setFirstHalfOfPhoneNumber("12345");
        contact.setSecondHalfOfPhoneNumber("67890");
        contact.setAddress("Bangalore");
        contact.setFirstNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getFirstName()));
        contact.setLastNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getLastname()));
        contact.setWholeContactInString("Loki R 12345 67890 " + NameToNumberConverter.nameToNumberConverter(contact.getFirstName()) + " " + NameToNumberConverter.nameToNumberConverter(contact.getLastname()));

        contactList = addContactToPhoneBook.addContactToPhoneBook(contactList, contact);

        Contact contact2 = new Contact();
        contact2.setFirstName("cherry");
        contact2.setLastname("lion");
        contact2.setFirstHalfOfPhoneNumber("09876");
        contact2.setSecondHalfOfPhoneNumber("54321");
        contact2.setAddress("Bangalore");
        contact2.setFirstNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getFirstName()));
        contact2.setLastNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getLastname()));
        contact2.setWholeContactInString("cherry lion 09876 54321 " + NameToNumberConverter.nameToNumberConverter(contact.getFirstName()) + " " + NameToNumberConverter.nameToNumberConverter(contact.getLastname()));
        contactList = addContactToPhoneBook.addContactToPhoneBook(contactList, contact2);

        assertEquals("cherry", SearchContactInPhoneBook.searchContactByNumber(contactList, "54321").get(0).getFirstName());
    }

    @Test
    public void searchingContactByName() {
        PhoneBook phoneBook = new PhoneBook();
        AddContactToPhoneBook addContactToPhoneBook = new AddContactToPhoneBook();
        List<Contact> contactList = phoneBook.getPhoneBook();

        Contact contact = new Contact();
        contact.setFirstName("Loki");
        contact.setLastname("R");
        contact.setFirstHalfOfPhoneNumber("12345");
        contact.setSecondHalfOfPhoneNumber("67890");
        contact.setAddress("Bangalore");
        contact.setFirstNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getFirstName()));
        contact.setLastNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getLastname()));
        contact.setWholeContactInString("Loki R 12345 67890 " + NameToNumberConverter.nameToNumberConverter(contact.getFirstName()) + " " + NameToNumberConverter.nameToNumberConverter(contact.getLastname()));

        contactList = addContactToPhoneBook.addContactToPhoneBook(contactList, contact);

        Contact contact2 = new Contact();
        contact2.setFirstName("cherry");
        contact2.setLastname("lion");
        contact2.setFirstHalfOfPhoneNumber("09876");
        contact2.setSecondHalfOfPhoneNumber("54321");
        contact2.setAddress("Bangalore");
        contact2.setFirstNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getFirstName()));
        contact2.setLastNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getLastname()));
        contact2.setWholeContactInString("cherry lion 09876 54321 " + NameToNumberConverter.nameToNumberConverter(contact.getFirstName()) + " " + NameToNumberConverter.nameToNumberConverter(contact.getLastname()));
        contactList = addContactToPhoneBook.addContactToPhoneBook(contactList, contact2);

        assertEquals("lion",SearchContactInPhoneBook.searchContactByName(contactList,"lion"));
    }
}