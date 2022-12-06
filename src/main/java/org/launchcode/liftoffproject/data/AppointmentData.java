package org.launchcode.liftoffproject.data;

import org.launchcode.liftoffproject.models.Appointment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AppointmentData {
    // store all clients
    private static final Map<Integer, Appointment> appointments = new HashMap<>();

    public static void add(Appointment appointment){
        appointments.put(appointment.getId(),appointment);
    }

    public static Appointment getById(int id){
        return appointments.get(id);
    }

    public static Collection<Appointment> getAll(){
        return appointments.values();
    }

    public static void remove(int id){
        appointments.remove(id);
    }
}
