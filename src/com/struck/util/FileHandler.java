package com.struck.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
	
	public static List<String> getLinesFromFile(String filename) {
		List<String> lines = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(new File(filename)), "UTF8"));
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
	
}
