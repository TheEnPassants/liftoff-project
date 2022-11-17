package org.launchcode.liftoffproject.models;

import java.util.Objects;

public class Appointment {
    public String name;
    public Appointment(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
