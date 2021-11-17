import java.util.ArrayList;

public class Inbox {
    private int accountID;
    private ArrayList<Message> sentMessages;
    private ArrayList<Message> receivedMessages;

    public Inbox(int accountID) {
        this.accountID = accountID;
        sentMessages = new ArrayList<Message>();
        receivedMessages = new ArrayList<Message>();
    }

    public int getAccountID() {
        return accountID;
    }

    public ArrayList<Message> getSentMessages() {
        return sentMessages;
    }

    public ArrayList<Message> getReceivedMessages() {
        return receivedMessages;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void addSentMessages(Message sentMessages) {
        this.sentMessages.add(sentMessages);
    }

    public void addReceivedMessages(Message receivedMessages) {
        this.receivedMessages.add(receivedMessages);
    }
}
