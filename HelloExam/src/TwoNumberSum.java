import java.util.Scanner;

public class TwoNumberSum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x; // 첫번째 수 변수 선언
		int y; // 두번째 수 변수 선언
		int sum; // 합의 변수 선언

		System.out.println("첫번째 수를 입력하세요.");
		x = input.nextInt(); // 첫번째 수 입력

		System.out.println("두번째 수를 입력하세요.");
		y = input.nextInt(); // 두번째 수 입력

		sum = x + y; // 두 수의 합

		System.out.println("두 수의 합 : " + sum);

		input.close();

	}

}
