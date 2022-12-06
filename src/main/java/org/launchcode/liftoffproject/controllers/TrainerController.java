package org.launchcode.liftoffproject.controllers;

import org.launchcode.liftoffproject.data.TrainerData;
import org.launchcode.liftoffproject.models.Trainer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("trainers")
public class TrainerController {


    @GetMapping
    public String displayTrainers(Model model) {
        model.addAttribute("trainers", TrainerData.getAll());
        return "appointments/trainers";
    }

    @GetMapping("add-trainer")
    public String renderAppointmentForm(Model model)
    {
        model.addAttribute(new Trainer());

        return "appointments/add-trainer";
    }
    @PostMapping("add-trainer")
    public String addTrainer(@ModelAttribute Trainer newTrainer){
        TrainerData.add(newTrainer);
        System.out.println(TrainerData.getAll());
        return "redirect:";
    }

    @GetMapping("delete-trainer")
    public String displayDeleteClientForm(Model model){
        model.addAttribute("title","delete-trainer");
        model.addAttribute("trainers", TrainerData.getAll());
        return "appointments/delete-trainer";
    }

    @PostMapping("delete-trainer")
    public String deleteClient(@RequestParam(required = false) int [] trainerIds){

        if(trainerIds != null) {
            for (int id : trainerIds) {
                TrainerData.remove(id);
            }
        }
        return "redirect:";
    }
}
