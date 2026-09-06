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
@Table(name = "threat_intelligence")
@Data
public class ThreatIntelligence {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String sourceName;

    private String indicator;

    private String severity;

    private LocalDateTime updatedAt;
}