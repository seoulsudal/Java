import com.ruby.java.ch16.Food;
import com.ruby.java.ch16.Phone;

public class Test01 {

	public static void main(String[] args) {
		
		Food work1 = new Food();
		Phone work2 = new Phone();
		
		work1.start();
		work2.start();
		
		for(int i = 1; i <= 1000; i++) {
			System.out.println("TV 보기 : " + i);
		}

	}

}
