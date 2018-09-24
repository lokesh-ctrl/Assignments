import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddContactToPhoneBookTest {

    @Test
    public void checkingWhetherContactIsSavingInPhoneBookListProperly(){
        Contact contact = new Contact();
        contact.setFirstName("Loki");
        contact.setLastname("R");
        contact.setFirstHalfOfPhoneNumber("12345");
        contact.setSecondHalfOfPhoneNumber("67890");
        contact.setAddress("Bangalore");
        contact.setFirstNameInNumber(NameToNumberConverter.nameToNumberConvertTest(contact.getFirstName()));
        contact.setLastNameInNumber(NameToNumberConverter.nameToNumberConvertTest(contact.getLastname()));
        PhoneBook phoneBook = new PhoneBook();
        AddContactToPhoneBook addContactToPhoneBook = new AddContactToPhoneBook();
        List<Contact> contactList = phoneBook.getPhoneBook();
        contactList = addContactToPhoneBook.addContactToPhoneBook(contactList,contact);

        assertEquals("Loki",contactList.get(0).getFirstName());
    }

}