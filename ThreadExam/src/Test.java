import thread.Counting;

public class Test {

	public static void main(String[] args) {

		Counting c1 = new Counting();
		Counting c = new Counting();
		Thread t1 = new Thread(c1);
		Thread t = new Thread(c);
		
		t.start();
		t1.start();
		
	}

}
