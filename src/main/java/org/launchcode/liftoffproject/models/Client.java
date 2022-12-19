package org.launchcode.liftoffproject.models;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;


import static java.time.temporal.WeekFields.ISO;
@Entity
public class Client extends AbstractEntity {


    @NotBlank(message = "First Name is required!")
    @Size(min = 3,max = 30,message = "First Name must be 3-20 characters long!")
    private String fName;
    @NotBlank(message = "Last Name is required!")
    @Size(min = 3,max = 30,message = "Last Name must be 3-50 characters long!")
    private String lName;
    @NotBlank(message = "Phone Number is required!")
    private String phone;

@OneToMany(mappedBy = "client")
    private final List<Appointment>appointments = new ArrayList<>();

    private Date date;
    @NotBlank(message = "Email Address is required!")
    @Email(message = "Invalid email address!")
    private String email;
    @Size(max = 100,message = "Note can not exceed 100 characters")
    private String note;
    public Client(String fName,String lName,Date date,String phone,String email,String note){

        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
        this.date = date;
        this.note = note;

    }


    public List<Appointment> getAppointments() {
        return appointments;
    }

    public Client(){


    }

    public Date getDate() {
        return date;
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

    public void setDate(Date dob) {
        this.date = dob;
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
