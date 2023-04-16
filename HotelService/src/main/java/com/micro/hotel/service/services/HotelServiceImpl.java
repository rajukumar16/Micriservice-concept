package com.micro.hotel.service.services;

import com.micro.hotel.service.entity.Hotel;
import com.micro.hotel.service.exception.ResourceNotFoundException;
import com.micro.hotel.service.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    HotelRepository repository;
    @Override
    public Hotel create(Hotel hotel) {
       String hotelId= UUID.randomUUID().toString();
        hotel.setHotelId(hotelId);
        return repository.save(hotel);
    }
    @Override
    public List<Hotel> getAll() {
        return repository.findAll();
    }
    @Override
    public Hotel getHotel(String hotelId) {
        return repository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Hotel with given Id not Found"+hotelId));
    }
}
