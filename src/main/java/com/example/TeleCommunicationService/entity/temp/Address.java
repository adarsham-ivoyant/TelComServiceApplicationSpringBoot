package com.example.TeleCommunicationService.entity.temp;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {
    private String landmark;
    private String city;
    private String state;
    private String country;
    private Long pincode;
}
