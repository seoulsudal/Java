
public class Test {

	public static void main(String[] args) {
		try {
			String s = new String("JAVA");
			int len = s.length();
			s = null;
			s.length();
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("OK");
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("잘못된 배열의 인뎃스 사용!");
		} catch (NullPointerException e2) {
			System.out.println("잘못된 참조!");
		}
		System.out.println("GOOD");
	}

}
