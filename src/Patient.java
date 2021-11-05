public class Patient extends Account {
    private int dateOfBirth;
    private int phoneNumber;
    private String emailAddress;
    private Insurance[] insurance;
    private Pharmacy pharmacy;
    private Visit[] previousVisits;
    private EmergencyContact[] emergencyContact;
    private Address address;

    public Patient(String lastName, String firstName, String password, int ID, Inbox inbox) {
        super(lastName, firstName, password, ID, inbox);
        dateOfBirth = 0;
        phoneNumber = 0;
        emailAddress = " ";
        insurance = null;
        pharmacy = new Pharmacy();
        previousVisits = null;
        emergencyContact = null;
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
    public Insurance[] getInsurance() {
        return insurance;
    }
    public Pharmacy getPharmacy() {
        return pharmacy;
    }
    public Visit[] getPreviousVisits() {
        return previousVisits;
    }
    public EmergencyContact[] getEmergencyContact() {
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
    public void setInsurance(Insurance[] insurance) {
        this.insurance = insurance;
    }
    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }
    public void setPreviousVisits(Visit[] previousVisits) {
        this.previousVisits = previousVisits;
    }
    public void setEmergencyContact(EmergencyContact[] emergencyContact) {
        this.emergencyContact = emergencyContact;
    }
    public void setAddress(Address address){
        this.address = address;
    }
}
