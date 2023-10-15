package com.example.TeleCommunicationService.repository;

import com.example.TeleCommunicationService.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payments,Integer> {

    public Payments findByPhone(Long phone);
}
