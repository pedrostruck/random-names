package com.struck.util;

import java.util.Random;

public class RandomnessHandler {

	private final static Random random = new Random();

	public static int getRandomIntInRange(int min, int max) {
		return random.nextInt((max - min) + 1);
	}
}
