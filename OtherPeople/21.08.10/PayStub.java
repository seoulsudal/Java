import java.util.Scanner;

public class PayStub {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			// 입력할 Scanner 인스턴스 생성
		
		String name;			// 직원의 이름
		int workingHours;		// 주당 근무 시간
		int hourSalary;			// 시간당 급여
		double incomeTax;		// 소득세
		int totalSalary;		// 총 급여
		double taxAmount;		// 세금액
		double realAmount;		// 수령 급여
		
		System.out.println("급여 대장을 출력하는 프로그램입니다.");
		
		// 입력
		System.out.print("직원의 이름 (예 : 홍길동) : ");
		name = input.nextLine();
		System.out.print("주당 근무 시간 (예 : 40) : " );
		workingHours = input.nextInt();
		System.out.print("시간당 급여 (예 : 4320) : ");
		hourSalary = input.nextInt();
		System.out.print("소득 세금 (예 : 3.3%) : ");
		incomeTax = input.nextDouble();
		
		// 총 급여 = 주당 근무 시간 * 시간당 급여
		totalSalary = workingHours * hourSalary;
		// 세금액 = 총 급여 * 소득세 * 0.01
		taxAmount = totalSalary * incomeTax * 0.01;
		// 수령 급여 = 총 급여 - 세금액
		realAmount = totalSalary - taxAmount;
			
		// 출력
		System.out.println("★ 급여명세서 ★");
		System.out.println("이름 : " + name);
		System.out.println("총 급여 : " + totalSalary + "원");
		System.out.println("세금액 : " + taxAmount + "원");
		System.out.println("수령 급여 : " + realAmount + "원");
	}

}
