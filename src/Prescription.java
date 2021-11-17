public class Prescription {
    private String name;
    private String dosage;
    private String directions;
    private int quantity;

    public Prescription(String name, String dosage, String directions, int quantity) {
        this.name = name;
        this.dosage = dosage;
        this.directions = directions;
        this.quantity = quantity;
    }

    public Prescription() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
