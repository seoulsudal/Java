package com.ruby.java.ch16;

public class Food extends Thread {

	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println("음식 먹기 : " + i);
		}
	}
	
}
