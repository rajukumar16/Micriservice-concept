package com.micro.hotel.service.services;

import com.micro.hotel.service.entity.Hotel;

import java.util.List;

public interface HotelService {

    // create
    Hotel create(Hotel hotel);

    //GetAll
    List<Hotel>getAll();

    //getSingle
    Hotel getHotel(String hotelId);
}
