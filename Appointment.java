//Student Name: Mohammed Nadil Hamed
//Student ID : 1320230587
package Final_Project;

import java.io.Serializable;

public class Appointment implements Serializable {

    private Patient patient;
    private Doctor doctor;
    private String date, appointmentId;
    private int roomNumber;

    public Appointment( String appointmentId,Patient patient, Doctor doctor, String date, int roomNumber) {
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentId = appointmentId;
        this.date = date;
        this.roomNumber = roomNumber;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }

    public String getappointmentId() {
        return appointmentId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setDate(String date) {
        this.date = date;
    }
     public void setappointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "----- Appointment -----\n"
                + "Patient: " + patient.getName() + "\n"
                + "Doctor: " + doctor.getName() + "\n"
                + "Date: " + date + "\n"
                + "Room: " + roomNumber + "\n"
                + "-----------------------";
    }

}
