import java.util.Scanner;

public class SchoolGrades {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		// 변수 선언
		int subject;	// 과목
		int students;	// 학생 수
		int total;		// 총점
		int average;	// 평균
		// 변수 초기화
		total = 0;
		System.out.println("학교성적 입력 프로그램");
		// 성적 입력 i = 학생 수, j = 과목 수
		while(true) {
			System.out.println("학생 수 입력(양수) : ");
			students = input.nextInt();
			if(students <= 0) {
				System.out.println("0보다 큰 수를 입력해주세요.");
			}
			if(students > 0) {
				break;
			}
		}
		while(true) {
			System.out.println("과목 수 입력(양수) : ");
			subject = input.nextInt();
			if(subject <= 0) {
				System.out.println("0보다 큰 수를 입력해주세요.");
			}
			if(subject > 0) {
				break;
			}
		}
		// 배열 선언
		int[][] score = new int[students][subject];
		String[] studentsName = new String[students];
		String[] subjectName = new String[subject];	
		// 과목명 입력
		for(int j = 0; j < subject; j++) {
			System.out.println("과목명 입력 : ");
			subjectName[j] = input1.nextLine();
		}
		// 학생 이름 및 과목 점수 입력
		for(int i = 0; i < students; i++) {
			System.out.println("학생 이름 입력 : ");
			studentsName[i] = input1.nextLine();
			for(int j = 0; j < subject; j++) {
				while(true) {
					System.out.println(subjectName[j]+" 점수 입력(양수)");
				 	score[i][j] = input.nextInt();
				 	if(score[i][j] < 0) {
				 		System.out.println("음수는 입력할 수 없습니다.");
				 	}
				 	if(score[i][j] > 100) {
				 		System.out.println("100보다 큰 값은 입력할 수 없습니다.");
				 	}
				 	if(score[i][j] >= 0 && score[i][j] <=100) {
				 		break;
				 	}
				}
			}
		}
		// 결과 출력
		System.out.println("\n총 학생수 : "+students+"\n");
		System.out.print("학생명\t");
		for(int j = 0; j < subject; j++) {
			System.out.print(subjectName[j]+"\t");
		}
		System.out.println("총점\t평균");
		for(int i = 0; i < students; i++) {
			System.out.print(studentsName[i]+"\t");
			for(int j = 0; j< subject; j++) {
				System.out.print(score[i][j]+"\t");
				total += score[i][j];
			}
			System.out.print(total+"\t"+(total / subject)+"\n");
			total = 0;
		}
	}
}
