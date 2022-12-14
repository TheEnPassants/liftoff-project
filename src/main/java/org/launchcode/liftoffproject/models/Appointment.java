package org.launchcode.liftoffproject.models;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Objects;
@Entity
public class Appointment extends AbstractEntity {
    @ManyToOne
    private Client client;
    @ManyToOne
    private Trainer trainer;
    private String date;
    private String time;
    private WorkoutLevel level;
    private WorkoutType type;

    public WorkoutLevel getLevel() {
        return level;
    }

    public void setLevel(WorkoutLevel level) {
        this.level = level;
    }


    public Appointment(Client client, Trainer trainer, String date, String time, WorkoutType type, WorkoutLevel level) {


        this.client = client;
        this.trainer = trainer;
        this.date = date;
        this.time = time;
        this.level = level;
        this.type = type;


    }

    public Appointment() {

    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public WorkoutType getType() {
        return type;
    }

    public void setType(WorkoutType type) {
        this.type = type;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

