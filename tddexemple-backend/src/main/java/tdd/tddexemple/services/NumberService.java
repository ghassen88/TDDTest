package tdd.tddexemple.services;

import tdd.tddexemple.exceptions.InvalidListException;

public class NumberService {

	public int biggestNumber(int[] list) {

		if (list == null)
			throw new InvalidListException("la liste ne peut pas etre null");

		int index = 0;
		int max = Integer.MIN_VALUE;

		for (index = 0; index < list.length; index++) {

			if (list[index] > max) {
				max = list[index];
			}

		}

		return max;
	}

}
