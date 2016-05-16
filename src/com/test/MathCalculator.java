package com.test;

public class MathCalculator extends DistanceCalculator {
	
	public double calculateDistance(Position object1, Position object2) {
		return Math.pow(object1.x - object2.x, 2)
				+ Math.pow(object1.y - object2.y, 2);
	}
	
}