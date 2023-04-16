package com.micro.user.service.userService;

import com.micro.user.service.entity.Hotel;
import com.micro.user.service.entity.Rating;
import com.micro.user.service.entity.User;
import com.micro.user.service.exception.ResourceNotFoundException;
import com.micro.user.service.external.service.HotelService;
import com.micro.user.service.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private HotelService hotelService;
    @Autowired    private UserRepository userRepository;
    @Autowired    private RestTemplate restTemplate;

    @Override
    public User saveUser(User user) {
        String randomUSerId=UUID.randomUUID().toString();
        user.setUserId(randomUSerId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        // Implement Rating ServiceCALL using Rest template


        return userRepository.findAll();
    }

    @Override()
    public User getUser(String userId) {
         // get USer from databases with the help of userRepository
        User users=userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User Id not Found on Server"+userId));
         //fetch rating of the above user from RATING SERVICE
        //http://localhost:8083/ratings/user/4a6749c6-639f-4c19-a6c3-e2fcf86a499f
       Rating[] ratingOfUser= restTemplate.getForObject("http://RATING-SERVICE/ratings/user/"+users.getUserId(), Rating[].class);
        List<Rating>ratings=Arrays.stream(ratingOfUser).collect(Collectors.toList());

        List<Rating> ratingList=ratings.stream().map(rating -> {
           // api call to hotel service to get the hotel
            //http://localhost:8082/hotels/41ff8944-47cc-4da1-812c-55059190af42
             //RestTemplate Approach
            // ResponseEntity<Hotel>hotelResponse=restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/"+rating.getHotelId(), Hotel.class);
            //Hotel hotel=hotelResponse.getBody();

            //Feign Client Approach
            Hotel hotel=hotelService.getHotel(rating.getHotelId());

            //logger.info("getResponseCode",hotelResponse.getStatusCode());
            // set the hotel to rating
            rating.setHotel(hotel);
           // return the rating.
           return rating;
        }).collect(Collectors.toList());
        users.setRatings(ratingList);
        logger.info("ratingOfUser{}",ratingOfUser);
        return users;
    }
}
