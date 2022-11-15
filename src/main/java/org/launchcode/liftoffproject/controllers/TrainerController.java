package org.launchcode.liftoffproject.controllers;

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
    private static List<String> trainers = new ArrayList<>();

    @GetMapping
    public String displayTrainers(Model model) {
        model.addAttribute("trainers",trainers);
        return "appointments/trainers";
    }

    @GetMapping("add-trainer")
    public String renderAppointmentForm()
    {
        return "appointments/add-trainer";
    }
    @PostMapping("add-trainer")
    public String createAppointment(@RequestParam String firstName, @RequestParam String lastName ){
        trainers.add((firstName + " " + lastName));
        return "redirect:";
    }


}
