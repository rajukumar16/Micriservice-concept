package com.micro.rating.service.services;

import com.micro.rating.service.entity.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingServices {

    // Create RatingService
    Rating create(Rating rating);
    //GetAll Rating

    List<Rating>getAllRating();

    //GetAll by UserId
    List<Rating>getRatingByUserId(String userId);

    //GetAll By Hotel
    List<Rating>getRatingByHotelId(String hotelId);
}
