package com.struck.enums;

public enum FileEnum {

	MALE("resources/male-names.txt"),
	FEMALE("resources/female-names.txt"),
	SURNAME("resources/surnames.txt");
		
	private String fileName;

	FileEnum(String fileName) {
		this.fileName = fileName;
	}

	public String getName() {
		return fileName;
	}

}
