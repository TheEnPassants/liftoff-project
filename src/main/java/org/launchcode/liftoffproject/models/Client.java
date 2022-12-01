package org.launchcode.liftoffproject.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Client {
    private int id;
    private static int nextId = 1;
    @NotBlank(message= "Enter the first name")
    @Size(min=3,max=20,message = "First name must be 3-20 characters long")
    private String fName;
    @NotBlank(message= "Enter the last name")
    @Size(min=3,max=20,message = "Last name must be 3-50 characters long")
    private String lName;
    private String phone;
    private String dob;
    @NotBlank(message = "Email is required")
    @Email(message="Enter valid email address")
    private String email;
    private String note;
    public Client(String fName,String lName,String dob, String phone,String email,String note){
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
        this.dob = dob;
        this.note = note;
        this.id = nextId;
        nextId++;
    }
    public Client(){};

    public String getDob() {
        return dob;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", phone=" + phone +
                '}';
    }
}
