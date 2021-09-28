package com.ruby.java.ch16;

import java.util.ArrayList;
import java.util.List;

public class Pool {

	List<String> products = new ArrayList<>();
	
	public synchronized void get() throws InterruptedException{
		if(products.size() == 0) {
			wait();
		}
		products.remove(0);
		System.out.println("소비 / 재고 = " + products.size());
	}
	
	public synchronized void add(String value) {
		products.add(value);
		System.out.println("생산 / 재고 = " + products.size());
		notifyAll();
	}
	
}
