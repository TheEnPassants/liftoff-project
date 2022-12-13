package org.launchcode.liftoffproject.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Trainer {
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
    @NotBlank(message = "Email Address is required")
    @Email(message = "Invalid email address!")
    private String email;
    public Trainer(String fName,String lName,String phone,String email){
        this();
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
    }
    public Trainer(){
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainer trainer = (Trainer) o;
        return id == trainer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "Trainer{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", phone=" + phone +
                '}';
    }
}
