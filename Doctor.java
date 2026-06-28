
package Final_Project;

import java.io.Serializable; 


public class Doctor extends Person implements Serializable{

    private String doctorId;
    private String specialization;
    private double salary;
    private int yearsExperience;

    public Doctor() {
        super();
    }
    

    public Doctor(String doctorId, String specialization, double salary, int yearsExperience, String identityNumber, String name, String gender, String phone, String address) {
        super(identityNumber, name, gender, phone, address);
        this.doctorId = doctorId;
        this.specialization = specialization;
        this.salary = salary;
        this.yearsExperience = yearsExperience;
    }

    @Override
    public String printDetails() {
        return "----- Doctor Details -----\n"
                + "Identity Number: " + getIdentityNumber() + "\n"
                + "Name: " + getName() + "\n"
                + "Gender: " + getGender() + "\n"
                + "Phone: " + getPhone() + "\n"
                + "Address: " + getAddress() + "\n"
                + "Doctor ID: " + doctorId + "\n"
                + "Specialization: " + specialization + "\n"
                + "Salary: " + salary + "\n"
                + "Years of Experience: " + yearsExperience + "\n"
                + "---------------------------";
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    @Override
    public String toString() {
        return "Doctor{" + "doctorId=" + doctorId + ", specialization=" + specialization + ", salary=" + salary + ", yearsExperience=" + yearsExperience + '}';
    }

}
