package com.firstapi.spring.learnspringframework.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstapi.spring.learnspringframework.entity.PurchaseOrder;
import com.firstapi.spring.learnspringframework.repository.PurchaseOrderRepo;

@RestController
@RequestMapping
public class PurchaseOrderController {

	PurchaseOrderRepo purchaseOrderRepo;

	@GetMapping("/all")
	public List<PurchaseOrder> getAllPurchaseOrders() {
		return purchaseOrderRepo.findAll();
		// return purchaseOrderRepo.getPurchaseOrders();
	}
}
