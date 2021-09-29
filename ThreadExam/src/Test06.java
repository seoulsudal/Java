import com.ruby.java.ch16.Pool;
import com.ruby.java.ch16.ProductAdd;
import com.ruby.java.ch16.ProductGet;

public class Test06 {

	public static void main(String[] args) {

		Pool pool = new Pool();
		
		Thread productGet = new Thread(new ProductGet(pool));
		Thread productadd = new Thread(new ProductAdd(pool));
		
		productGet.start();
		productadd.start();
		
	}

}
