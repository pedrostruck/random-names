package com.struck;

import com.struck.enums.FileEnum;
import com.struck.util.FileHandler;

public class Application {

	public static void main(String[] args) {
		System.out.println("Number of lines in file: " + FileHandler.getNumberOfLinesFromFile(FileEnum.MALE.getName()));
		for (String line : FileHandler.getLinesFromFile(FileEnum.MALE.getName())) {
			System.out.println(line);
		}
	}

}
