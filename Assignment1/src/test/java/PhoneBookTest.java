import Methods.NameToNumberConverter;
import org.junit.jupiter.api.Test;
import PhoneBook.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneBookTest {

    @Test
    void testingOfAddingContactIntoPhonebook(){
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact();
        contact.setFirstName("Loki");
        contact.setLastname("R");
        contact.setFirstHalfOfPhoneNumber("12345");
        contact.setSecondHalfOfPhoneNumber("67890");
        contact.setFirstNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getFirstName()));
        contact.setLastNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getLastname()));
        phoneBook.addContact(contact);

        assertEquals("Loki",phoneBook.getPhoneBook().get(0).getFirstName());
    }

}