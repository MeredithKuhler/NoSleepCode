import java.util.ArrayList;

public class Patient extends Account {
    private int dateOfBirth;
    private int phoneNumber;
    private String emailAddress;
    private ArrayList<Insurance> insurance;
    private Pharmacy pharmacy;
    private ArrayList<Visit> previousVisits;
    private ArrayList<EmergencyContact> emergencyContact;
    private Address address;

    public Patient(String lastName, String firstName, String password, int ID, Inbox inbox) {
        super(lastName, firstName, password, ID, inbox);
        dateOfBirth = 0;
        phoneNumber = 0;
        emailAddress = " ";
        insurance = new ArrayList<Insurance>();
        pharmacy = new Pharmacy();
        previousVisits = new ArrayList<Visit>();
        emergencyContact = new ArrayList<EmergencyContact>();
        address = new Address();
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public ArrayList<Insurance> getInsurance() {
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

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void addInsurance(Insurance insurance) {
        this.insurance.add(insurance);
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
