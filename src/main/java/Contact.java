package Bean;

public class Contact {
    private String firstName;
    private String Lastname;
    private String firstHalfOfPhoneNumber;
    private String secondHalfOfPhoneNumber;
    private String address;

    public String getAddress() {
        return address;
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

    public void setAddress(String address) {
        this.address = address;
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
}
