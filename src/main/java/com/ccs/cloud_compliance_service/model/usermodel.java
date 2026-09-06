package com.ccs.cloud_compliance_service.model;

import java.time.LocalDateTime;
import java.util.UUID;

import com.ccs.cloud_compliance_service.enumeration.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="User")
@Data

public class usermodel {
		
		@Id
		@GeneratedValue(strategy= GenerationType.UUID)
		private UUID UserId;
		
		private String Email;
		private String FullName;
		
		@Enumerated(EnumType.STRING)
		private Role UserRole;
		
		private LocalDateTime Createdat;
			
}
