package org.launchcode.liftoffproject.controllers;

import org.launchcode.liftoffproject.data.ClientRepository;
import org.launchcode.liftoffproject.data.TrainerData;
import org.launchcode.liftoffproject.data.TrainerRepository;
import org.launchcode.liftoffproject.models.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("trainers")
public class TrainerController {
    @Autowired
    private TrainerRepository trainerRepository;

    @GetMapping
    public String displayTrainers(Model model) {
        model.addAttribute("trainers", trainerRepository.findAll());
        return "appointments/trainers";
    }

    @GetMapping("add-trainer")
    public String renderAppointmentForm(Model model)
    {
        model.addAttribute(new Trainer());

        return "appointments/add-trainer";
    }
    @PostMapping("add-trainer")
    public String addTrainer(@ModelAttribute @Valid Trainer newTrainer, Errors errors, Model model){
        if(errors.hasErrors()){
            model.addAttribute("title", "Add Trainer");
            return "appointments/add-trainer";
        }

        trainerRepository.save(newTrainer);
        TrainerData.add(newTrainer);

        return "redirect:";
    }

    @GetMapping("delete-trainer")
    public String displayDeleteClientForm(Model model){
        model.addAttribute("title","delete-trainer");
        model.addAttribute("trainers", trainerRepository.findAll());
        return "appointments/delete-trainer";
    }

    @PostMapping("delete-trainer")
    public String deleteClient(@RequestParam(required = false) int [] trainerIds){

        if(trainerIds != null) {
            for (int id : trainerIds) {
                trainerRepository.deleteById(id);
            }
        }
        return "redirect:";
    }
}
