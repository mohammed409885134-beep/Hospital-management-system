//Student Name: Mohammed Nadil Hamed
//Student ID : 1320230587
package Final_Project;

import java.util.ArrayList;
import java.io.*;


public class HospitalSystem implements Serializable {

    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Appointment> appointments;
    private Patient[] patientArray;

    public HospitalSystem() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
        patientArray = new Patient[100];
    }

    public void addPatientToArray(Patient patient, int index) {
        if (index >= 0 && index < patientArray.length) {
            patientArray[index] = patient;
        }
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public boolean removePatientById(String patientId) {
        Patient p = searchPatient(patientId);
        if (p != null) {
            patients.remove(p);
            return true;
        }
        return false;
    }

    public boolean removeDoctorById(String doctorId) {
        Doctor d = searchDoctor(doctorId);
        if (d != null) {
            doctors.remove(d);
            return true;
        }
        return false;
    }

    public boolean removeAppointmentById(String appointmentId) {
        Appointment a = searchAppointmentById(appointmentId);
        if (a != null) {
            appointments.remove(a);
            return true;
        }
        return false;
    }

    public Doctor searchDoctor(String DoctorId) {
        for (Doctor d : doctors) {
            if (d.getDoctorId().equals(DoctorId)) {
                return d;
            }
        }
        return null;
    }

    public Patient searchPatient(String patientId) {
        for (Patient p : patients) {
            if (p.getPatientId().equals(patientId)) {
                return p;
            }
        }
        return null;
    }

    public Appointment searchAppointmentById(String appointmentId) {
        for (Appointment a : appointments) {
            if (a.getappointmentId().equals(appointmentId)) {
                return a;
            }
        }
        return null;
    }

    public boolean saveToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("hospital.dat"))) {
            out.writeObject(this);
            return true;
        } catch (IOException e) {
            System.out.println("Save error: " + e.getMessage());
            return false;
        }
    }

    public static HospitalSystem loadFromFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("hospital.dat"))) {
            return (HospitalSystem) in.readObject();
        } catch (Exception e) {
            System.out.println("Load error: " + e.getMessage());
            return new HospitalSystem();
        }
    }

}
