import com.ruby.java.ch16.Movie;

public class Test02 {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Movie());
		Thread t2 = new Thread(() -> {
			for(int i = 1; i <= 1000; i++) {
				System.out.println("전화 받기 : " + i);
			}
		});
		
		t1.start();
		t2.start();
		for(int i = 1; i <= 1000; i++) {
			System.out.println("TV 보기 : " + i);
		}
	}

}
