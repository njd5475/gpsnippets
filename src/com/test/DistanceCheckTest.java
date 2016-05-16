package com.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class DistanceCheckTest {

	private static final int	NUMBER_OF_OBJECTS	= 12000000;

	Random										r									= new Random(System.nanoTime());

	List<DistanceCalculator>	calculators				= new LinkedList<>();

	@Before
	public void init() {
		calculators.add(new DirectFromObjectsCalculator());
		calculators.add(new DirectFromStackCalculator());
		calculators.add(new SingleDiffCalculator());
		calculators.add(new MathCalculator());
		calculators.add(new SquareRootCalculator());		
	}

	@Test
	public void testCalculatorMethods() {
		// lets generate the test data in new heap space
		List<Position[]> positions = new LinkedList<>();
		for (int i = 0; i < NUMBER_OF_OBJECTS; ++i) {
			positions.add(new Position[] { randPos(), randPos() });
		}
		
		for (DistanceCalculator calculator : calculators) {			
			long start = System.currentTimeMillis();
			
			// test the calculations
			for (Position[] posArray : positions) {
				calculator.calculateDistance(posArray[0], posArray[1]);
			}
			
			long diff = System.currentTimeMillis() - start;
			System.out.format("%d ms for %d using %s\n", diff, NUMBER_OF_OBJECTS,
					calculator.getClass().getSimpleName());
		}
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
