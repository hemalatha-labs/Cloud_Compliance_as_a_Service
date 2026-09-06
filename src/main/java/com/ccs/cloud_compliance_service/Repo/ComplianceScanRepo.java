package com.ccs.cloud_compliance_service.Repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccs.cloud_compliance_service.model.ComplianceScan;

public interface ComplianceScanRepo
        extends JpaRepository<ComplianceScan, UUID> {

}