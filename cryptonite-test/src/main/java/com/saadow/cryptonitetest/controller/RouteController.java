package com.saadow.cryptonitetest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.saadow.cryptonitetest.model.Location;
import com.saadow.cryptonitetest.model.Route;
import com.saadow.cryptonitetest.model.RoutePlan;
import com.saadow.cryptonitetest.repository.RouteRepository;
import com.saadow.cryptonitetest.service.RouteService;

@RestController
public class RouteController {

	@Autowired
	private RouteService service;

	@PostMapping("/routes")
	public @ResponseBody Route addRoute(@RequestBody Route route) {
		service.insertRoute(route);
		return route;
	}

	@GetMapping("/routes")
	public @ResponseBody List<Route> getAll() {
		return service.getAllRoutes();
	}

	@GetMapping("/routes/{id}")
	public @ResponseBody Route getRouteById(@PathVariable("id") int id) {
		return service.findRouteById(id);
	}

	@DeleteMapping("/routes/{id}")
	public void removeRoute(@PathVariable("id") int id) {
		service.deleteRoute(id);
	}

	@PutMapping("/routes/{id}")
	public void updateRoute(@RequestBody Location location, @PathVariable("id") int id) {
		Route route = service.findRouteById(id);
		route.setHead(location);
		service.updateRoute(route);
	}

	@GetMapping("/routes/{id}/plan")
	public @ResponseBody RoutePlan getRoutePlan(@PathVariable("id") int id) {
		RoutePlan routePlan = new RoutePlan(service.findRouteById(id).getLocations());
		return routePlan;
	}
}
