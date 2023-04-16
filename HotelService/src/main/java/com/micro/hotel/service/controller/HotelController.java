package com.micro.hotel.service.controller;

import com.micro.hotel.service.entity.Hotel;
import com.micro.hotel.service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    // create
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel>getHotelById(@PathVariable String hotelId){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotel(hotelId));
    }

    @GetMapping
    public ResponseEntity<List<Hotel>>getAll(){
        List<Hotel>allHotel= hotelService.getAll();
        return ResponseEntity.ok(allHotel);
    }

}
