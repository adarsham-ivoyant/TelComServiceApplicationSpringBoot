package com.example.TeleCommunicationService.repository;

import com.example.TeleCommunicationService.entity.Plans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlansRepo extends JpaRepository<Plans,Integer> {
}
