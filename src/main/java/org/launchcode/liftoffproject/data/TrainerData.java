package org.launchcode.liftoffproject.data;

import org.launchcode.liftoffproject.models.Client;
import org.launchcode.liftoffproject.models.Trainer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TrainerData {
    // store all clients
    private static final Map<Integer, Trainer> trainers = new HashMap<>();
    // add client
    public static void add(Trainer trainer){
        trainers.put(trainer.getId(),trainer);
    }
    // get single client
    public static Trainer getById(int id){
        return trainers.get(id);
    }
    // get all clients
    public static Collection<Trainer> getAll(){
        return trainers.values();
    }
    // remove client
    public static void remove(int id){
        trainers.remove(id);
    }
}
