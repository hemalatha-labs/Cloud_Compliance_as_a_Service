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
@Table(name = "risk_prediction")
@Data
public class RiskPrediction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private double riskScore;

    private String riskLevel;

    private LocalDateTime predictedAt;

    private String rationale;
}