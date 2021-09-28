
public class TestMethodOverloading2 {

	public static void main(String[] args) {
		
		System.out.println(max(3, 4));

	}

	private static double max(int i, double j) {
		if(i > j) {
			return i;
		}
		else {
			return j;
		}
	}
	
	/*private static double max(double i, int j) {
		if(i > j) {
			return i;
		}
		else {
			return j;
		}
	}
*/
}
