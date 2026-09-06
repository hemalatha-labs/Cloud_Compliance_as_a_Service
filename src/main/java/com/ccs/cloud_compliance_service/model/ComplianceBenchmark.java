package com.ccs.cloud_compliance_service.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "compliance_benchmark")
@Data
public class ComplianceBenchmark {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String benchmarkName;

    private double expectedScore;

    private String comparisonNotes;
}