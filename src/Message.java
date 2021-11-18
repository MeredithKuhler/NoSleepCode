public class Message {
    private String recipientID;
    private String subjectText;
    private String messageBody;
    private String sender;

    public Message(String recipientID, String subjectText, String messageBody, String sender) {
        this.recipientID = recipientID;
        this.subjectText = subjectText;
        this.messageBody = messageBody;
        this.sender = sender;
    }

    public String getRecipientID() {
        return recipientID;
    }
    public String getSubjectText() {
        return subjectText;
    }
    public String getMessageBody() {
        return messageBody;
    }
    public String getSender(){ return sender; }

    public void setRecipientID(String recipientID) {
        this.recipientID = recipientID;
    }
    public void setSubjectText(String subjectText) {
        this.subjectText = subjectText;
    }
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
    public void setSender(String sender){this.sender = sender;}
}
