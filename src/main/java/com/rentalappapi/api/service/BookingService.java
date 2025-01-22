package com.rentalappapi.api.service;

import com.rentalappapi.api.entity.BookingEntity;
import com.rentalappapi.api.model.BookingIdRequest;
import com.rentalappapi.api.model.BookingRequestBody;
import com.rentalappapi.api.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public BookingEntity createBooking(BookingRequestBody requestBody) {
        BookingEntity booking = new BookingEntity();
        booking.setPropertyId(requestBody.getPropertyId());
        booking.setRenterId(requestBody.getRenterId());
        booking.setCheckInDate(requestBody.getCheckInDate());
        booking.setCheckOutDate(requestBody.getCheckOutDate());
        booking.setTotalPrice(requestBody.getTotalPrice());
        booking.setBookingStatus(requestBody.getBookingStatus());
        booking.setBookingDate(requestBody.getBookingDate());
        return bookingRepository.save(booking);
    }

    public BookingEntity updateBooking(BookingRequestBody requestBody) {
    	BookingEntity booking = new BookingEntity();
    	booking.setBookingId(requestBody.getBookingId());
    	booking.setPropertyId(requestBody.getPropertyId());
        booking.setRenterId(requestBody.getRenterId());
        booking.setCheckInDate(requestBody.getCheckInDate());
        booking.setCheckOutDate(requestBody.getCheckOutDate());
        booking.setTotalPrice(requestBody.getTotalPrice());
        booking.setBookingStatus(requestBody.getBookingStatus());
        booking.setBookingDate(requestBody.getBookingDate());
        return bookingRepository.save(booking);
    }

    public Iterable<BookingEntity> listAllBookings() {
        return bookingRepository.findAll();
    }

    public String deleteBooking(BookingIdRequest booking) {
    	int bookingId= booking.getBookingId();
		bookingRepository.deleteById(bookingId);
		return "Property Deleted With Id: "+bookingId;
    }


    public int countBookings() {
        return bookingRepository.countBookings();
    }
}