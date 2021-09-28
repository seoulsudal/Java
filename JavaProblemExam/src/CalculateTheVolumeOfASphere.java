import java.util.Scanner;

public class CalculateTheVolumeOfASphere {

	public static void main(String[] args) {
		
		// 스캐너 입력
		Scanner input = new Scanner(System.in);	
		
		// 변수 선언
		double radius;		// 반지름
		double volme;		// 부피 
        double pi;			// 원주율

        // 원주율 입력
		pi = 3.14;			
		
		System.out.println("구의 부피를 구하는 프로그램");
		
		// 반지름 입력
		System.out.println("반지름을 입력하세요.(예 : 4.6)");
		radius = input.nextDouble();	
		
		// 반지름 음수 체크
		if (radius <= 0) {
			System.out.println("반지름을 0보다 크게 입력해주세요.");
		}
		
		// 반지름 양수 체크
		if (radius > 0) {
			// 부피 계산 공식
			volme = ( 4.0 / 3.0 ) * pi * radius * radius * radius;	// 구의 부피 = 4/3 * 원주율(3.14) * 반지름 * 반지름 * 반지름
			volme = (int) (volme * 100) / 100.0;					// 소수점 2자리

			// 결과 출력
			System.out.println("반지름이 "+radius+"인 구의 부피는 "+volme+" 입니다.(소수점 2자리까지 표기)");
		}
		else {
			System.out.println("재시작하여 값을 다시 입력해주세요.");
		}

	}

}
