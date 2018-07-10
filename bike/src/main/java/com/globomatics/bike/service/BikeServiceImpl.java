package com.globomatics.bike.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositories.BikeRepository;

@Service
public class BikeServiceImpl implements BikeService {
	
	@Autowired
	private  BikeRepository bikeRepository;


	@Override
	public List<Bike> getBikes() {
		// TODO Auto-generated method stub
		return bikeRepository.findAll();
	}


	@Override
	public List<Bike> l() {
		
		return bikeRepository.l();
	}

}
