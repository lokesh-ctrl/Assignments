import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> phoneBook = new ArrayList<Contact>();

    public List<Contact> getPhoneBook() {
        return phoneBook;
    }

    public void addContact(Contact newContact){
        phoneBook.add(newContact);
    }
}
