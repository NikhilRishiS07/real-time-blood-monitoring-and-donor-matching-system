package com.rtbadms.real_time_blood_availability_and_donor_matching_system;

import io.github.hackermanme.flashapi.annotation.*;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "donors")
@FlashEntity(softDelete = true)
@FlashAudit(trackFields = true)
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @FlashReadOnly
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String bloodGroup; // e.g., "O_NEG", "A_POS"
    private Double latitude;
    private Double longitude;
    private LocalDate lastDonationDate;
    private Boolean isAvailable;
    private Double healthStatusIndex; // Score between 0.0 and 1.0 used in Fuzzy Logic

    @FlashReadOnly
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }
}