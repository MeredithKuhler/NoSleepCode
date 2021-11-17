import java.io.Serializable;

public class Account implements Serializable {
    private String lastName;
    private String firstName;
    private String password;
    private int ID;
    private Inbox inbox;

    public Account(String lastName, String firstName, String password, int ID, Inbox inbox) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.password = password;
        this.ID = ID;
        this.inbox = new Inbox(ID);
    }

    //Accessor
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return lastName;
    }
    public String getPassword() {
        return password;
    }
    public int getID() {
        return ID;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

}
