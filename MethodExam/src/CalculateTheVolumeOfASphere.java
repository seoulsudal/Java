import java.util.Scanner;

public class CalculateTheVolumeOfASphere {

	public static void main(String[] args) {
		
		// 스캐너 입력
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		double radius;		// 반지름
		double volume;		// 부피
		
		System.out.println("구의 부피를 구하는 프로그램");
		
		// 반지름 입력
		while(true) {
			System.out.println("반지름을 입력하세요.(예 : 4.6)");
			radius = input.nextDouble();
			if(radius <= 0) {
				System.out.println("0보다 큰 값을 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		/*		
		// 리턴 구의 부피를 구하는 메소드 호출
		volume = volume(radius);
		
		// 결과 출력
		System.out.println("반지름이 "+radius+"인 구의 부피는 "+volume+" 입니다.(소수점 2자리까지 표기)");
		 */
		
		// void 구의 부피를 구하는 메소드 출력
		System.out.print("반지름이 "+radius+"인 구의 부피는 ");
		volume(radius);
		System.out.println(" 입니다.");
	}

	// void 구의 부피를 구하는 메소드
	public static void volume(double radius) {
		double volume;
		volume = ( 4.0 / 3.0 ) * 3.14 * radius * radius * radius;	// 구의 부피 = 4/3 * 상수(3.14) * 반지름 * 반지름 * 반지름 
		volume = (int) (volume * 100) / 100.0;						// 소수점 2자리
		System.out.print(volume);
	}
	/*	
	// 리턴 구의 부피를 구하는 메소드
	public static double volme(double radius) {
		double volme;
		volme = ( 4.0 / 3.0 ) * 3.14 * radius * radius * radius;	// 구의 부피 = 4/3 * 상수(3.14) * 반지름 * 반지름 * 반지름 
		volme = (int) (volme * 100) / 100.0;						// 소수점 2자리
		return volme;
	}
*/	
}
