package org.launchcode.liftoffproject.models;


import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Client {
    private int id;
    private static int nextId = 1;

    @NotBlank(message = "First Name is required!")
    @Size(min = 3,max = 30,message = "First Name must be 3-30 characters long!")
    private String fName;
    @NotBlank(message = "Last Name is required!")
    @Size(min = 3,max = 30,message = "Last Name must be 3-30 characters long!")
    private String lName;
    @NotBlank(message = "Phone Number is required!")
    private String phone;
    @NotBlank(message = "Date of Birth is required!")
    private String dob;
    @NotBlank(message = "Email Address is required!")
    @Email(message = "Invalid email address!")
    private String email;
    @Size(max = 100,message = "Note can not exceed 100 characters")
    private String note;
    public Client(String fName,String lName,String dob,String phone,String email,String note){
        this();
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
        this.dob = dob;
        this.note = note;

    }
    public Client(){
        this.id = nextId;
        nextId++;
    }

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
