package org.launchcode.liftoffproject.controllers;

import org.launchcode.liftoffproject.data.ClientData;
import org.launchcode.liftoffproject.data.ClientRepository;
import org.launchcode.liftoffproject.models.Client;
import org.launchcode.liftoffproject.models.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Controller
@RequestMapping("clients")
public class ClientController {
@Autowired
private ClientRepository clientRepository;

    @GetMapping
    public String displayClients(Model model) {
        model.addAttribute("clients", clientRepository.findAll());
        return "appointments/clients";
    }

    @GetMapping("add-client")
    public String renderClientForm(Model model)

    {
        model.addAttribute("title", "Add Client");
        model.addAttribute("client",new Client());
        return "appointments/add-client";
    }
    @PostMapping("add-client")
    public String addClient(@RequestParam(value = "date",required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)  Date date,
                            @RequestParam String fName,
                            @RequestParam String lName,
                            @RequestParam String email,
                            @RequestParam String phone,
                            @RequestParam String note
    ){


        Client newClient = new Client(fName,lName,date,phone,email,note);
        clientRepository.save(newClient);
        ClientData.add(newClient);
        return "redirect:";
    }

    @GetMapping("delete-client")
    public String displayDeleteClientForm(Model model){
        model.addAttribute("title","delete-client");
        model.addAttribute("clients",clientRepository.findAll());
        return "appointments/delete-client";
    }

    @PostMapping("delete-client")
    public String deleteClient(@RequestParam(required = false) int [] clientIds){

        if(clientIds != null) {
            for (int id : clientIds) {
                clientRepository.deleteById(id);
            }
        }
        return "redirect:";
    }

}