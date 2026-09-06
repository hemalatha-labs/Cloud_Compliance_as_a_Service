package com.ccs.cloud_compliance_service.model;

import java.time.LocalDateTime;
import java.util.UUID;

import com.ccs.cloud_compliance_service.enumeration.SubscriptionPlan;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Subscription")
@Data
public class subscriptionmodel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID SubscriptionId;
	
	@Enumerated
	private SubscriptionPlan Plan;
	
	private int maxCloudAccounts;

	private int maxScansPerMonth;

	private LocalDateTime startDate;

	private LocalDateTime expiryDate;
	
	

}
