package com.example.TeleCommunicationService.service;

import com.example.TeleCommunicationService.entity.Plans;
import com.example.TeleCommunicationService.repository.PlansRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlansServiceImpl implements PlansService{

    @Autowired
    private PlansRepo plansRepo;
    @Override
    public Plans addPlans(Plans plans) {
        return plansRepo.save(plans);
    }

    @Override
    public List<Plans> viewAllPlans() {
        return plansRepo.findAll();
    }

    @Override
    public Plans getPlanByPrice(int price) {
        return plansRepo.findById(price).get();
    }
}
