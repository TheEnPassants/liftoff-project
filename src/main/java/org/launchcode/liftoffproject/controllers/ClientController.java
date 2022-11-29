package org.launchcode.liftoffproject.controllers;

import org.launchcode.liftoffproject.data.ClientData;
import org.launchcode.liftoffproject.models.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("clients")
public class ClientController {


    @GetMapping
    public String displayClients(Model model) {
        model.addAttribute("clients", ClientData.getAll());
        return "appointments/clients";
    }

    @GetMapping("add-client")
    public String renderClientForm()
    {
        return "appointments/add-client";
    }
    @PostMapping("add-client")
    public String addClient(@RequestParam String fName,@RequestParam String lName,@RequestParam String dob,@RequestParam String phone,@RequestParam String email,@RequestParam String note  ){
        ClientData.add(( new Client(fName,lName,dob,phone,email,note)));
        return "redirect:";
    }

    @GetMapping("delete-client")
    public String displayDeleteClientForm(Model model){
        model.addAttribute("title","delete-client");
        model.addAttribute("clients",ClientData.getAll());
        return "appointments/delete-client";
    }

    @PostMapping("delete-client")
    public String deleteClient(@RequestParam(required = false) int [] clientIds){

        if(clientIds != null) {
            for (int id : clientIds) {
                ClientData.remove(id);
            }
        }
       return "redirect:";
    }

}
