package com.example.TeleCommunicationService.repository;

import com.example.TeleCommunicationService.entity.ActivatedPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivatedPlanRepo extends JpaRepository<ActivatedPlan,Integer> {
    public ActivatedPlan findByPhone(Long phone);

}
