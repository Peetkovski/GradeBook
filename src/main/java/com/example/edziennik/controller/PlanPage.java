package com.example.edziennik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanPage {


    @GetMapping("/plan")
    String goToPlanPage(){


        return "plan";
    }
}
