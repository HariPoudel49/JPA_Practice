package com.jpa.entity.embedded;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "_order")
public class Order {
	
 	@EmbeddedId
	private  OrderId orderId;
	
	
	private String orderInfo;
	
	private String anotherField;
	
}
