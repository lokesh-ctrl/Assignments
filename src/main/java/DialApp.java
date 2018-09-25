import PhoneBook.PhoneBook;
import Search.SearchCaller;
import PhoneBook.Contact;
import PhoneBook.*;

import java.util.List;
import java.util.Scanner;

public class DialApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        TakeContactFromUserInput takeContactFromUserInput = new TakeContactFromUserInput();
        AddContactToPhoneBook addContactToPhoneBook = new AddContactToPhoneBook();
        PrintGivenContacts printGivenContacts = new PrintGivenContacts();
        List<Contact> contactList = phoneBook.getPhoneBook();
        Scanner scanner = new Scanner(System.in);
        {

            do {
                System.out.println("Enter your choice");
                System.out.println("1 - Add Contact to Phonebook");
                System.out.println("2 - search contact");
                System.out.println("3- View Contacts");
                System.out.println("4 - Cancel");
                String choice = scanner.nextLine();
                if (choice.equals("1")) {
                    Contact newContact;
                    newContact = takeContactFromUserInput.returnContact();
                    contactList = addContactToPhoneBook.addContactToPhoneBook(contactList, newContact);
                    System.out.println("Comtact added successfully");
                }
                if (choice.equals("2")) {
                    System.out.println("Enter Name or Number to Search");
                    String searchingString = scanner.nextLine();
                    printGivenContacts.printGivenContacts(SearchCaller.searchCallerMethod(contactList, searchingString));
                }
                if (choice.equals("3")){
                    printGivenContacts.printGivenContacts(contactList);
                }
                if (choice.equals("4"))break;
                else {
                    System.out.println("Enter Correct choice");
                }

            } while (true);
        }
    }
}
