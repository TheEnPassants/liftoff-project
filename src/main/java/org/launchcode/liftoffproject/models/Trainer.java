package org.launchcode.liftoffproject.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Trainer {
    private int id;
    private static int nextId = 1;
    @NotBlank
    @Size(min=3,max=20,message = "First name must be 3-20 characters long")
    private String fName;
    @NotBlank
    @Size(min=3,max=50,message = "First name must be 3-50 characters long")
    private String lName;
    private String phone;
    @NotBlank(message = "Email is required")
    @Email(message="Enter valid email address")
    private String email;
    public Trainer(String fName,String lName,String phone,String email){
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
        this.id = nextId;
        nextId++;

    }
    public Trainer(){};

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
