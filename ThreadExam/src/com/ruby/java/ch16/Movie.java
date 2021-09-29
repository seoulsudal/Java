package com.ruby.java.ch16;

public class Movie implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println("영화 보기 : " + i);
		}
	}

}
