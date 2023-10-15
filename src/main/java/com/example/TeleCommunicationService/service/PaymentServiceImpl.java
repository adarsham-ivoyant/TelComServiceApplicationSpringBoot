package com.example.TeleCommunicationService.service;

import com.example.TeleCommunicationService.entity.Payments;
import com.example.TeleCommunicationService.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentRepo paymentRepo;
    @Override
    public Payments addPack(Payments payments) {
        return paymentRepo.save(payments);
    }

    @Override
    public List<Payments> getAllPyamentDetails() {
        return paymentRepo.findAll();
    }

}
