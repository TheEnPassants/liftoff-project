package org.launchcode.liftoffproject.controllers;

import org.launchcode.liftoffproject.data.TrainerData;
import org.launchcode.liftoffproject.models.Trainer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("trainers")
public class TrainerController {


    @GetMapping
    public String displayTrainers(Model model) {
        model.addAttribute("trainers", TrainerData.getAll());
        return "appointments/trainers";
    }

    @GetMapping("add-trainer")
    public String renderAppointmentForm()
    {
        return "appointments/add-trainer";
    }
    @PostMapping("add-trainer")
    public String addTrainer(@RequestParam String fName, @RequestParam String lName, @RequestParam String phone,  @RequestParam String email ){
        TrainerData.add((new Trainer(fName,lName,phone,email)));
        return "redirect:";
    }


}
