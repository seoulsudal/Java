
public class MyScoreTest {

	public static void main(String[] args) {

		MyScore obj = new MyScore();
		try {
			obj.setScore(-10);
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
