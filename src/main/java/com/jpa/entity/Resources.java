package com.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Resources {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private Long size;
	
	private String url;
	
	@OneToOne
	@JoinColumn(name = "lecture_id")
	private Lecture lecture;
}
