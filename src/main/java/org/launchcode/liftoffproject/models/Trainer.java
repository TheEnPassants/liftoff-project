package org.launchcode.liftoffproject.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;
@Entity
public class Trainer extends AbstractEntity{


    @NotBlank(message = "First Name is required!")
    @Size(min = 3,max = 30,message = "First Name must be 3-20 characters long!")
    private String fName;
    @NotBlank(message = "Last Name is required!")
    @Size(min = 3,max = 30,message = "Last Name must be 3-50 characters long!")
    private String lName;
    @NotBlank(message = "Phone Number is required!")
    private String phone;
    @NotBlank(message = "Email Address is required")
    @Email(message = "Invalid email address!")
    private String email;
    public Trainer(String fName,String lName,String phone,String email){

        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
    }
    public Trainer(){

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
