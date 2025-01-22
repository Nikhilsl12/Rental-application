package com.rentalappapi.api.repositories;

import com.rentalappapi.api.entity.BookingEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends CrudRepository<BookingEntity, Integer> {

	
	
    @Query(value = "SELECT count(*) FROM krishnendu_bookings", nativeQuery = true)
    int countBookings();
}