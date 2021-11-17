public class Insurance {
    private String providerName;
    private String subscriberName;
    private String subscriberNum;
    private String groupNumber;

    public Insurance(String providerName, String subscriberName, String subscriberNum, String groupNumber) {
        this.providerName = providerName;
        this.subscriberName = subscriberName;
        this.subscriberNum = subscriberNum;
        this.groupNumber = groupNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getSubscriberNum() {
        return subscriberNum;
    }

    public void setSubscriberNum(String subscriberNum) {
        this.subscriberNum = subscriberNum;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }
}
