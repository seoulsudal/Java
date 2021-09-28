
public class TestMethodOverloading {

	public static void main(String[] args) {
		
		System.out.println("3 과 4 중에 큰 정수는 "+max(3, 4)+" 이다.");
		System.out.println("3.0 과 5.4 중에 큰 실수는 "+max(3.0, 5.4)+" 이다.");
		System.out.println("3.0 과 5.4 그리고 10.14 중에 큰 실수는 "+max(3.0, 5.4, 10.14)+" 이다.");

	}

	private static double max(double i, double j, double k) {
		return max(max(i, j), k);
	}

	private static double max(double i, double j) {
		if(i > j) {
			return i;
		}
		else {
			return j;
		}
	}

	private static int max(int i, int j) {
		if(i > j) {
			return i;
		}
		else {
			return j;
		}
	}

}
