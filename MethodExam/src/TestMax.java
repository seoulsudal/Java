
public class TestMax {

	public static void main(String[] args) {
		// 변수 선언
		int i = 5;
		int j = 2;
		int k = maxing(i, j);
		// 결과 출력
		System.out.println(i+"와 "+j+" 중에 큰 값은 "+k+" 이다.");
	}
	// 메소드 선언
	public static int maxing(int num1, int num2) {
		int result;
		if(num1 > num2) {
			result = num1;
		}
		else {
			result = num2;
		}
		return result;
	}
}
