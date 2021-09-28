import java.util.Scanner;

public class StudentArrayInput {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		final int STUDENTS = 10;	// 학생 수
		double total = 0;			// 총점
		int[] score = new int[STUDENTS];
		
		System.out.println("성적 계산 프로그램");
		
		// 점수 입력
		for (int i = 0; i < STUDENTS; i++) {
			System.out.println((i+1)+"번째 학생의 국어 성적을 입력하세요.");
			score[i] = input.nextInt();
		}
		for (int i = 0; i < STUDENTS; i++) {
			total += score[i];
		}
		
		System.out.println("\n결과");
		System.out.println("총점 : "+(int)total);
		System.out.println("평균 : "+(total / STUDENTS));

	}

}
