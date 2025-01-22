package com.rentalappapi.api.repositories;

import java.util.List;

 import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.rentalappapi.api.entity.TenantEntity;
import com.rentalappapi.api.model.PropertyRequestBody;
 
@Repository
public interface  TenantRepository extends CrudRepository<TenantEntity,Integer> {

	@Query(value = "select * from krishnendu_tenants", nativeQuery = true)
	Page<TenantEntity> listallusersfromdb(Pageable pageable);

	@Query(value = "SELECT count(*) from krishnendu_tenants", nativeQuery = true)
	String countNumberOfTenants();



}
