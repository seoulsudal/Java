import lamda.MyfunctionalInterface;

public class MyfunctionalInterfaceTest {

	public static void main(String[] args) {

		MyfunctionalInterface fi;
		
		fi = (x, y) -> {
			// String str = "메소드 호출";
			// System.out.println(str);
			
			//int number = x * 5;
			//System.out.println(number);
			
			int res = x + y;
			return res;
		};
		// fi.method(3);
		System.out.println(fi.method(3, 4));
		
		fi = (x, y) -> {
			// System.out.println("두번째 메소드 호출");
			
			//System.out.println("결과 : " + x * 5);
			
			return x * y;
		};
			// fi.method(4);
		System.out.println("결과 : " + fi.method(5, 6));
		
		
		fi = (x, y) -> x + y;
			// System.out.println("세번쨰 메소드 호출");
			
			//System.out.println("결과 : " + x * 7);
			
		System.out.println(fi.method(7, 8));
	
		fi = (x, y) -> sum(x, y);
		
		System.out.println(fi.method(7, 7));
	}
		
	private static int sum(int x, int y) {
		return (x * y);
	}

}
