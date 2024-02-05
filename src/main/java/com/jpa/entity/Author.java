package com.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

@Entity
@Table(name = "author_tbl")
public class Author extends BaseEntity{
	
	@Column(name = "f_name")
	private String firstName;
	
	@Column(name = "l_name")
	private String lastName;
	
	private String age;
	
	@Column(
			unique = true,
			nullable = false
	)
	private String email;
	
	@ManyToMany(mappedBy = "authors")
	private List<Course> cours;
	
}
