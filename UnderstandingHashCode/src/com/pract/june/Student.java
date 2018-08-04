package com.pract.june;

public class Student {
	private String regNumb;
	
	
	public Student(String regNumb) {
		super();
		this.regNumb = regNumb;
	}

	public String getregNumb() {
		return regNumb;
	}

	public void setregNumb(String regNumb) {
		regNumb = regNumb;
	}

	

	@Override
	public boolean equals(Object obj) {
		System.out.println("equls");
		return true;
	}
	

}
