package org.launchcode.liftoffproject.controllers;

import org.launchcode.liftoffproject.models.Appointment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EnPassants
 */
@Controller
@RequestMapping("appointments")
public class AppointmentController {
    private static List<Appointment> appointments = new ArrayList<>();
    @GetMapping
    public String displayAppointments(Model model) {
        model.addAttribute("appointments",appointments);
        return "appointments/index";
    }

    @GetMapping("create")
    public String renderAppointmentForm()
            {
        return "appointments/create";
    }
    @PostMapping("create")
    public String createAppointment(@RequestParam String trainerName){
        appointments.add(new Appointment(trainerName));
        return "redirect:";
    }

}