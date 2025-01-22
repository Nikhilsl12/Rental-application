package com.rentalappapi.api.repositories;

import java.util.List;

 import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalappapi.api.entity.PropertyEntity;
import com.rentalappapi.api.model.PropertyRequestBody;
 
@Repository
public interface  PropertyRepository extends CrudRepository<PropertyEntity,Integer> {

	@Query(value = "select * from  satya_properties ", nativeQuery = true)
	Page<PropertyEntity> listallusersfromdb(Pageable pageable);

	@Query(value = "SELECT count(*) from satya_properties", nativeQuery = true)
	String countNumberOfProperty();
}
