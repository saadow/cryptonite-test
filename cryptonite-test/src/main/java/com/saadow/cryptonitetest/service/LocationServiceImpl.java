package com.saadow.cryptonitetest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saadow.cryptonitetest.model.Location;
import com.saadow.cryptonitetest.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationRepository repository;

	@Override
	public List<Location> getAllLocations() {
		return repository.findAll();
	}

	@Override
	public Location findLocationById(int id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void insertLocation(Location location) {
		repository.save(location);
	}

	@Override
	public void updateLocation(Location location) {
		repository.save(location);
	}

	@Override
	public void deleteLocation(int id) {
		repository.deleteById(id);
	}

}
