import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // String용 스케너 생성
		Scanner input1 = new Scanner(System.in); // int용 스케너 생성

		String name; 	// 이름 변수 선언
		int age; 		// 나이 변수 선언
		String sex; 	// 성별 변수 선언
		String number; 	// 연락처 변수 선언
		String adress; 	// 주소 변수 선언

		System.out.println("나의 신상정보를 입력하세요.");
		System.out.println("이름 : ");
		System.out.println("나이 : ");
		System.out.println("성별 : ");
		System.out.println("연락처 : ");
		System.out.println("주소 : ");

		name = input.nextLine(); 	// 이름 스케너
		age = input1.nextInt(); 	// 나이 스케너
		sex = input.nextLine(); 	// 성별 스케너
		number = input.nextLine(); 	// 연락처 스케너
		adress = input.nextLine(); 	// 주소 스케너

		System.out.println("┌───────────────────────────────┐");
		System.out.println("│           나의 신상정보           │");
		System.out.println("│이름 : " + name + "        \t\t│");
		System.out.println("│나이 : " + age + "세        \t\t│");
		System.out.println("│성별 : " + sex + "성        \t\t│");
		System.out.println("│연락처 : " + number + "\t\t│");
		System.out.println("│주소 : " + adress + "\t│");
		System.out.println("└───────────────────────────────┘");

		input.close();

	}

}
