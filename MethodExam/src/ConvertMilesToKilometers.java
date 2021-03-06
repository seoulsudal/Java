import java.util.Scanner;

public class ConvertMilesToKilometers {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		double miles;		// 마일
		double kilometers;	// 킬로미터
		System.out.println("마일을 킬로미터로 변환하는 프로그램");
		
		// 마일 입력
		while(true) {
			System.out.println("마일을 입력하세요.");
			miles = input.nextDouble();
			if(miles <= 0) {
				System.out.println("마일을 0보다 크게 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		// 메소드 호출
		//kilometers = kilometers(miles);	// 킬로미터
		
		// void 결과 출력
		System.out.print(miles+"마일은 ");
		kilometers(miles);
		System.out.println(" 킬로미터 입니다.(소수점 2자리 표기)");
		
		// 리턴 결과 출력
		//System.out.println(miles+"마일은 "+kilometers+" 킬로미터 입니다.(소수점 2자리 표기)");
		
	}
	
	// void 마일을 킬로미터로 변환하는 메소드
	public static void kilometers(double miles) {
		double kilometers;
		kilometers = miles * 1.609344;			// 계산식
		kilometers = (int)(kilometers *100) / 100.0;	// 소수점 2자리
		System.out.print(kilometers);
	}
	
/*	// 리턴 마일을 킬로미터로 변환하는 메소드
	public static double kilometers(double miles) {
		double kilometers;
		kilometers = miles * 1.609344;			// 계산식
		kilometers = (int)(kilometers *100) / 100.0;	// 소수점 2자리
		return kilometers;
	}
*/
	
}
