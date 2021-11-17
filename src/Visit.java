public class Visit {
    private String date, allergies, healthConcerns, doctorNotes;
    private int weight, height, temperature, bloodPressure;
    private boolean overTwelve;
    private Prescription prescriptionGiven;

    public Visit(String date, int weight, int height, int temperature, int bloodPressure, boolean overTwelve,
                 String allergies, String healthConcerns, String doctorNotes) {
        this.date = date;
        this.weight = weight;
        this.height = height;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.overTwelve = overTwelve;
        this.allergies = allergies;
        this.healthConcerns = healthConcerns;
        this.doctorNotes = doctorNotes;
    }

    public String getDate() {
        return date;
    }
    public int getWeight() {
        return weight;
    }
    public int getHeight() {
        return height;
    }
    public int getTemperature() {
        return temperature;
    }
    public int getBloodPressure() {
        return bloodPressure;
    }
    public boolean isOverTwelve() {
        return overTwelve;
    }
    public String getAllergies() {
        return allergies;
    }
    public String getHealthConcerns() {
        return healthConcerns;
    }
    public String getDoctorNotes() {
        return doctorNotes;
    }

    public Prescription getPrescriptionGiven() {
        return prescriptionGiven;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public void setPrescriptionGiven(Prescription prescriptionGiven) {
        this.prescriptionGiven = prescriptionGiven;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    public void setOverTwelve(boolean overTwelve) {
        this.overTwelve = overTwelve;
    }
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
    public void setHealthConcerns(String healthConcerns) {
        this.healthConcerns = healthConcerns;
    }
    public void setDoctorNotes(String doctorNotes) {
        this.doctorNotes = doctorNotes;
    }
}
