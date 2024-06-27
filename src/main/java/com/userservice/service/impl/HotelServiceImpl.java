package com.userservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.userservice.entity.Hotel;
import com.userservice.repository.HotelRepository;
import com.userservice.service.HotelService;

import lombok.AllArgsConstructor;

@AllArgsConstructor

@Service
public class HotelServiceImpl implements HotelService{
	private final HotelRepository hotelRepos;
	
	@Override
	public Hotel createHotel(Hotel hotel) {
		return hotelRepos.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		return hotelRepos.findAll();
	}

	@Override
	public Hotel getHotelById(String id) {
		return hotelRepos.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));
	}

}
