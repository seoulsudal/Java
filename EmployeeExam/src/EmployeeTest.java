import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 인스턴스
		Employee employeeList = new Employee();
				
		// 정보 입력
		System.err.println("직원의 이름을 입력해주세요.");
		employeeList.setName(input.nextLine());
		
		System.out.println("직원의 번호를 입력해주세요.");
		employeeList.setPhoneNumber(input.nextLine());
		
		System.out.println("직원의 연봉을 입력해주세요(만원)");
		employeeList.setSalary(input.nextInt());
		
		employeeList.result();

	}

}
