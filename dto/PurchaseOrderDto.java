package com.firstapi.spring.learnspringframework.dto;

import com.firstapi.spring.learnspringframework.entity.Status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PurchaseOrderDto {

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
