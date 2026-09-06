package com.ccs.cloud_compliance_service.model;

import java.time.LocalDateTime;
import java.util.UUID;

import com.ccs.cloud_compliance_service.enumeration.cloudAccountStatus;
import com.ccs.cloud_compliance_service.enumeration.cloudProvider;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="CloudAccount")
@Data

public class cloudAccountmodel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID cloudAccountId;
	
	@Enumerated
	private cloudProvider ProviderName;
	
	private String AccountAlias;
	private String CredientialisRef;
	private String Region;
	
	@Enumerated
	private cloudAccountStatus Status;
	
	private LocalDateTime ConnectedAt;
	
	

}
