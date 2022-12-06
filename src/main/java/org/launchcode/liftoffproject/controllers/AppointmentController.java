package org.launchcode.liftoffproject.controllers;

import org.launchcode.liftoffproject.data.AppointmentData;
import org.launchcode.liftoffproject.data.ClientData;
import org.launchcode.liftoffproject.data.TrainerData;
import org.launchcode.liftoffproject.models.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by EnPassants
 */
@Controller
@RequestMapping("appointments")
public class AppointmentController {

    @GetMapping
    public String displayAppointments(Model model) {
        model.addAttribute("title", "All Appointments");
        model.addAttribute("appointments", AppointmentData.getAll());

        return "appointments/index";
    }

    @GetMapping("create")
    public String renderAppointmentForm(Model model)
            {
                model.addAttribute("appointment",new Appointment());
                model.addAttribute("types", WorkoutType.values());
                model.addAttribute("levels", WorkoutLevel.values());
                model.addAttribute("clients", ClientData.getAll());
                model.addAttribute("trainers", TrainerData.getAll());

        return "appointments/create";
    }
    @PostMapping("create")
    public String createAppointment(@RequestParam int trainer, @RequestParam int client,@RequestParam String date,@RequestParam String time,@RequestParam WorkoutType type,@RequestParam WorkoutLevel level){

        AppointmentData.add(new Appointment(ClientData.getById(client),TrainerData.getById(trainer),date,time, type,level));

        return "redirect:";
    }
    @GetMapping("delete-appointment")
    public String displayDeleteAppointmentForm(Model model){
        model.addAttribute("title","delete-appointment");
        model.addAttribute("appointments", AppointmentData.getAll());
        return "appointments/delete-appointment";
    }

    @PostMapping("delete-appointment")
    public String deleteAppointment(@RequestParam(required = false) int [] appointmentIds){

        if(appointmentIds!= null) {
            for (int id : appointmentIds) {
                AppointmentData.remove(id);
            }
        }
        return "redirect:";
    }

}