import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int savings;		// 저축액
		int annualSalary;	// 연봉
		int salary;			// 월급
		int year;			// 년차
		
		System.out.println("N년치 저축액을 계산하는 프로그램");

		// 월급 입력
		System.out.println("월 급여를(만원) 입력하세요.");
		salary = input.nextInt();
		
		// 년차 입력
		System.out.println("년차를 입력하세요.");
		year = input.nextInt();
		
		// 저축액 계산
		annualSalary = salary * 12;		// 연봉 = 월급 * 12
		savings = annualSalary * year;	// 저축액 = 연봉 * 년차
		
		// 결과 출력
		System.out.println(year+"년 동안의 저축액 : "+savings+" 만원 입니다.");

	}

}
