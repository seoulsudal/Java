import java.util.Scanner;

public class KeyboardInput1 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		String s; // 변수 선언

		System.out.println("몇 번째 프로그램인지 입력하세요 : ");
		s = stdIn.next(); // 변수 입력
		System.out.println(s + "번째로 작성해 보는 자바 프로그램 입니다.");

	}

}
