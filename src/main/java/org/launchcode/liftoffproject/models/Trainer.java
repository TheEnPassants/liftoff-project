package org.launchcode.liftoffproject.models;

import java.util.Objects;

public class Trainer {
    private int id;
    private static int nextId = 1;
    private String fName;
    private String lName;
    private String phone;
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
