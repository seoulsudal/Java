package com.ruby.java.ch16;

public class Work2 extends Thread {

	public Work2() {
		setName("서버 연결");
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.err.println(this.getName()+" 작업중...");
		}
	}
}
