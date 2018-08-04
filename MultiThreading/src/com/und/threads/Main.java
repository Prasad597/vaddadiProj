package com.und.threads;

public class Main {
	public static void main(String[] args) {
		Student student = new Student("Prasad", 18);
		
		ThreadDemo thread1 = new ThreadDemo(student);
		ThreadDemo thread2 = new ThreadDemo(student);
		thread1.start();
		thread2.start();
	}

}
