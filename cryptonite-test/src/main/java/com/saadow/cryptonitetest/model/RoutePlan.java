package com.saadow.cryptonitetest.model;

import java.util.List;

import lombok.Data;


/* Route plan consists of Simple Routes and total distance value
 * 
 * "route": [
    {
      "from": 1,
      "to": 2,
      "distance": 10
    },
    .
    .
    .
  ],
  "total_distance": 100.1
 */

@Data
public class RoutePlan {
	private List<SimpleRoute> simpleRouteList;
	private double totalDistance;

	public RoutePlan(List<Location> locations) {
		for (int i = 0; i < locations.size() - 1; i++) {
			this.simpleRouteList.add(new SimpleRoute(locations.get(i), locations.get(i + 1)));
			this.totalDistance += simpleRouteList.get(i).distance;
		}
	}
}
