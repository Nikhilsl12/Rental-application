package com.rentalappapi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rentalappapi.api.model.TenantIdRequest;
import com.rentalappapi.api.model.TenantRequestBody;
import com.rentalappapi.api.service.PropertyService;
import com.rentalappapi.api.service.TenantService;
import com.rentalappapi.api.entity.TenantEntity;

@RestController
@CrossOrigin
public class TenantController {
	
	@Autowired
	private TenantService TenantService;	
	
	@RequestMapping(value = "/createTenant", method = RequestMethod.POST)
	public ResponseEntity<?> createProperty(@RequestBody TenantRequestBody TenantReqBody) throws Exception {
		return ResponseEntity.ok(TenantService.createTenant(TenantReqBody));
	}
	
	@RequestMapping(value = "/updateTenant", method = RequestMethod.PUT)
	public ResponseEntity<?> updateProperty(@RequestBody TenantRequestBody TenantReqBody) throws Exception {
		return ResponseEntity.ok(TenantService.updateTenant(TenantReqBody));
	}		
	
	@RequestMapping(value = "/listAllTenants", method = RequestMethod.GET)
	public ResponseEntity<?> listAllTenants(@RequestParam(defaultValue = "0") final Integer pageNumber,
			@RequestParam(defaultValue = "10") final Integer size) throws Exception {
		return ResponseEntity.ok(TenantService.listallusersfromdb(pageNumber, size));
	}		
	
	@RequestMapping(value = "/deleteTenant", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteProperty(@RequestBody TenantIdRequest user) throws Exception {
		return ResponseEntity.ok(TenantService.deleteTenant(user));
	}		
	
	@RequestMapping(value = "/Tenantscount", method = RequestMethod.GET)
	public ResponseEntity<?> countNumberOfProperties() throws Exception {
		return ResponseEntity.ok((TenantService.countNumberOfTenants()));
	}
//	
}
