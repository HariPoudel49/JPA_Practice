package com.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Lecture {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "section_id")
	private Section section;
	
	@OneToOne
	@JoinColumn(name = "resources_id")
	
	private Resources resources;
}
