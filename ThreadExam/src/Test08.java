import com.ruby.java.ch16.PrintThread;

public class Test08 {

	public static void main(String[] args) {

		PrintThread t = new PrintThread();
		t.start();
		// t.interrupt();
	}

}
