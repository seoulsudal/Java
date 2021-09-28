import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		double radius;		// 반지름
		double area;		// 면적
		
		System.out.println("원의 반지름을 입력받아 면적을 구하는 프로그램");
		
		// 반지름 입력
		System.out.println("원의 반지름을 입력하세요.(예 : 4.6)");
		radius = input.nextDouble();
		
		// 면적 계산
		area = radius * radius * 3.14159;	// 면적 = 반지름 * 반지름 * 원주율(3.14159)
		
		// 결과 출력
		System.out.println("반지름이 "+radius+"인 원의 면적은 "+area+" 입니다.");
		
		

	}

}
