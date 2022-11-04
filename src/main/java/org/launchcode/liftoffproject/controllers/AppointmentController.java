package org.launchcode.liftoffproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EnPassants
 */
@Controller
@RequestMapping("appointments")
public class AppointmentController {
    @GetMapping
    public String Appointments(Model model) {
        List<String> appointments = new ArrayList<>();
        appointments.add("Monday");
        appointments.add("Tuesday");
        appointments.add("Wednesday");
        appointments.add("Thursday");
        appointments.add("Friday");
        model.addAttribute("appointments", appointments);
        return "liftoffProject/appointments";
    }

}