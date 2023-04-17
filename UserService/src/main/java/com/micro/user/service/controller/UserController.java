package com.micro.user.service.controller;

import com.micro.user.service.entity.User;
import com.micro.user.service.userService.UserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    // Create
    @PostMapping
    public ResponseEntity<User>createUser(@RequestBody User user){
       User user1= userService.saveUser(user);
       return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping("/{userId}")
    @CircuitBreaker(name="ratingHotelBreaker",fallbackMethod = "ratingHotelFallback")
    public ResponseEntity<User>getSingleUser(@PathVariable String userId){
        User user=userService.getUser(userId);
        return  ResponseEntity.ok(user);
    }
    @GetMapping
    public ResponseEntity<List<User>>getAllUser(){
       List<User>allUser= userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }
    //Create fall back method for ratingHotelBreaker
    public ResponseEntity<User>ratingHotelFallback(String userId,Exception ex){
        logger.info("fallback is executed because service is down",ex.getMessage());
        User user=User.builder().email("rajukumar.sjce@gmail.com").
                name("Raju").
                about("This User is created to inform when Some Services is Down").
                userId("RAJU-SAH").
                build();
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
}
