package com.saadow.cryptonitetest.service;

import java.util.List;

import com.saadow.cryptonitetest.model.Route;

public interface RouteService {
	List<Route> getAllRoutes();

	Route findRouteById(int id);

	void insertRoute(Route route);

	void updateRoute(Route route);

	void deleteRoute(int id);
}
