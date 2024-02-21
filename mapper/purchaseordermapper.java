package com.firstapi.spring.learnspringframework.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.firstapi.spring.learnspringframework.dto.PurchaseOrderDto;
import com.firstapi.spring.learnspringframework.entity.PurchaseOrder;
@Mapper
public interface purchaseordermapper {

	purchaseordermapper INSTANCE = Mappers.getMapper(purchaseordermapper.class);

	abstract PurchaseOrderDto toDTO(PurchaseOrder PurchaseOrder);
}