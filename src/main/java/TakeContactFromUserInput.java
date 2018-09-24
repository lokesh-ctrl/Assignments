import java.util.Scanner;

public class TakeContactFromUserInput {
    public Contact returnContact() {
        Scanner sc = new Scanner(System.in);
        Contact contact = new Contact();
        String firstname;
        String lastname;
        String firsthalfofnumber;
        String secondhalfofnumber;
        String firstNameInNumber;
        String lastnameinNumber;
        String address;

        do {
            System.out.println("Enter First Name");
            firstname = sc.nextLine();
            if (firstname == "" || firstname == " ") {
                System.out.println("Name can't be null or just space");
            }
        } while (firstname == "" || firstname == " ");

        do {
            System.out.println("Enter Last Name");
            lastname = sc.nextLine();
            if (lastname == "" || lastname == " ") {
                System.out.println("Name can't be null or just space");
            }
        } while (lastname == "" || lastname == " ");

        do {
            System.out.println("Enter First half of number");
            firsthalfofnumber = sc.nextLine();
            if (firsthalfofnumber == "" || firsthalfofnumber == " ") {
                System.out.println("Name can't be null or just space");
            }
        } while (firsthalfofnumber == "" || firsthalfofnumber == " ");

        do {
            System.out.println("Enter second half of number");
            secondhalfofnumber = sc.nextLine();
            if (secondhalfofnumber == "" || secondhalfofnumber == " ") {
                System.out.println("Name can't be null or just space");
            }
        } while (secondhalfofnumber == "" || secondhalfofnumber == " ");

        System.out.println("Enter adress which is optional");
        address = sc.nextLine();

        firstNameInNumber = NameToNumberConverter.nameToNumberConvertTest(firstname);
        lastnameinNumber = NameToNumberConverter.nameToNumberConvertTest(lastname);

        contact.setFirstName(firstname);
        contact.setLastname(lastname);
        contact.setLastNameInNumber(lastnameinNumber);
        contact.setFirstNameInNumber(firstNameInNumber);
        contact.setSecondHalfOfPhoneNumber(secondhalfofnumber);
        contact.setFirstHalfOfPhoneNumber(firsthalfofnumber);
        contact.setAddress(address);

        return contact;
    }
}
