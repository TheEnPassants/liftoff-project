package org.launchcode.liftoffproject.models;

import java.util.Objects;

public class Appointment {
    private int id;
    private static int nextId = 1;
    private Client client;
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



    public Appointment(Client client,Trainer trainer,  String date, String time, WorkoutType type, WorkoutLevel level) {

        this();
        this.client = client;
        this.trainer = trainer;
        this.date = date;
        this.time = time;
        this.level = level;
        this.type = type;


    }
    public Appointment(){
        this.id =nextId;
        nextId ++;
    }


    public int getId() {
        return id;
    }

    public Client getClient () {
            return client;
        }

        public void setClient (Client client){
            this.client = client;
        }

        public Trainer getTrainer () {
            return trainer;
        }

        public void setTrainer (Trainer trainer){
            this.trainer = trainer;
        }

        public String getDate () {
            return date;
        }

        public void setDate (String date){
            this.date = date;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return id == that.id ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getTime () {
            return time;
        }

        public void setTime (String time){
            this.time = time;
        }
    public WorkoutType getType() {
        return type;
    }

    public void setType(WorkoutType type) {
        this.type = type;
    }

    }
