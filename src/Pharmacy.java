public class Pharmacy {
    private String name;
    private String fax;
    private String email;
    private Address address;

    public Pharmacy(String name, String fax, String email, Address address) {
        this.name = name;
        this.fax = fax;
        this.email = email;
        this.address = address;
    }

    public Pharmacy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
