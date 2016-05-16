package com.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class DistanceCheckTest {

	private static final int NUMBER_OF_OBJECTS = 100;

	Random r = new Random(System.nanoTime());

	Position	object1	= randPos();
	Position object2 = randPos();
	
	List<DistanceCalculator> calculators = new LinkedList<>();
	List<Position> positions = new LinkedList<>();
	
	@Before
	public void init() {
		calculators.add(new DirectFromObjectsCalculator());
		calculators.add(new DirectFromStackCalculator());
		calculators.add(new FromObjectsCalculator());
		calculators.add(new MathCalculator());
		calculators.add(new SquareRootCalculator());
		
		for(int i = 0; i < NUMBER_OF_OBJECTS; ++i) {
			
		}
	}
	
	@Test
	public void testCalculatorMethods() {

	}

	/**
	 * Generate a random position where x and y are anywhere in the range of 0 to
	 * max double.
	 * 
	 * @return A newly allocate random position
	 */
	public Position randPos() {
		return new Position(r.nextDouble() * Double.MAX_VALUE,
				r.nextDouble() * Double.MAX_VALUE);
	}
}
