public class Visit {
    private String date, allergies, healthConcerns, doctorNotes;
    private String weight, height, temperature, bloodPressure;
    private boolean overTwelve;
    private Prescription prescriptionGiven;

    public Visit(String date, String weight, String height, String temperature, String bloodPressure, boolean overTwelve,
                 String allergies, String healthConcerns/*, String doctorNotes*/) {
        this.date = date;
        this.weight = weight;
        this.height = height;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.overTwelve = overTwelve;
        this.allergies = allergies;
        this.healthConcerns = healthConcerns;
        //this.doctorNotes = doctorNotes;
    }

    public String getDate() {
        return date;
    }
    public String getWeight() {
        return weight;
    }
    public String getHeight() {
        return height;
    }
    public String getTemperature() {
        return temperature;
    }
    public String getBloodPressure() {
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

    public void setWeight(String weight) {
        this.weight = weight;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
    public void setBloodPressure(String bloodPressure) {
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
