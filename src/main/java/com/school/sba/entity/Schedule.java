package com.school.sba.entity;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Schedule {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int schudleId;
	private LocalTime opensAt;
	private LocalTime closeAt;
	private int classHoursPerDay;
	private LocalTime classHourPerLength;
	private LocalTime breaktime;
	private LocalTime breakLength;
	private LocalTime lunchTime;
	private LocalTime lunchLength;
	
	
	
}
