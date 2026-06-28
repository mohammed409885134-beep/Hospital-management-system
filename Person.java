//Student Name: Mohammed Nadil Hamed
//Student ID : 1320230587
package Final_Project;

import java.io.Serializable; 

public abstract class Person implements Serializable{

    private String identityNumber;
    private String name;
    private String gender;
    private String phone;
    private String address;

    public Person() {
    }

    public Person(String identityNumber, String name, String gender, String phone, String address) {
        this.identityNumber = identityNumber;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public abstract String printDetails();

    public String getIdentityNumber() {
        return identityNumber;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "identityNumber=" + identityNumber + ", name=" + name + ", gender=" + gender + ", phone=" + phone + ", address=" + address + '}';
    }

}
