import com.ruby.java.ch16.Account;
import com.ruby.java.ch16.DrawThread;

public class Test05 {

	public static void main(String[] args) {

		Account account = new Account();
		DrawThread t1 = new DrawThread(account);
		DrawThread t2 = new DrawThread(account);
		
		t1.start();
		t2.start();
		
	}

}
