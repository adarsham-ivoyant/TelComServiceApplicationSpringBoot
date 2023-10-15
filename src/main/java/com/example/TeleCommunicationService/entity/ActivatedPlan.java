package com.example.TeleCommunicationService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Activated_Plan")
public class ActivatedPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int activatedId;
    private int uuid;
    private int price;
    private Long phone;
    private String planTitle;
    private int validityDays;
    private Date planActivatedAt;
    private String status="RechargeActivated";

    @PrePersist
    private void onCreate(){
        planActivatedAt=new Date();
    }

}
