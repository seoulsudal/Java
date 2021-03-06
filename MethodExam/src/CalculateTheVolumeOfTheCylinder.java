import java.util.Scanner;

public class CalculateTheVolumeOfTheCylinder {

	public static void main(String[] args) {		
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		double radius;	// 반지름
		double length;	// 길이
		double area;	// 넓이
		double volume;	// 부피
		
		System.out.println("실린더의 부피를 구하는 프로그램");
		
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
		
		// 길이 입력
		while(true) {
			System.out.println("길이를 입력하세요.(예 : 8.8)");
			length = input.nextDouble();
			if(length <= 0) {
				System.out.println("0보다 큰 값을 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		// 리턴 메소드 호출
		area = area(radius);			// 넓이를 구하는 메소드
		volume = volume(radius, length);	// 부피를 구하는 메소드

		// 리턴 결과 출력
		System.out.print("반지름이 "+radius+"이고, 길이가 "+length+"인 실린더의 넓이는 "+area+"이고, 부피는 "+volume+" 이다.(소수점 2자리까지 표기)");
			
	}
	
	// 리턴 넓이를 구하는 메소드
	public static double area(double radius) {
		double area;	
		area = radius * radius * 3.14;	// 넓이 = 반지름 * 반지름 * 상수(3.14)
		area = (int) (area * 100) / 100.0;	// 소수점 2자리
		return area;
	}
	
	// 리턴 부피를 구하는 메소드
	public static double volume(double radius, double length) {
		double volume;	
		volume = area(radius) * length;			// 부피 = 넓이 * 길이
		volume = (int) (volume * 100) / 100.0;	// 소수점 2자리
		return volume;
	}
	
}
