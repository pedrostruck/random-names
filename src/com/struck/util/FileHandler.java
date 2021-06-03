package com.struck.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
	
	public static List<String> getLinesFromFile(String filename) {
		List<String> lines = new ArrayList<>();
		try {
			BufferedReader br = getBufferedReaderForFile(filename);
			String line;
			while ((line = br.readLine()) != null) {
				lines.add(line.trim());
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
	
	public static int getNumberOfLinesFromFile(String filename) {
		int numberOfLines = 0;
		try {
			BufferedReader br = getBufferedReaderForFile(filename);
			while (br.readLine() != null) {
				numberOfLines++;
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return numberOfLines;
	}
	
	private static BufferedReader getBufferedReaderForFile(String filename) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filename)), "UTF8"));
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			e.printStackTrace();
		}
		return br;
	}
	
}
