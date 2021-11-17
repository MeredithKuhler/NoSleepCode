import java.io.Serializable;

public class Account implements Serializable {
    private String lastName;
    private String firstName;
    private String password;
    private int ID;
    private Inbox inbox;
    private String userName;

    public Account(String lastName, String firstName, String password, int ID, String userName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.password = password;
        this.ID = ID;
        this.inbox = new Inbox(ID);
        this.userName = userName;
    }

    //Accessor
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getPassword() {
        return password;
    }
    public int getID() {
        return ID;
    }

    public String getUserName(){
        return userName;
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

    public void setUserName(String newName){
        this.userName = newName;
    }

}
