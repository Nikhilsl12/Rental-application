package com.rentalappapi.api.controller;

import com.rentalappapi.api.entity.UserEntity;
import com.rentalappapi.api.model.BookingRequestBody;
import com.rentalappapi.api.model.LoginRequestBody;
import com.rentalappapi.api.model.UserIdRequest;
import com.rentalappapi.api.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
    private UserService userService;

    @RequestMapping(value = "/listAllUsers", method = RequestMethod.GET)
    public ResponseEntity<?> listAllUsers() {
        return ResponseEntity.ok(userService.listAllUsers());
    }
    
    @RequestMapping(value = "/listUser", method = RequestMethod.PUT)
    public ResponseEntity<?> listUser(@RequestBody LoginRequestBody loginRequest) {
        return ResponseEntity.ok(userService.listUser(loginRequest));
    }
    
    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteUser(@RequestBody UserIdRequest user) throws Exception {
		return ResponseEntity.ok(userService.deleteUser(user));
	}
    
    
    @RequestMapping(value ="/addUser", method=RequestMethod.POST)
    public ResponseEntity<?> addUser(@RequestBody UserEntity user){
    	return ResponseEntity.ok(userService.addUser(user));
    }

}
