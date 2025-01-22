package com.rentalappapi.api.service;

import com.rentalappapi.api.entity.PropertyEntity;
import com.rentalappapi.api.entity.TenantEntity;
import com.rentalappapi.api.model.PropertyIdRequest;
import com.rentalappapi.api.model.PropertyRequestBody;
import com.rentalappapi.api.model.TenantIdRequest;
import com.rentalappapi.api.model.TenantRequestBody;
import com.rentalappapi.api.repositories.PropertyRepository;
import com.rentalappapi.api.repositories.TenantRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

@Service
public class TenantService  {

	@Autowired
	private TenantRepository TenantRepository;

	

	public TenantEntity createTenant(TenantRequestBody TenantRequestBodyObj) {

		TenantEntity newTenant = new TenantEntity();
		newTenant.setFirstName(TenantRequestBodyObj.getFirstName());
		newTenant.setLastName(TenantRequestBodyObj.getLastName());
		newTenant.setEmailId(TenantRequestBodyObj.getEmailId());
		newTenant.setPhoneNumber(TenantRequestBodyObj.getPhoneNumber());
		newTenant.setStatus(TenantRequestBodyObj.getStatus());
		
		return TenantRepository.save(newTenant);		 
	}

	public TenantEntity updateTenant(TenantRequestBody TenantRequestBodyObj) {

		TenantEntity newTenant = new TenantEntity();
		newTenant.setTenantId(TenantRequestBodyObj.getTenantId());
		newTenant.setFirstName(TenantRequestBodyObj.getFirstName());
		newTenant.setLastName(TenantRequestBodyObj.getLastName());
		newTenant.setEmailId(TenantRequestBodyObj.getEmailId());
		newTenant.setPhoneNumber(TenantRequestBodyObj.getPhoneNumber());
		newTenant.setStatus(TenantRequestBodyObj.getStatus());
		
		return TenantRepository.save(newTenant);	
	}

	public Page<TenantEntity> listallusersfromdb(int pageNumber, int size) {
		Pageable pageable = PageRequest.of(pageNumber, size);
		return TenantRepository.listallusersfromdb(pageable);
	}
 
	public String deleteTenant(TenantIdRequest user) {
		int tenantId= user.getTenantId();
		TenantRepository.deleteById(tenantId);
		return "Tenant Deleted With Id "+tenantId;
	}

	public String countNumberOfTenants() {

		return TenantRepository.countNumberOfTenants();
	}

}
