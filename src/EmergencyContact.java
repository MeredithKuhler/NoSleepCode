public class EmergencyContact {
    private String name;
    private String relationship;
    private int phoneNumber;

    public EmergencyContact(String name, String relationship, int phoneNumber) {
        this.name = name;
        this.relationship = relationship;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
