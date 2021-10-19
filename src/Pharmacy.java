public class Pharmacy {
    private String name;
    private int fax;
    private String email;
    private Address address;

    public Pharmacy(String name, int fax, String email, Address address) {
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

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
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
