package com.und.threads;

public class ThreadDemo extends Thread {
	private Student crazyStudent;
	
	ThreadDemo(Student student){
		crazyStudent = student;
	}
	@Override
	public void run() {
		System.out.println("i dnnt know what i will do here , wait for few days");
	}
	
	

}
