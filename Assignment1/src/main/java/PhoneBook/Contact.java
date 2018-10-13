package PhoneBook;

public class Contact {
    private String firstName;
    private String Lastname;
    private String firstNameInNumber;
    private String lastNameInNumber;
    private String firstHalfOfPhoneNumber;
    private String secondHalfOfPhoneNumber;
    private String wholeContactInString;


    public String getFirstNameInNumber() {
        return firstNameInNumber;
    }
    public void setFirstNameInNumber(String firstNameInNumber) {
        this.firstNameInNumber = firstNameInNumber;
    }
    public void setLastNameInNumber(String lastNameInNumber) {
        this.lastNameInNumber = lastNameInNumber;
    }
    public String getLastNameInNumber() {
        return lastNameInNumber;
    }
    public String getFirstHalfOfPhoneNumber() {
        return firstHalfOfPhoneNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastname() {
        return Lastname;
    }
    public String getSecondHalfOfPhoneNumber() {
        return secondHalfOfPhoneNumber;
    }

    public void setFirstHalfOfPhoneNumber(String firstHalfOfPhoneNumber) {
        this.firstHalfOfPhoneNumber = firstHalfOfPhoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public void setSecondHalfOfPhoneNumber(String secondHalfOfPhoneNumber) {
        this.secondHalfOfPhoneNumber = secondHalfOfPhoneNumber;
    }

    public String getWholeContactInString() {
        return wholeContactInString;
    }

    public void setWholeContactInString(String wholeContactInString) {
        this.wholeContactInString = wholeContactInString;
    }
}
