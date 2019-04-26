package com.saadow.cryptonitetest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saadow.cryptonitetest.model.Route;
import com.saadow.cryptonitetest.repository.RouteRepository;

@Service
public class RouteServiceImpl implements RouteService {

	@Autowired
	RouteRepository repository;

	@Override
	public List<Route> getAllRoutes() {
		return repository.findAll();
	}

	@Override
	public Route findRouteById(int id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void insertRoute(Route route) {
		repository.save(route);
	}

	@Override
	public void updateRoute(Route route) {
		repository.save(route);
	}

	@Override
	public void deleteRoute(int id) {
		repository.deleteById(id);
	}

}
