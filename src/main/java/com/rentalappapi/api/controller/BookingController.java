package com.rentalappapi.api.controller;

import com.rentalappapi.api.model.BookingIdRequest;
import com.rentalappapi.api.model.BookingRequestBody;
import com.rentalappapi.api.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.rentalappapi.api.service.SendEmailService;

@RestController
@CrossOrigin
public class BookingController {

    @Autowired
    private BookingService bookingService;
    
    @Autowired
    private SendEmailService sendEmailService;

    @RequestMapping(value = "/createBooking", method = RequestMethod.POST)
    public ResponseEntity<?> createBooking(@RequestBody BookingRequestBody bookingRequest) {
        return ResponseEntity.ok(bookingService.createBooking(bookingRequest));
    }
//    @RequestMapping(value = "/createBooking", method = RequestMethod.POST)
//    public ResponseEntity<String> createBooking(@RequestBody BookingRequestBody bookingRequest) {
//        // Process the booking
//        bookingService.createBooking(bookingRequest);
//
//        // Send a simple email notification
//        sendEmailService.sendEmail("youremail.com", "Booking Confirmation", 
//            "Hello,\n\nYour property has been successfully booked.\n\nThank you for using RentalApp.\n\nBest regards,\nRentalApp Team");
//
//        // Return a generic success response
//        return ResponseEntity.ok("Booking successful and email sent");
//    }





    @RequestMapping(value = "/updateBooking", method = RequestMethod.PUT)
    public ResponseEntity<?> updateBooking(@RequestBody BookingRequestBody bookingRequest) {
        return ResponseEntity.ok(bookingService.updateBooking(bookingRequest));
    }

    @RequestMapping(value = "/listAllBookings", method = RequestMethod.GET)
    public ResponseEntity<?> listAllBookings() {
        return ResponseEntity.ok(bookingService.listAllBookings());
    }

    @DeleteMapping(value="/deleteBooking")
    public ResponseEntity<?> deleteBooking(@RequestBody BookingIdRequest booking) {
        return ResponseEntity.ok(bookingService.deleteBooking(booking));
    }

    @RequestMapping(value = "/Bookingscount", method = RequestMethod.GET)
    public ResponseEntity<?> countBookings() {
        return ResponseEntity.ok(bookingService.countBookings());
    }
}