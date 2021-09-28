import java.util.Scanner;

public class Specifications {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		String name;						// 직원이름
		int workingHoursPerWeek;			// 주 근무시간
		int hourlySalary;					// 시간당 급여
		double incomeTax;					// 소득세
		int totalSalary;					// 총급여
		double tax;							// 세금액
		double realAmount;					// 실수령액
		
		System.out.println("월 급여 대장을 출력하는 프로그램입니다.\n");
		
		// 직원 정보 입력
		System.out.print("직원의 이름을 입력하세요. : \n");
		name = input1.nextLine();
		System.out.print("주 근무 시간을 입력하세요(예 : 40). : \n");
		workingHoursPerWeek = input.nextInt();
		System.out.print("시간당 급여를 입력하세요(예 : 8720). : \n");
		hourlySalary = input.nextInt();
		System.out.println("소득 세금을 입력하세요(예 : 3.3%). : \n");
		incomeTax = input.nextDouble();
		
		
		// 총급여 계산
		totalSalary = workingHoursPerWeek * hourlySalary;	// 주급 = 주 근무시간 * 시급
		
		// 소득세 계산
		tax = totalSalary * (incomeTax/100);						// 소득세 = 총급여 * 소득세율
		
		// 실수령액 계산
		realAmount = totalSalary - tax;						// 실수령액 = 총급여 - 소득세
		
		// 소수점 자리를 없애기 위한
		realAmount = (int)(realAmount * 100) / 100.0;
		
		// 급여, 세금 출력
		System.out.println("직원의 이름 : " + name);
		System.out.println("총 급여 : " + totalSalary + " 원");
		System.out.println("소득 세금 : " + tax + " 원");
		System.out.println("실 수령액 : " + realAmount + " 원");

	}

}
