package com.micro.rating.service.repository;

import com.micro.rating.service.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating,String> {

    // custom finder methods
    List<Rating>findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
}
