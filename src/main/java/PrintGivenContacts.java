import java.util.List;

public class PrintGivenContacts {
    public void printGivenContacts(List<Contact> givenContactList){
        System.out.println();
        for (Contact contact:givenContactList) {
            System.out.println("FirstName\tLastName\tPhoneNumber\t");
            System.out.println(contact.getFirstName()+"\t"+contact.getLastname()+"\t"+contact.getFirstHalfOfPhoneNumber()+contact.getSecondHalfOfPhoneNumber());
        }
        System.out.println("*************************");
    }
}
