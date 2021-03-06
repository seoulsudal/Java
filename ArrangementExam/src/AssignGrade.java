import java.util.Scanner;

public class AssignGrade {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		// 변수 선언
		int numberofStudents;	// 학생 수
		int best;				// 최고점
		char grade;				// 학점
		String output;			// 결과 출력 문자열
		int[] scores;			// 점수 배열
		// 변수 초기화
		best = 0;
		output = "";
		
		System.out.println("학생 성적 배치 프로그램");
		
		// 학생 수 입력
		System.out.println("학생수를 입력하세요.");
		numberofStudents = input.nextInt();
		// 배열 생성
		scores = new int[numberofStudents];
		// 학생 점수 입력
		for(int i = 0; i < numberofStudents; i++) {
			System.out.println((i+1)+"번 학생의 점수를 입력하세요.");
			scores[i] = input.nextInt();
			// 최고점 판단
			if(scores[i] > best) {
				best = scores[i];
			}
		}
		// 학점 판단(상대평가)
		for(int i = 0; i < numberofStudents; i++) {
			if(scores[i] > best - 10) {
				grade = 'A';
			}
			else if(scores[i] > best - 20) {
				grade = 'B';
			}
			else if(scores[i] > best - 30) {
				grade = 'C';
			}
			else if(scores[i] > best - 40) {
				grade = 'D';
			}
			else {
				grade = 'F';
			}
			// 결과 입력
			output += (i+1) + "번 학생의 점수는 " + scores[i] + "점, 학점은 " + grade + " 입니다.\n";
		}
		//결과 출력
		System.out.println(output);
	}

}
