package com.firstapi.spring.learnspringframework.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrder {
	private String ponumber;
	private String plant;
	private String requisition;
	private String vendorcode;
	private String vendorname;
	private String leadbuyer;
	private String potype;
	private String povalidity;
	private String grossamount;
	private Status status;

}
