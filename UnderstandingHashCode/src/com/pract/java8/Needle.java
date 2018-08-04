package com.pract.java8;

public class Needle {

	public static void main(String[] args) {
		Bound bound = ()->{
			System.out.println("Lambded");
		};
		
		bound.jump();
	}
}

@FunctionalInterface
interface Bound{
	 public void jump();
}