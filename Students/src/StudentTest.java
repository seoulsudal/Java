import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {

		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		String name;
		int number;
		String department;
		int year;
		int grade;
		String assistant;
		double scholarship;

		Undergraduate u = new Undergraduate("현용주", 11, "전기과", 2, 60, "제작동아리");

		PostgraduateStudent p = new PostgraduateStudent();

		System.out.println("대학원생의 정보를 입력하세요.");
		System.out.println("이름을 입력하세요.");
		p.setName(name = input.nextLine());
		System.out.println("나이를 입력하세요.");
		p.setStudentNumber(number = input.nextInt());
		System.out.println("학과를 입력하세요.");
		p.setAffiliationDepartment(department = input1.nextLine());
		System.out.println("학년을 입력하세요.");
		p.setSchoolYear(year = input.nextInt());
		System.out.println("학점을 입력하세요.");
		p.setGradescomplete(grade = input.nextInt());
		while (true) {
			System.out.println("조교 유형을 입력하세요.(교육보조/연구보조)");
			p.setAssistant(assistant = input2.nextLine());
			if (assistant.equals("교육보조") || assistant.equals("연구보조")) {
				break;
			} 
			else {
				System.out.println("다시 입력해주세요.");
			}
		}
		while (true) {
			System.out.println("장학금 비율을 입력하세요(0 ~ 1)");
			p.setScholarship(scholarship = input.nextDouble());
			if (scholarship >= 0 && scholarship <= 1) {
				break;
			} 
			else {
				System.out.println("다시 입력해주세요.");
			}
		}

		System.out.println(u);
		System.out.println(p);
	}

}
