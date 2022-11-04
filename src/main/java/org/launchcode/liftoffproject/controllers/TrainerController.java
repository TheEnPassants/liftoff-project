package org.launchcode.liftoffproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("trainers")
public class TrainerController {
    @GetMapping
    public String ListOfTrainers(Model model) {

        return "liftoffProject/trainers";
    }
}
