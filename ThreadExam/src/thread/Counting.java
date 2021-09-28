package thread;

public class Counting implements Runnable {
	
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}

}
