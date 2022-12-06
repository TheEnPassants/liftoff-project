package org.launchcode.liftoffproject.data;

import org.launchcode.liftoffproject.models.Client;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClientData {
    // store all clients
    private static final Map<Integer, Client> clients = new HashMap<>();
    // add client
    public static void add(Client client){
        clients.put(client.getId(),client);
    }
    // get single client
    public static Client getById(int id){
        return clients.get(id);
    }
    // get all clients
    public static Collection<Client> getAll(){
        return clients.values();
    }
    // remove client
    public static void remove(int id){
        clients.remove(id);
    }
}
