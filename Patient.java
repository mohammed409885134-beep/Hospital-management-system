//Student Name: Mohammed Nadil Hamed
//Student ID : 1320230587
package Final_Project;

import java.io.Serializable; 

public class Patient extends Person implements  Serializable{

    private String patientId;
    private String disease;
    private String admissionDate;
    private double bill;

    public Patient() {
        super();
    }
    

    public Patient(String patientId, String disease, String admissionDate, double bill, String identityNumber, String name, String gender, String phone, String address) {
        super(identityNumber, name, gender, phone, address);
        this.patientId = patientId;
        this.disease = disease;
        this.admissionDate = admissionDate;
        this.bill = bill;
    }

    @Override
    public String printDetails() {
        return "----- Patient Details -----\n"
                + "Identity Number: " + getIdentityNumber() + "\n"
                + "Name: " + getName() + "\n"
                + "Gender: " + getGender() + "\n"
                + "Phone: " + getPhone() + "\n"
                + "Address: " + getAddress() + "\n"
                + "Patient ID: " + patientId + "\n"
                + "Disease: " + disease + "\n"
                + "Admission Date: " + admissionDate + "\n"
                + "Bill: " + bill + "\n"
                + "---------------------------";
    }

    public String getPatientId() {
        return patientId;
    }

    public String getDisease() {
        return disease;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public double getBill() {
        return bill;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Patient{" + "patientId=" + patientId + ", disease=" + disease + ", admissionDate=" + admissionDate + ", bill=" + bill + '}';
    }

}
