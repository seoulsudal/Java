import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); //스케너 동작
		Scanner input1 = new Scanner(System.in); //스케너 동작

		String name;		// 이름 변수 선언
		int schoolYear;		// 학년 변수 선언
		int classNumber;	// 반 변수 선언
		int number;			// 번호 변수 선언
		int korean; 		// 국어 변수 선언
		int english; 		// 영어 변수 선언
		int mathematics; 	// 수학 변수 선언
		int sum; 			// 총점 변수 선언
		double average; 	// 평균 변수 선언

		System.out.println("이름을 입력하세요.");
		name = input1.nextLine();		// 이름 받기
		
		System.out.println("학년을 입력하세요.");
		schoolYear = input.nextInt();	// 학년 받기
		
		System.out.println("반을 입력하세요.");
		classNumber = input.nextInt();	// 반 받기
		
		System.out.println("번호를 입력하세요.");
		number = input.nextInt();		// 번호 받기
		
		System.out.println("국어 점수를 입력하세요.");
		korean = input.nextInt(); 		// 국어 점수 받기

		System.out.println("영어 점수를 입력하세요.");
		english = input.nextInt(); 		// 영어 점수 받기

		System.out.println("수학 점수를 입력하세요.");
		mathematics = input.nextInt(); 	// 수학 점수 받기

		sum = korean + english + mathematics; 	// 총점 계산
		average = sum / 3.0; 					// 평균 계산

		System.out.println(schoolYear+"학년 "+classNumber+"반 "+number+"번 "+name+"님의 점수 입니다.");
		System.out.print("총점은 " + sum + "점, ");
		System.out.printf("평균은 %.0f점 입니다.", average); // 소수점 표기하기

	}

}
