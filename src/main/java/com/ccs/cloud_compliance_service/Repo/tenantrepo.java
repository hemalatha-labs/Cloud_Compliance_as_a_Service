package com.ccs.cloud_compliance_service.Repo;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ccs.cloud_compliance_service.model.tenantmodel;

public interface tenantrepo extends JpaRepository<tenantmodel, UUID> {

}
