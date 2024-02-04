package com.jpa.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = " secitons")
public class Section extends BaseEntity{
	

	private String name;
	
	private String sectionOrder;
	
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course courses;
	
	@OneToMany(mappedBy = "section")
	private List<Lecture> lectures;
}
