package com.rtbadms.real_time_blood_availability_and_donor_matching_system;

import io.github.hackermanme.flashapi.annotation.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "blood_banks")
@FlashEntity
@FlashAudit
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class BloodBank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @FlashReadOnly
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String licenseNumber;

    private Double latitude;
    private Double longitude;
    private String contactNumber;
}
