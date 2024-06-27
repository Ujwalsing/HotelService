package com.userservice.service;

import java.util.List;

import com.userservice.entity.Hotel;

public interface HotelService {

	Hotel createHotel(Hotel hotel);
	List<Hotel> getAllHotel();
	Hotel getHotelById(String id);
	
}
