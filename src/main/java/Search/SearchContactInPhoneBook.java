package Search;

import Methods.NameToNumberConverter;
import PhoneBook.Contact;

import java.util.ArrayList;
import java.util.List;

public class SearchContactInPhoneBook {
    public static List<Contact> searchContactByNumber(List<Contact> contactList, String number) {
        List<Contact> resultContacts = new ArrayList<Contact>();
        Contact temp;
        for (int i = 0; i < contactList.size(); i++) {
            temp=contactList.get(i);
            String wholeString = temp.getWholeContactInString();
            boolean condition;
            if (wholeString.contains(number)) condition = true;
            else condition = false;
            if(condition){
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
