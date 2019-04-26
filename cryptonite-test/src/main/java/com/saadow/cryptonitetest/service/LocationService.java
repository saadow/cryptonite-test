package com.saadow.cryptonitetest.service;

import java.util.List;

import com.saadow.cryptonitetest.model.Location;

public interface LocationService {
	List<Location> getAllLocations();

	Location findLocationById(int id);

	void insertLocation(Location location);

	void updateLocation(Location location);

	void deleteLocation(int id);
}
