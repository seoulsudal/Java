package com.ruby.java.ch16;

public class ProductAdd implements Runnable {

	Pool pool;
	
	public ProductAdd(Pool pool) {
		this.pool = pool;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			pool.add("상품 " + i);
		}
	}

}
