package com.example.TeleCommunicationService.entity;

import com.example.TeleCommunicationService.entity.enums.PaymentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Payment")
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int uuid;
    private Long phone;
    private int price;
    private String status="PaymentDone";
    private Date paymentDoneAt;
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @PrePersist
    private void onCreate(){
        paymentDoneAt=new Date();
    }
}
