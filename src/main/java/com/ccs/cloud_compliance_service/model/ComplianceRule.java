package com.ccs.cloud_compliance_service.model;

import java.util.UUID;

import com.ccs.cloud_compliance_service.enumeration.ViolationSeverity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "compliance_rule")
@Data
public class ComplianceRule {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String ruleCode;

    private String description;

    private String resourceType;

    private String evaluationLogic;

    @Enumerated(EnumType.STRING)
    private ViolationSeverity defaultSeverity;

    private boolean active;
}