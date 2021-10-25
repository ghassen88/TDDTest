package tdd.tddexemple.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import tdd.tddexemple.exceptions.InvalidListException;

class TestNumberService {

	@Test
	void testBiggestNumber() {

		NumberService numberService = new NumberService();

		int[] list = new int[] { 7, 9, 4, 2, 25, 24 };

		int biggest = numberService.biggestNumber(list);

		assertEquals(25, biggest);

		int[] list2 = new int[] { 1, 2, 3 };

		int biggest1 = numberService.biggestNumber(list2);

		assertEquals(3, biggest1);

	}

	@Test
	void testBiggestNumberWithNegativeValues() {

		NumberService numberService = new NumberService();

		int[] list = new int[] { -7, -8, -9 };

		int biggest = numberService.biggestNumber(list);

		assertEquals(-7, biggest);

		int[] list2 = new int[] { -8, -7, -9 };

		int biggest2 = numberService.biggestNumber(list2);

		assertEquals(-7, biggest2);

		int[] list3 = new int[] { -9, -8, -7 };

		int biggest3 = numberService.biggestNumber(list3);

		assertEquals(-7, biggest3);

	}

	@Test
	void testBiggestNumberWithOneValue() {

		NumberService numberService = new NumberService();

		int[] list = new int[] { 24 };

		int biggest = numberService.biggestNumber(list);

		assertEquals(24, biggest);
	}

	@Test
	void testBiggestNumberWithDuplicateValues() {

		NumberService numberService = new NumberService();

		int[] list = new int[] { 24, 24, 25, 26, 26 };

		int biggest = numberService.biggestNumber(list);

		assertEquals(26, biggest);
	}

	@Test
	void testBiggestNumberWithNullValues() {
		Assertions.assertThrows(InvalidListException.class, () -> {

			NumberService numberService = new NumberService();

			numberService.biggestNumber(null);

		});
	}

}
