package org.launchcode.liftoffproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("workouts")
public class WorkoutController {
    @GetMapping
    public String Workouts(Model model) {

        return "appointments/workouts";
    }
}
