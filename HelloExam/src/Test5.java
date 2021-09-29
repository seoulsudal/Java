import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int age; //나이 변수선언
		
		System.out.print("나이를 입력하세요 : ");

		age = input.nextInt(); // 스케너 명령
		
		System.out.println("입력한 나이는 "+age+"살 입니다.");
	}

}
