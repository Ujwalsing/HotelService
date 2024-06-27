package com.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userservice.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
