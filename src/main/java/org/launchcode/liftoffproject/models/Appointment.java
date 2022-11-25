package org.launchcode.liftoffproject.models;
import java.util.Date;
import java.util.Objects;

public class Appointment {
    private int id;
    private static int nextId = 1;
    private Client client;
    private Trainer trainer;
    private Date date;
    private Date time;
    public Appointment(Trainer trainer,Client client,Date date, Date time) {


        this.client = client;
        this.trainer = trainer;
        this.date = date;
        this.time = time;
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

        public Date getDate () {
            return date;
        }

        public void setDate (Date date){
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

    public Date getTime () {
            return time;
        }

        public void setTime (Date time){
            this.time = time;
        }

    }
