import java.util.Scanner;

public class SchoolGradesExam {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		// 변수 생성
		int students;			// 학생수
		int subject;			// 과목수
		String[] name;			// 학생이름
		int[][] grade;			// 점수
		String[] subjectName;	// 과목명
		int[] sum;				// 합계
		System.out.println("학교 성적 입력 프로그램");
		// 학생수 입력
		do {
			System.out.println("학생수 입력(양수) : ");
			students = input1.nextInt();
		}while(students <= 0);
		// 과목수 입력
		do {
			System.out.println("과목수 입력(양수) : ");
			subject = input1.nextInt();
		}while(subject <= 0);
		// 배열 크기 설정
		name = new String[students];		// 학생이름 배열
		grade = new int[students][subject];	// 점수 2차원 배열
		sum = new int[students];			// 합계 배열
		subjectName = new String[subject];	// 과목명 배열
		// 과목명 입력
		for(int k = 0; k < subject; k++) {
			System.out.println("과목명 입력 : ");
			subjectName[k] = input.nextLine();
		}
		// 학생이름 및 점수 입력
		for(int i = 0; i < students; i++) {
			System.out.println("학생 이름 입력 : ");
			name[i] = input.nextLine();
			for(int j = 0; j < subject; j++) {
				do {
					System.out.println(subjectName[j]+" 점수 입력(양수) : ");
					grade[i][j] = input1.nextInt();
				}while((grade[i][j] < 0) || (grade[i][j] > 100));
			}
		}
		// 학생 별 점수 합계
		for(int i = 0; i < students; i++) {
			for(int j = 0; j < subject; j++) {
				sum[i] += grade[i][j];
			}
		}
		// 결과 출력
		System.out.println();
		System.out.println("총 학생수 : "+students+"명 성적표");
		System.out.println();
		System.out.print("학생명\t");
		// 과목명 출력
		for(String subject1 : subjectName) {
			System.out.print(subject1+"\t");
		}
		System.out.print("총점\t평균\t");
		System.out.println();
		// 학생 이름과 점수 합계 평균 출력
		for(int i = 0; i < students; i++) {
			System.out.print(name[i]+"\t");
			for(int j = 0; j < subject; j++) {
				System.out.print(grade[i][j]+"\t");
			}
			System.out.print(sum[i]+"\t");
			System.out.print(sum[i] / subject);
			System.out.println();
		}
	}
	
	

}
