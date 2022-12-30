package com.threebee.starentertainment.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.threebee.starentertainment.model.LoginType;
import com.threebee.starentertainment.model.UserRole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Size(min = 3)
		@Column(length = 100, nullable = false, unique = true)
		private String username;
		
		@Column(length = 100, nullable = false)
		private String name;
		
		@Size(min = 5)
		@Column(length = 100, nullable = false)
		private String password;
		@Email
		@Column(length = 100, nullable = false)
		private String email;
		
		@Column(length = 100, nullable = false)
		private String phoneNumber;
		
		@Column(length = 100, nullable = false)
		private String birth;
		
		@OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
		@JsonIgnoreProperties("user")
		private List<AddressEntity> address;
				
		@Enumerated(EnumType.STRING)
		private UserRole role;
		
		@ManyToOne(fetch = FetchType.LAZY)
		private MembershipEntity membership;
		
		@Enumerated(EnumType.STRING)
		private LoginType loginType;
		
		@CreationTimestamp
		private Timestamp createDate;
		

		
		
		
	}

