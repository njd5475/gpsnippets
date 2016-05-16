package com.test;

public class DirectFromStackCalculator extends DistanceCalculator {
	
	public double calculateDistance(Position object1, Position object2) {
		double ox1 = object1.x;
		double oy1 = object1.y;
		double ox2 = object2.x;
		double oy2 = object2.y;

		return (ox1 - ox2) * (ox1 - ox2) + (oy1 - oy2) * (oy1 - oy2);
	}
	
}