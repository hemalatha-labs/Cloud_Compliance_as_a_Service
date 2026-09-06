package com.ccs.cloud_compliance_service.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "compliance_scan")
@Data
public class ComplianceScan {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String status;

    private LocalDateTime startedAt;

    private LocalDateTime completedAt;

    private String triggeredBy;
}