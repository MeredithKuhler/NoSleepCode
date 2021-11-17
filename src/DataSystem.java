import java.io.*;
import java.util.ArrayList;

public class DataSystem {
    //private Account[] accountList;
    private ArrayList<Account> accountList;
    private Account currentUser;
    private Patient[] patientList;
    private Patient currentPatient;

    public DataSystem(/*Account currentUser*/) {
        //this.currentUser = currentUser;
        this.accountList = new ArrayList<Account>();
        this.currentPatient = null;
    }

    public void readAccountData() {
        try {
            File file = new File("./TextFiles/accounts.txt");
            FileInputStream inFile = new FileInputStream(file);
            ObjectInputStream inObj = new ObjectInputStream(inFile);
            this.accountList = (ArrayList<Account>) inObj.readObject();
        } catch (Exception ex) {
            System.out.println("accounts.txt Not Found");
        }
    }

    public void writeAccountData() {
        if (!this.accountList.isEmpty()) {
            try {
                FileOutputStream outFile = new FileOutputStream("NoSleepCode-main/accounts.txt");
                ObjectOutputStream outObj = new ObjectOutputStream(outFile);
                outObj.writeObject(accountList);
                outObj.close();
            } catch (Exception ex) {
                System.out.println("File Error");
            }
        }
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void addAccount(Account newAccount) {
        this.accountList.add(newAccount);
    }

    void sendPrescription(Prescription newPrescription, Visit visit) {
        if (currentUser instanceof Doctor) {
            visit.setPrescriptionGiven(newPrescription);
        }
    }


    public void sendMessage(Account currentUser, Account otherUser, int otherUserID, Message message) {
        for (int i = 0; i < accountList.size(); i++) {
            if(accountList.get(i) == otherUser) {
                message.setRecipientID(otherUserID);
            }
        }
    }

    public Account getCurrentUser() {
        return currentUser;
    }

    public ArrayList<Account> getPatient() {
        ArrayList<Account> patient = new ArrayList<Account>();
        for (int i = 0; i < accountList.size(); i++) {
            for (int j = 0; j < patientList.length; j++) {
                if((accountList.get(i).getFirstName() + accountList.get(i).getLastName()) == (patientList[j].getFirstName() + patientList[j].getLastName())) {
                    //add patient to list of patients and then return that list of patients
                    patient.add(accountList.get(i));
                }
            }
        }
        return patient;
    }

    public void setCurrentUser(Account currentUser) {
        this.currentUser = currentUser;
    }

    public Patient getCurrentPatient(){
        return this.currentPatient;
    }

    public void setCurrentPatient(Patient patient){
        this.currentPatient = patient;
    }
}
