package com.example.TeleCommunicationService.controller;

import com.example.TeleCommunicationService.entity.ActivatedPlan;
import com.example.TeleCommunicationService.entity.Payments;
import com.example.TeleCommunicationService.entity.Plans;
import com.example.TeleCommunicationService.entity.User;
import com.example.TeleCommunicationService.repository.ActivatedPlanRepo;
import com.example.TeleCommunicationService.repository.PaymentRepo;
import com.example.TeleCommunicationService.repository.PlansRepo;
import com.example.TeleCommunicationService.repository.UserRepo;
import com.example.TeleCommunicationService.service.PaymentService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PlansRepo plansRepo;

    @Autowired
    private PaymentRepo paymentRepo;

    @Autowired
    private ActivatedPlanRepo activatedPlanRepo;

    @PostMapping("AddPack/{phone}/{price}")
    public String addPack(@PathVariable Long phone,@PathVariable int price, @RequestBody Payments payments,@RequestBody ActivatedPlan activatedPlan){
        User u =userRepo.findUserByPhone(phone);
        Plans p=plansRepo.findById(price).get();
        if(u.getPhone().equals(phone) && p.getPrice()==price){
            payments.setPrice(price);
            payments.setPhone(phone);

            //Payment Done
            paymentService.addPack(payments);

            //code for Activate Plan
            Payments ph=paymentRepo.findByPhone(phone);
            activatedPlan.setUuid(ph.getUuid());

            Plans plans=plansRepo.findById(price).get();
            plans.setPrice(plans.getPrice());
            activatedPlan.setPlanTitle(plans.getPlanTitle());

            System.out.println(plans.getPlanTitle());
            activatedPlan.setValidityDays(plans.getValidityDays());

            //Activated plan
            activatedPlanRepo.save(activatedPlan);
            //System.out.println(activatedPlan.getPlanTitle());


            return "Thank You, your pack is Activated";
        }else{
            return "Something Went Wrong";
        }
    }

    @GetMapping("GetDetailsOfPayment")
    public List<Payments> getAllPaymnet(){
        return paymentService.getAllPyamentDetails();
    }

    @GetMapping("GetActivatedPlanByNumber/{phone}")
    public ActivatedPlan getActivatedPlanByNumber(@PathVariable("phone") Long phone){
        return activatedPlanRepo.findByPhone(phone);
    }
}
