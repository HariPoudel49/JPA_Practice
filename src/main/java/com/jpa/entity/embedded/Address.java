package com.jpa.entity.embedded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	
	private String streetName;
	
	private String hosueNumber;
	
	private String zipCode;
}
