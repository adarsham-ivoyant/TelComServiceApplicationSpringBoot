package com.example.TeleCommunicationService.service;

import com.example.TeleCommunicationService.entity.Payments;

import java.util.List;

public interface PaymentService {

    public Payments addPack(Payments payments);

    public List<Payments> getAllPyamentDetails();
}
