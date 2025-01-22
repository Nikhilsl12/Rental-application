package com.rentalappapi.api.service;

import com.rentalappapi.api.entity.BookingEntity;
import com.rentalappapi.api.entity.UserEntity;
import com.rentalappapi.api.model.BookingIdRequest;
import com.rentalappapi.api.model.BookingRequestBody;
import com.rentalappapi.api.model.LoginRequestBody;
import com.rentalappapi.api.model.UserIdRequest;
import com.rentalappapi.api.repositories.BookingRepository;
import com.rentalappapi.api.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

//    public BookingEntity createBooking(BookingRequestBody requestBody) {
//        BookingEntity booking = new BookingEntity();
//        booking.setPropertyId(requestBody.getPropertyId());
//        booking.setRenterId(requestBody.getRenterId());
//        booking.setCheckInDate(requestBody.getCheckInDate());
//        booking.setCheckOutDate(requestBody.getCheckOutDate());
//        booking.setTotalPrice(requestBody.getTotalPrice());
//        booking.setBookingStatus(requestBody.getBookingStatus());
//        booking.setBookingDate(requestBody.getBookingDate());
//        return bookingRepository.save(booking);
//    }
//
//    public BookingEntity updateBooking(BookingRequestBody requestBody) {
//    	BookingEntity booking = new BookingEntity();
//    	booking.setBookingId(requestBody.getBookingId());
//    	booking.setPropertyId(requestBody.getPropertyId());
//        booking.setRenterId(requestBody.getRenterId());
//        booking.setCheckInDate(requestBody.getCheckInDate());
//        booking.setCheckOutDate(requestBody.getCheckOutDate());
//        booking.setTotalPrice(requestBody.getTotalPrice());
//        booking.setBookingStatus(requestBody.getBookingStatus());
//        booking.setBookingDate(requestBody.getBookingDate());
//        return bookingRepository.save(booking);
//    }

    public Iterable<UserEntity> listAllUsers() {
        return userRepository.findAll();
    }
    
    public UserEntity listUser(LoginRequestBody loginRequestBody) {
    	Iterable<UserEntity> allUsers = userRepository.findAll();
    	String email = loginRequestBody.getEmail();
    	for (UserEntity user : allUsers) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
    	return null;
    }
    public String deleteUser(UserIdRequest user) {
		int userId= user.getUserId();
		userRepository.deleteById(userId);
		return "Tenant Deleted With Id "+userId;
	}
    
    public UserEntity addUser(UserEntity userAdd) {
		Iterable<UserEntity> allUsers = userRepository.findAll();
    	String email = userAdd.getEmail();
    	for (UserEntity user : allUsers) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
    	return userRepository.save(userAdd);
	}

//    public String deleteBooking(BookingIdRequest booking) {
//    	int bookingId= booking.getBookingId();
//		bookingRepository.deleteById(bookingId);
//		return "Property Deleted With Id: "+bookingId;
//    }
//
//
//    public int countBookings() {
//        return bookingRepository.countBookings();
//    }
}