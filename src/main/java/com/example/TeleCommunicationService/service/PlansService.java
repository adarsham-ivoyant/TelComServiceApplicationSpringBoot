package com.example.TeleCommunicationService.service;

import com.example.TeleCommunicationService.entity.Plans;

import java.util.List;

public interface PlansService {
    public Plans addPlans(Plans plans);

    public List<Plans> viewAllPlans();

    public Plans getPlanByPrice(int price);
}
