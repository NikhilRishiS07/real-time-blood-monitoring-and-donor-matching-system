package com.rtbadms.real_time_blood_availability_and_donor_matching_system;

import io.github.hackermanme.flashapi.annotation.*;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "emergency_requests")
@FlashEntity(softDelete = true)
@FlashAudit
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class EmergencyRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @FlashReadOnly
    private Long id;

    private Long hospitalId;
    private String requiredBloodGroup;
    private Integer unitsRequested;
    private String urgencyLevel; // "LOW", "MEDIUM", "HIGH", "CRITICAL"
    private String status;       // "PENDING", "MATCHING", "FULFILLED", "CANCELLED"

    @FlashReadOnly
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }
}