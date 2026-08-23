package com.rtbadms.real_time_blood_availability_and_donor_matching_system;

import io.github.hackermanme.flashapi.annotation.*;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "donation_histories")
@FlashEntity
@FlashAudit
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class DonationHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @FlashReadOnly
    private Long id;

    private Long donorId;
    private Long bloodBankId;
    private LocalDate donationDate;
    private Integer unitsDonated;
}
