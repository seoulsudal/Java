import java.util.Scanner;

public class Test47 {

	public static void main(String[] args) {
		
		// 스캐너 입력
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int score;		// 점수
		int temp;		// 임의 변수
		char grades;	// 학점
		
		// 점수 입력
		System.out.println("점수를 입력하세요.(0~100)");
		score = input.nextInt();
		
		// 점수로 스위치 체크용 변환
		temp = score / 10;
		
		// 학점 체크
		switch (temp) {
		case 10:
		case 9:
			grades = 'A';
			break;
		case 8:
			grades = 'B';
			break;
		case 7:
			grades = 'C';
			break;
		case 6:
			grades = 'D';
			break;
		default:
			grades = 'F';
		}
		
		System.out.println("점수 : "+score);
		System.out.println("학점 : "+grades);
	}

}
