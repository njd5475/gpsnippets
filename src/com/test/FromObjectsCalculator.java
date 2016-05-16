package com.test;

public class FromObjectsCalculator extends DistanceCalculator {

	public double calculateDistance(Position object1, Position object2) {
		double diffX = object1.x - object2.x;
		double diffY = object1.y - object2.y;
		return diffX * diffX + diffY * diffY;
	}
	
}