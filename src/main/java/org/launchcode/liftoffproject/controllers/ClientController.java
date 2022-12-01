package org.launchcode.liftoffproject.controllers;

import org.launchcode.liftoffproject.data.ClientData;
import org.launchcode.liftoffproject.models.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequestMapping("clients")
public class ClientController {


    @GetMapping
    public String displayClients(Model model) {
        model.addAttribute("clients", ClientData.getAll());
        return "appointments/clients";
    }

    @GetMapping("add-client")
    public String renderClientForm(Model model)
    {
        model.addAttribute("title","Add Client");
        model.addAttribute(new Client());
        return "appointments/add-client";
    }
    @PostMapping("add-client")
    public String addClient(@ModelAttribute @Valid Client newClient, Errors errors,Model model ){
        if(errors.hasErrors()){
            model.addAttribute("title", "Add Client");
            return "appointments/add-client";
        }
        ClientData.add(newClient);
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
