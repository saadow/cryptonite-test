package com.saadow.cryptonitetest.model;

import lombok.Data;

@Data
public class SimpleRoute {
	int fromId;
	int toId;
	double distance;

	public SimpleRoute(Location locationFrom, Location locationTo) {
		this.fromId = locationFrom.getId();
		this.toId = locationTo.getId();
		this.distance = Math.sqrt((locationTo.getY() - locationFrom.getY()) * (locationTo.getY() - locationFrom.getY())
				+ (locationTo.getX() - locationFrom.getX()) * (locationTo.getX() - locationFrom.getX()));
	}

}
