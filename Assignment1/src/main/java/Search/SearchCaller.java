package Search;

import Methods.CheckNumeric;
import PhoneBook.Contact;

import java.util.List;

public class SearchCaller {
    public static List<Contact> searchCallerMethod(List<Contact> contactList, String searchingString){
        if (CheckNumeric.isNumeric(searchingString)){
            return SearchContactInPhoneBook.searchContactByNumber(contactList,searchingString);
        }
        else {
         return SearchContactInPhoneBook.searchContactByName(contactList,searchingString);
        }
    }
}
