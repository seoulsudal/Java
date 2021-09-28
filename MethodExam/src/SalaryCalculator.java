import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		// 변수 선언
		String name;			// 이름
		int time;				// 주당 근무 시간
		int hourlySalary;		// 시간당 급여
		double incomeTax;		// 소득 세금
		double totalSalary;		// 총 급여
		double taxAmount;		// 세금액
		double salaryReceived;	// 수령 급여
		
		System.out.println("총 급여와 세금액 그리고 수령 급여를 계산하는 프로그램");
		
		// 이름 입력
		System.out.println("직원의 이름을 입력하세요.(예 : 홍길동)");
		name = input1.nextLine();
		
		// 주당 근무시간 입력
		while(true) {
			System.out.println("주당 근무 시간을 입력하세요.(예 : 52)");
			time = input.nextInt();
			if(time < 0 || time > 52) {
				System.out.println("근무시간을 1~52시간 사이로 입력하세요.");
			}
			else {
				break;
			}
		}
		
		// 시간당 급여 입력
		while(true) {
			System.out.println("시간당 급여를 입력하세요.(예 : 9160)");
			hourlySalary = input.nextInt();
			if(hourlySalary < 8720) {
				System.out.println("시급을 8720원 이상 입력하세요.");
			}
			else {
				break;
			}
		}

		// 소득 세금 입력
		while(true) {
			System.out.println("소득 세금을 입력하세요.(예 : 10.2%)");
			incomeTax = input.nextDouble();
			if(incomeTax <= 0) {
				System.out.println("소득 세금을 0보다 크게 입력하세요.");
			}
			else {
				break;
			}
		}
		
		// 메소드 호출
		totalSalary = totalSalary(time, hourlySalary);			// 총급여
		taxAmount =	taxAmount(totalSalary, incomeTax);			// 세금액
		salaryReceived = salaryReceived(totalSalary, taxAmount);// 수령급여

		// 결과 출력
		System.out.println(name+" 직원의 주급 명세서 입니다.");
		System.out.println("총 급여\t:\t"+(int)totalSalary+" 원\n"+"세금액\t:\t"+(int)taxAmount+" 원"+"\n"+"수령 급여\t:\t"+(int)salaryReceived+" 원");

	}

	// 총급여 구하는 메소드
	public static double totalSalary(double time, double hourlySalary) {
		double totalSalary;
		totalSalary = time * hourlySalary;	// 총 급여 = 시간 당 급여 * 근무시간
		return totalSalary;
	}
	
	// 세금액 구하는 메소드
	public static double taxAmount(double totalSalary, double incomeTax) {
		double taxAmount;
		taxAmount = (int) (totalSalary * ( incomeTax / 100.0 ));	// 세금액 = 총 급여 * 소득 세금(%로 받아서 /100)
		return taxAmount;
	}
	
	// 수령급여 구하는 메소드
	public static double salaryReceived(double totalSalary, double taxAmount) {
		double salaryReceived;
		salaryReceived = (int)totalSalary - taxAmount;	// 수령 급여 = 총 급여 - 세금액
		return salaryReceived;
	}
	
}
