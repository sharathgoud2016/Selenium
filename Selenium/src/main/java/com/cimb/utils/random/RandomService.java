package com.cimb.utils.random;

import java.util.concurrent.ThreadLocalRandom;

public class RandomService {

	public int generateRandomNumber(int digits) {

		if (digits >= 1) {
			int min = (int) Math.pow(10, digits - 1);
			int max = (int) Math.pow(10, digits);

			return generateRandomNumber(min, max);
		} else
			throw new RuntimeException("length must be more than 1");

	}

	public int generateRandomNumber(int min, int maxExclusive) {
		return ThreadLocalRandom.current().ints(min, maxExclusive).findFirst().getAsInt();
	}

	public int getRandomIndex(int size) {
		return ThreadLocalRandom.current().nextInt(size);
	}

	public <T> T getRandomValue(T[] list) {
		int rand = ThreadLocalRandom.current().nextInt(list.length);

		return list[rand];
	}
}
