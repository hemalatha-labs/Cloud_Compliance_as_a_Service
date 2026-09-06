package com.ccs.cloud_compliance_service.model;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "cloud_resource")
@Data
public class CloudResource {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String resourceType;

    private String resourceArn;

    private String region;

    private String configuration;

    @ElementCollection
    private Map<String, String> tags;

    private LocalDateTime discoveredAt;
}