import java.util.Scanner;

public class Test35 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int num;	// 사원번호
		int age;	// 연령
		int rank;	// 직급
		
		System.out.println("연령이 30세에서 40세 미만으로 직급이 3, 5, 7급인 사원번호를 출력하는 프로그램");
		
		// 사원번호, 연령, 직급 입력
		System.out.println("사원번호를 입력하세요.");
		num = input.nextInt();
		
		System.out.println("연령을 입력하세요.(20~65)");
		age = input.nextInt();
		
		System.out.println("직급을 입력하세요.(1~10)");
		rank = input.nextInt();
		
		// 결과 출력
		if ( age >= 30 && age < 40 ) {
			if ( rank == 3 || rank == 5 || rank == 7 ) {
				System.out.println("연령이 30세 이상 40세 미만인 직원중에 직급이 3, 5, 7급인 사원의 번호는 "+num+" 입니다.");
			}
		}

	}

}
