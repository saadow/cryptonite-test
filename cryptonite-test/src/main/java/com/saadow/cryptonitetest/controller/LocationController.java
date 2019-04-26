package com.saadow.cryptonitetest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.saadow.cryptonitetest.model.Location;
import com.saadow.cryptonitetest.repository.LocationRepository;
import com.saadow.cryptonitetest.service.LocationService;

@RestController
@RequestMapping("/locations")
public class LocationController {

	@Autowired
	private LocationService service;
	
	@PostMapping
	public Location addLocation(@RequestBody Location location) {
		service.insertLocation(location);
		return location;
	}

	@GetMapping
	public List<Location> getAll() {
		return service.getAllLocations();
	}

	@GetMapping("/{id}")
	public @ResponseBody Location getLocationById(@PathVariable("id") int id) {
		return service.findLocationById(id);
	}

	@DeleteMapping("/{id}")
	public void removeLocation(@PathVariable("id") int id) {
		service.deleteLocation(id);
	}

	@PutMapping("/{id}")
	public void updateLocation(@RequestBody Location updLocation, @PathVariable("id") int id) {
		Location location = service.findLocationById(id);
		location.setName(updLocation.getName());
		location.setX(updLocation.getX());
		location.setY(updLocation.getY());
		location.setHead(updLocation.isHead());
		service.updateLocation(location);
	}
}
