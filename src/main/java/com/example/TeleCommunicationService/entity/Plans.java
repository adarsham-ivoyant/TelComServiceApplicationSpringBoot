package com.example.TeleCommunicationService.entity;

import com.example.TeleCommunicationService.entity.enums.Internet;
import com.example.TeleCommunicationService.entity.enums.Messages;
import com.example.TeleCommunicationService.entity.enums.TalkTime;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "plans_info")
public class Plans {
    @Id
    private int price;
    private String planTitle;
    private String description;
    private int validityDays;
    @Enumerated(EnumType.STRING)
    private TalkTime talkTime;
    @Enumerated(EnumType.STRING)
    private Messages messages;
    @Enumerated(EnumType.STRING)
    private Internet internet;
}
