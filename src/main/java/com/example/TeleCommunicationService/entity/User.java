package com.example.TeleCommunicationService.entity;

import com.example.TeleCommunicationService.entity.temp.Address;
import com.example.TeleCommunicationService.entity.temp.Ekyc;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_info")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String email;
    private Long phone;
    private String name;
    private String dob;
    @Embedded
    private Address address;
    @Embedded
    private Ekyc ekyc;

}
