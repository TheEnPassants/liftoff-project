package org.launchcode.liftoffproject.controllers;

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

    private static List<Client> clients = new ArrayList<>();
    @GetMapping
    public String displayClients(Model model) {
        model.addAttribute("clients",clients);
        return "appointments/clients";
    }

    @GetMapping("add-client")
    public String renderAppointmentForm()
    {
        return "appointments/add-client";
    }
    @PostMapping("add-client")
    public String createAppointment(@RequestParam String fName,@RequestParam String lName, @RequestParam String note ,@RequestParam String phone,@RequestParam String dob ){
        clients.add(( new Client(fName,lName,note,phone,dob)));
        return "redirect:";
    }



}
