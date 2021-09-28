package com.ruby.java.ch16;

public class Work1 extends Thread {

	public Work1(){
		setName("파일 저장");
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(this.getName() + " 작업중...");
		}
	}
}
