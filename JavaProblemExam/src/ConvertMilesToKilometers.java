import java.util.Scanner;

public class ConvertMilesToKilometers {

	public static void main(String[] args) {
		
		// 스캐너 입력
		Scanner input = new Scanner(System.in);	
		
		// 변수 선언
		double mile;		// 마일
		double kilometers;	// 킬로미터
		
		System.out.println("마일을 킬로미터로 변환하는 프로그램");
				
		// 마일 입력
		System.out.println("마일을 입력하세요.(예 : 60.2)");
		mile = input.nextDouble();		
		
		// 마일 음수 체크
		if (mile <= 0) {
			System.out.println("마일을 0보다 크게 입력해주세요.");
		}
		
		// 마일 양수 체크
		if (mile > 0) {
			// 킬로미터 마일 변환 계산
			kilometers = mile * 1.609344;						// 킬로미터 = 마일 * 변환상수(1.609344)
			kilometers = (int) (kilometers * 100) / 100.0;	// 소수점 2자리

			// 결과 출력
			System.out.println("입력한 마일은 "+mile+"마일 이고, 킬로미터로 변환하면 "+kilometers+"킬로미터 입니다.(소수점 2자리까지 표기)");
		}
		else {
			System.out.println("재시작하여 값을 다시 입력해주세요.");
		}

	}

}
