import java.util.ArrayList;

public class Patient extends Account {
    private String dateOfBirth;
    private String phoneNumber;
    private String emailAddress;
    private Insurance insurance;
    private Pharmacy pharmacy;
    private ArrayList<Visit> previousVisits;
    private ArrayList<EmergencyContact> emergencyContact;
    private Address address;

    public Patient(String lastName, String firstName, String password, int ID, String userName) {
        super(lastName, firstName, password, ID, userName);
        dateOfBirth = "";
        phoneNumber = "";
        emailAddress = "";
        insurance = new Insurance("","","","");
        pharmacy = new Pharmacy("","", "",new Address("","","","",""));
        previousVisits = new ArrayList<Visit>();
        emergencyContact = new ArrayList<EmergencyContact>();
        address = new Address();
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public Insurance getInsurance() {
        return insurance;
    }
    public Pharmacy getPharmacy() {
        return pharmacy;
    }
    public ArrayList<Visit> getPreviousVisits() {
        return previousVisits;
    }
    public ArrayList<EmergencyContact> getEmergencyContact() {
        return emergencyContact;
    }
    public Address getAddress() {
        return address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void addInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }
    public void addPreviousVisits(Visit previousVisits) {
        this.previousVisits.add(previousVisits);
    }
    public void addEmergencyContact(EmergencyContact emergencyContact) {
        this.emergencyContact.add(emergencyContact);
    }
    public void setAddress(Address address){
        this.address = address;
    }
}
