package com.example.TeleCommunicationService.entity.temp;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Ekyc {
    private String type;
    private int idNo;
}
