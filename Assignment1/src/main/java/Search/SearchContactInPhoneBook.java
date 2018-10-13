package Search;

import Methods.NameToNumberConverter;
import PhoneBook.Contact;

import java.util.ArrayList;
import java.util.List;

public class SearchContactInPhoneBook {
    public static List<Contact> searchContactByNumber(List<Contact> contactList, String number) {
        List<Contact> resultContacts = new ArrayList<>();
        Contact temp;
        for (Contact aContactList : contactList) {
            temp = aContactList;
            String wholeString = temp.getWholeContactInString();
            boolean condition;
            condition = wholeString.contains(number);
            if (condition) {
                resultContacts.add(temp);
            }
        }
        return resultContacts;
    }

    public static List<Contact> searchContactByName(List<Contact> contactList, String name) {

        String convertedNumber = NameToNumberConverter.nameToNumberConverter(name);
        return searchContactByNumber(contactList,convertedNumber);
    }
}
