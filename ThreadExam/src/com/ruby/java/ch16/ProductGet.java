package com.ruby.java.ch16;

public class ProductGet implements Runnable {

	Pool pool;
	
	
	public ProductGet(Pool pool) {
		this.pool = pool;
	}

	@Override
	public void run() {
		try {
			for(int i = 1; i <= 10; i++) {
				pool.get();
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
