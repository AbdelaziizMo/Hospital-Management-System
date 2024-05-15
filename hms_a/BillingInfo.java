
package hms_a;

import java.util.ArrayList;

public class BillingInfo {
    private int patientID;
    private ArrayList<Integer>medicineID;
    private String recommendations, date;
    private int fee;

    public BillingInfo() {
        this.patientID = 0;
        this.medicineID = new ArrayList<>();
        this.recommendations = "";
        this.date = "";
        this.fee = 0;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public ArrayList<Integer> getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(int medicineID) {
        this.medicineID.add(medicineID);
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
    
    
}
