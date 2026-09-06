package com.ccs.cloud_compliance_service.model;

import java.time.LocalDateTime;
import java.util.UUID;

import com.ccs.cloud_compliance_service.enumeration.ViolationSeverity;
import com.ccs.cloud_compliance_service.enumeration.ViolationStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "violation")
@Data
public class Violation {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private ViolationSeverity severity;

    @Enumerated(EnumType.STRING)
    private ViolationStatus status;

    private LocalDateTime detectedAt;

    private String details;
}