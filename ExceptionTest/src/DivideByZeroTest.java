
public class DivideByZeroTest {

	public static void main(String[] args) {
		int x = 200;
		int y = 0;
		try {
			int result = x / y;
			System.out.println("result : " + result);
		} catch (Exception e) {
			System.out.println("오류 발생");
			System.out.println();
			System.out.println(e.getMessage());
			System.out.println();
			e.printStackTrace();
			System.out.println();
		}
		System.out.println("try/catch 통과");
	}

}
