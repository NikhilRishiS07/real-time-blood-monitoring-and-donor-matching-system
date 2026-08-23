package com.rtbadms.real_time_blood_availability_and_donor_matching_system;

import io.github.hackermanme.flashapi.annotation.*;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "blood_inventories")
@FlashEntity
@FlashAudit
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class BloodInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @FlashReadOnly
    private Long id;

    private Long bloodBankId;
    private String bloodGroup;
    private Integer unitsAvailable;

    @FlashReadOnly
    private LocalDateTime lastUpdated;

    @PrePersist
    @PreUpdate
    public void updateTimestamp() {
        this.lastUpdated = LocalDateTime.now();
    }
}