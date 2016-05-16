package com.test;

public class DirectFromObjectsCalculator extends DistanceCalculator {
	
	public double calculateDistance(Position object1, Position object2) {
		return (object1.x - object2.x) * (object1.x - object2.x)
				+ (object1.y - object2.y) * (object1.y - object2.y);

	}
	
}