public class Message {
    private int recipientID;
    private String subjectText;
    private String messageBody;

    public Message(int recipientID, String subjectText, String messageBody) {
        this.recipientID = recipientID;
        this.subjectText = subjectText;
        this.messageBody = messageBody;
    }

    public int getRecipientID() {
        return recipientID;
    }
    public String getSubjectText() {
        return subjectText;
    }
    public String getMessageBody() {
        return messageBody;
    }

    public void setRecipientID(int recipientID) {
        this.recipientID = recipientID;
    }
    public void setSubjectText(String subjectText) {
        this.subjectText = subjectText;
    }
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
}
