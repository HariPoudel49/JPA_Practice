package com.jpa.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "coursed")
public class Course extends BaseEntity {
	
	private String name;
	
	private String description;
	
	@ManyToMany
	@JoinTable(
			name = "authors_courses",
			joinColumns = {
					@JoinColumn(name = "course_id")
			},
			inverseJoinColumns = {
					@JoinColumn(name = "auhtor_id")
			}
	)
	private List<Author> authors;
	
	@OneToMany(mappedBy = "courses")
	
	private List<Section> sections;
}
