import java.util.Scanner;

public class CalculateTheVolumeOfTheCylinder {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);	
		
		// 변수 선언
		double radius;		// 반지름
		double length;		// 길이
		double area;		// 넓이
		double volme;		// 부피
		double pi;			// 원주율
		
		// 원주율 입력
		pi = 3.14;
		
		System.out.println("실린더의 부피를 구하는 프로그램");
		
		// 반지름 입력
		System.out.println("반지름을 입력하세요.(예 : 4.6)");
		radius = input.nextDouble();	
		
		// 반지름 음수 체크
		if (radius <= 0) {
			System.out.println("반지름을 0보다 크게 입력하세요.");
		}
		
		// 길이 입력
		System.out.println("길이를 입력하세요.(예 : 8.8)");
		length = input.nextDouble();
		
		// 길이 음수 체크
		if (length <= 0) {
			System.out.println("길이를 0보다 크게 입력하세요.");
		}
		
		// 반지름 및 길이 양수 체크
		if ((radius > 0) && (length > 0)) {
			// 원기둥 부피 계산
			area = radius * radius * pi;			// 원기둥 넓이 = 반지름 * 반지름 * 원주율(3.14)
			volme = area * length;					// 부피 = 원기둥 넓이 * 높이
			volme = (int) (volme * 100) / 100.0;	// 소수점 2자리

			// 결과 출력
			System.out.print("반지름이 "+radius+"이고, 길이가 "+length+"인 실린더의 부피는 "+volme+" 이다.(소수점 2자리까지 표기)");
		}
		else {
			System.out.println("재시작하여 값을 다시 입력해주세요.");
		}
		
	}

}
