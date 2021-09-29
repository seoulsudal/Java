package com.ruby.java.ch16;

public class DrawThread extends Thread {

	Account account;

	public DrawThread(Account account) {
		this.account = account;
	}

	public void run() {
		//synchronized (account) {

			for (int i = 0; i < 10; i++) {
				account.draw(10);
				System.out.println(this.getName() + "출금 후 잔액 " + account.getBalance());
			//}
		}
	}
	
}
