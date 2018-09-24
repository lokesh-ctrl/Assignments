import java.util.List;
import java.util.Scanner;

public class DialApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        ProvideContactToAddContact provideContactToAddContact = new ProvideContactToAddContact();
        List<Contact> contactList = phoneBook.getPhoneBook();
        System.out.println("Enter your choice");
        System.out.println("1 - Add Contact to Phonebook");
        System.out.println("2 - search contact");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine()=="1"){
            contactList = provideContactToAddContact.provideContactToAddContactToPhoneBook(contactList);
        }
    }
}
