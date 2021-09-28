
public class ArrayTest {

	public static void main(String[] args) {
		
		int x = 1;
		int[] y = new int[10];
		
		arrayTest(x, y);
		
		System.out.println("x : "+x);
		System.out.println("y[0] : "+y[0]);

	}

	private static void arrayTest(int x, int[] y) {
		System.out.println("number : "+x);
		x = 100;
		y[0] = 777; 
		
	}

}
