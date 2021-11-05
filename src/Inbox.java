import java.util.ArrayList;

public class Inbox {
    private int accountID;
    private Message[] sentMessages;
    private Message[] receivedMessages;

    public Inbox(int accountID) {
        this.accountID = accountID;
        sentMessages = null;
        receivedMessages = null;
    }

    public int getAccountID() {
        return accountID;
    }

    public Message[] getSentMessages() {
        return sentMessages;
    }

    public Message[] getReceivedMessages() {
        return receivedMessages;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setSentMessages(Message[] sentMessages) {
        this.sentMessages = sentMessages;
    }

    public void setReceivedMessages(Message[] receivedMessages) {
        this.receivedMessages = receivedMessages;
    }
}
