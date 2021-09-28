package com.ruby.java.ch16;

public class Phone extends Thread {

	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println("전화 받기 : " + i);
		}
	}
	
}
