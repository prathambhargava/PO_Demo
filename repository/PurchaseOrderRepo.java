package com.firstapi.spring.learnspringframework.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstapi.spring.learnspringframework.entity.PurchaseOrder;

public interface PurchaseOrderRepo
		extends
			JpaRepository<PurchaseOrder, String> {

	// @Query("SELECT p.po_number, p.plant, p... from ... .. JOIN ...... ",
	// nativeQuery = true)
	// public List<PurchaseOrder> getPurchaseOrders();

}
