package com.ccs.cloud_compliance_service.model;

import java.time.LocalDateTime;
import java.util.UUID;

import com.ccs.cloud_compliance_service.enumeration.industryType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Tenant")
@Data
public class tenantmodel {
	
	@Id
	@GeneratedValue(strategy= GenerationType.UUID)
	private UUID tenantId;
	
	private String tenantName;
	
	@Enumerated(EnumType.STRING)
	private industryType industry;
	
	private LocalDateTime createdAt;
	
	private Boolean active;

}
