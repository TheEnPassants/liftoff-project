package org.launchcode.liftoffproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("clients")
public class ClientController {
    @GetMapping
    public String Clients(Model model) {

        return "liftoffProject/clients";
    }
}
