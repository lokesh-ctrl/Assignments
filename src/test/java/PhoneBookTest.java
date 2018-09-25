import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @Test
    public void testingOfAddingContactIntoPhonebook(){
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact();
        contact.setFirstName("Loki");
        contact.setLastname("R");
        contact.setFirstHalfOfPhoneNumber("12345");
        contact.setSecondHalfOfPhoneNumber("67890");
        contact.setAddress("Bangalore");
        contact.setFirstNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getFirstName()));
        contact.setLastNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getLastname()));
        phoneBook.addContact(contact);

        assertEquals("Loki",phoneBook.getPhoneBook().get(0).getFirstName());
    }

}