package org.launchcode.liftoffproject.controllers;

import org.launchcode.liftoffproject.data.*;
import org.launchcode.liftoffproject.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by EnPassants
 */
@Controller
@RequestMapping("appointments")
public class AppointmentController {

    @Autowired
    AppointmentRepository appointmentRepository;
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    TrainerRepository trainerRepository;

    public List<Appointment> findAllByDate() {
        List<Appointment> apps = new ArrayList<>();
        appointmentRepository.findAll().forEach(apps::add);
       apps.sort((o1,o2) -> o1.getDate().compareTo(o2.getDate()));
        return apps;
    }

    @GetMapping
    public String displayAppointments(Model model) {
        model.addAttribute("title", "All Appointments");
        model.addAttribute("appointments", findAllByDate());


        return "appointments/index";
    }

    @GetMapping("create")
    public String renderAppointmentForm(Model model)
            {
                model.addAttribute("appointment",new Appointment());
                model.addAttribute("types", WorkoutType.values());
                model.addAttribute("levels", WorkoutLevel.values());
                model.addAttribute("clients", clientRepository.findAll());
                model.addAttribute("trainers", trainerRepository.findAll());

        return "appointments/create";
    }
    @PostMapping("create")
    public String createAppointment(@RequestParam int trainer, @RequestParam int client, @RequestParam(value = "date",required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date, @RequestParam String time, @RequestParam WorkoutType type, @RequestParam WorkoutLevel level){


        appointmentRepository.save(new Appointment(clientRepository.findById(client).get(),trainerRepository.findById(trainer).get(),date,time, type,level));

        return "redirect:";
    }
    @GetMapping("delete-appointment")
    public String displayDeleteAppointmentForm(Model model){
        model.addAttribute("title","delete-appointment");
        model.addAttribute("appointments", appointmentRepository.findAll());
        return "appointments/delete-appointment";
    }

    @PostMapping("delete-appointment")
    public String deleteAppointment(@RequestParam(required = false) int [] appointmentIds){

        if(appointmentIds!= null) {
            for (int id : appointmentIds) {
                appointmentRepository.deleteById(id);
            }
        }
        return "redirect:";
    }

}