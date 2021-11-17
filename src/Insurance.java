public class Insurance {
    private String providerName;
    private String subscriberName;
    private int subscriberNum;
    private int groupNumber;

    public Insurance(String providerName, String subscriberName, int subscriberNum, int groupNumber) {
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

    public int getSubscriberNum() {
        return subscriberNum;
    }

    public void setSubscriberNum(int subscriberNum) {
        this.subscriberNum = subscriberNum;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
