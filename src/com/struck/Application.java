package com.struck;

import java.util.List;

import com.struck.enums.FileEnum;
import com.struck.util.FileHandler;
import com.struck.util.RandomnessHandler;

public class Application {

	public static void main(String[] args) {
		int min = 1;
		int max = 10;
		System.out.println("Random number between " + min + " and " + max + ": " + RandomnessHandler.getRandomIntInRange(min, max));
		System.out.println("Number of lines in file: " + FileHandler.getNumberOfLinesFromFile(FileEnum.MALE.getName()));
		printListOfStrings(FileHandler.getLinesFromFile(FileEnum.MALE.getName()));
	}
	
	private static void printListOfStrings(List<String> list) {
		for (String line : list) {
			System.out.println(line);
		}
	}

}
