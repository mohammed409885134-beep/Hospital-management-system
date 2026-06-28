//Student Name: Mohammed Nadil Hamed
//Student ID : 1320230587
package Final_Project;

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HospitalSystem system = HospitalSystem.loadFromFile();

        int choice;

        do {
            System.out.println("\n===== Hospital System =====");
            System.out.println("1) Add Patient");
            System.out.println("2) Add Doctor");
            System.out.println("3) Add Appointment");
            System.out.println("4) Search Patient");
            System.out.println("5) Search Doctor");
            System.out.println("6) Remove Patient");
            System.out.println("7) Remove Doctor");
            System.out.println("8) Remove Appointment");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            choice = in.nextInt();
            in.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Patient ID: ");
                    String pid = in.nextLine();

                    System.out.print("Identity Number: ");
                    String identity = in.nextLine();

                    System.out.print("Name: ");
                    String name = in.nextLine();

                    System.out.print("Gender: ");
                    String gender = in.nextLine();

                    System.out.print("Phone: ");
                    String phone = in.nextLine();

                    System.out.print("Address: ");
                    String address = in.nextLine();

                    System.out.print("Disease: ");
                    String disease = in.nextLine();

                    System.out.print("Admission Date: ");
                    String date = in.nextLine();

                    System.out.print("Bill: ");
                    double bill = in.nextDouble();
                    in.nextLine();

                    Patient p = new Patient(
                            pid, disease, date, bill,
                            identity, name, gender, phone, address
                    );

                    system.addPatient(p);
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    System.out.print("Doctor ID: ");
                    String did = in.nextLine();

                    System.out.print("Identity Number: ");
                    String dIdentity = in.nextLine();

                    System.out.print("Name: ");
                    String dName = in.nextLine();

                    System.out.print("Gender: ");
                    String dGender = in.nextLine();

                    System.out.print("Phone: ");
                    String dPhone = in.nextLine();

                    System.out.print("Address: ");
                    String dAddress = in.nextLine();

                    System.out.print("Specialization: ");
                    String spec = in.nextLine();

                    System.out.print("Salary: ");
                    double salary = in.nextDouble();

                    System.out.print("Years of Experience: ");
                    int exp = in.nextInt();
                    in.nextLine();

                    Doctor d = new Doctor(
                            did, spec, salary, exp,
                            dIdentity, dName, dGender, dPhone, dAddress
                    );

                    system.addDoctor(d);
                    System.out.println("Doctor added successfully!");
                    break;

                case 3:
                    System.out.print("Appointment ID: ");
                    String aid = in.nextLine();

                    System.out.print("Patient ID: ");
                    String apPid = in.nextLine();

                    System.out.print("Doctor ID: ");
                    String apDid = in.nextLine();

                    Patient foundP = system.searchPatient(apPid);
                    Doctor foundD = system.searchDoctor(apDid);

                    if (foundP == null || foundD == null) {
                        System.out.println("Patient or Doctor not found!");
                        break;
                    }

                    System.out.print("Date: ");
                    String apDate = in.nextLine();

                    System.out.print("Room Number: ");
                    int room = in.nextInt();
                    in.nextLine();

                    Appointment a = new Appointment(
                            aid, foundP, foundD, apDate, room
                    );

                    system.addAppointment(a);
                    System.out.println("Appointment added!");
                    break;

                case 4:
                    System.out.print("Enter Patient ID: ");
                    Patient sp = system.searchPatient(in.nextLine());
                    if (sp != null) {
                        System.out.println(sp.printDetails());
                    } else {
                        System.out.println("Patient not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Doctor ID: ");
                    Doctor sd = system.searchDoctor(in.nextLine());
                    if (sd != null) {
                        System.out.println(sd.printDetails());
                    } else {
                        System.out.println("Doctor not found!");
                    }
                    break;

                case 6:
                    System.out.print("Enter Patient ID to remove: ");
                    if (system.removePatientById(in.nextLine())) {
                        System.out.println("Removed successfully!");
                    } else {
                        System.out.println("Patient not found!");
                    }
                    break;

                case 7:
                    System.out.print("Enter Doctor ID to remove: ");
                    if (system.removeDoctorById(in.nextLine())) {
                        System.out.println("Removed successfully!");
                    } else {
                        System.out.println("Doctor not found!");
                    }
                    break;

                case 8:
                    System.out.print("Enter Appointment ID to remove: ");
                    if (system.removeAppointmentById(in.nextLine())) {
                        System.out.println("Removed successfully!");
                    } else {
                        System.out.println("Appointment not found!");
                    }
                    break;

                case 0:
                    system.saveToFile();
                    System.out.println("Data saved. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        in.close();
    }
}
