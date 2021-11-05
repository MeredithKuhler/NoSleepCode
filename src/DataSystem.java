import java.util.ArrayList;

public class DataSystem {
    private Account[] accountList;
    private Account currentUser;
    private Patient[] patientList;

    public DataSystem(Account[] accountList, Account currentUser) {
        this.accountList = accountList;
        this.currentUser = currentUser;
    }

    public Account[] getAccountList() {
        return accountList;
    }

    public void addAccount(Account newAccount) {
        Account[] newAccountList = new Account[(this.accountList.length + 1)];
        newAccountList[this.accountList.length] = newAccount;
        this.accountList = newAccountList;
    }

    void sendPrescription(Prescription newPrescription, Visit visit) {
        if (currentUser instanceof Doctor) {
            visit.setPrescriptionGiven(newPrescription);
        }
    }

    public void sendMessage(Account currentUser, Account otherUser, int otherUserID, Message message) {
        for (int i = 0; i < accountList.length; i++) {
            if(accountList[i] == otherUser) {
                message.setRecipientID(otherUserID);
            }
        }
    }

    public Account getCurrentUser() {
        return currentUser;
    }

    public ArrayList<Account> getPatient() {
        ArrayList<Account> patient = new ArrayList<Account>();
        for (int i = 0; i < accountList.length; i++) {
            for (int j = 0; j < patientList.length; j++) {
                if((accountList[i].getfirstName() + accountList[i].getLastName()) == (patientList[j].getFirstName() + patientList[j].getLastName())) {
                    //add patient to list of patients and then return that list of patients
                    patient.add(accountList[i]);
                }
            }
        }
        return patient;
    }

    public void setCurrentUser(Account currentUser) {
        this.currentUser = currentUser;
    }
}
