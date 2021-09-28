import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		// 변수 선언
		String name;		// 이름
		int time;			// 주당 근무 시간
		int hourlySalary;	// 시간당 급여
		double incomeTax;	// 소득 세금
		double totalSalary;	// 총 급여
		int taxAmount;		// 세금액
		int salaryReceived;	// 수령 급여
		
		System.out.println("총 급여와 세금액 그리고 수령 급여를 계산하는 프로그램");
		
		// 이름 입력
		System.out.println("직원의 이름을 입력하세요.(예 : 홍길동)");
		name = input1.nextLine();
		
		// 주당 근무시간 입력
		System.out.println("주당 근무 시간을 입력하세요.(예 : 52)");
		time = input.nextInt();
		
		// 근무시간 범위 체크
		if (time < 0 || time > 52) {
			System.out.println("근무시간을 1~52시간 사이로 입력하세요.");
		}
		
		// 시간당 급여 입력
		System.out.println("시간당 급여를 입력하세요.(예 : 9160)");
		hourlySalary = input.nextInt();
		
		// 급여 범위 체크
		if (hourlySalary < 8720) {
			System.out.println("시급을 8720원 이상 입력하세요.");
		}
		
		// 소득 세금 입력
		System.out.println("소득 세금을 입력하세요.(예 : 10.2%)");
		incomeTax = input.nextDouble();
		
		// 소득 음수 체크
		if (incomeTax <= 0) {
			System.out.println("소득 세금을 0보다 크게 입력하세요.");
		}
		
		// 근무시간 및 시급, 소득세금 범위 체크 
		if (((time > 0) && (time <= 52)) && ((hourlySalary >= 8720) && (incomeTax > 0))) {
			// 총 급여, 세금액, 수령 급여 계산
			totalSalary = time * hourlySalary;							// 총 급여 = 시간 당 급여 * 근무시간
			taxAmount = (int) (totalSalary * ( incomeTax / 100.0 ));	// 세금액 = 총 급여 * 소득 세금(%로 받아서 /100)
			salaryReceived = (int)totalSalary - taxAmount; 				// 수령 급여 = 총 급여 - 세금액
			
			// 결과 출력
			System.out.println(name+" 직원의 주급 명세서 입니다.");
			System.out.println("총 급여\t:\t"+(int)totalSalary+" 원\n"+"세금액\t:\t"+taxAmount+" 원"+"\n"+"수령 급여\t:\t"+salaryReceived+" 원");
		}
		else {
			System.out.println("재시작하여 값을 다시 입력해주세요.");
		}

	}

}
