package com.example.TeleCommunicationService.controller;

import com.example.TeleCommunicationService.entity.Plans;
import com.example.TeleCommunicationService.service.PlansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlansController {

    @Autowired
    private PlansService plansService;
    @PostMapping("addPlans")
    public String addPlans(@RequestBody Plans plans){
        plansService.addPlans(plans);
        return "Plans added successfully";
    }

    @GetMapping("GetAllPlans")
    public List<Plans> getAllPlans(){
        return plansService.viewAllPlans();
    }

    @GetMapping("GetPlanByPrice/{price}")
    public Plans getPlanByPrice(@PathVariable("price") int price){
        return plansService.getPlanByPrice(price);
    }
}
