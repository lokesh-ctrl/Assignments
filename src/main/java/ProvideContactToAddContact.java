import java.util.List;

public class ProvideContactToAddContact {
    public List<Contact> provideContactToAddContactToPhoneBook(List<Contact> contactList){
        AddContactToPhoneBook addContactToPhoneBook = new AddContactToPhoneBook();
        TakeContactFromUserInput takeContactFromUserInput = new TakeContactFromUserInput();
        Contact newContact = takeContactFromUserInput.returnContact();
        return addContactToPhoneBook.addContactToPhoneBook(contactList,newContact);
    }
}
