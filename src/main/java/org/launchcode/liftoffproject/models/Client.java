package org.launchcode.liftoffproject.models;


import java.util.Date;

public class Client {
    public String fName;
    public String lName;
    public String phone;
    public String dob;
    public String note;
    public Client(String fName,String lName,String note, String phone, String dob){
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.dob = dob;
        this.note = note;
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
