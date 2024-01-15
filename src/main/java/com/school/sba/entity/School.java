package com.school.sba.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class School {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int schoolId; 
	private String schoolName;
	private String contactNo;
	private String emailId;
	private String address;
	

}
