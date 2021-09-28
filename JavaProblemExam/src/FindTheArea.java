import java.util.Scanner;

public class FindTheArea {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		char figure;		// 도형
		double area;		// 면적
		double width;		// 가로
		double length;		// 세로
		double height;		// 높이
		double theBaseSide;	// 밑면
		double radius;		// 반지름
		double pi;			// 원주율
		
		// 원주율 입력
		pi = 3.14;
		
		System.out.println("도형과 수치를 받아 면적을 구하는 프로그램");
		
		// 도형 입력
		System.out.println("도형을 입력하세요.(R, T, C)");
		figure = input.next().charAt(0);
		
		switch (figure) {
		case 'R':
		case 'r':
			// 사각형의 가로 입력
			System.out.println("사각형의 가로를 입력하세요.");
			width = input.nextDouble();
			
			// 사각형의 세로 입력
			System.out.println("사각형의 세로를 입력하세요.");
			length = input.nextDouble();
			
			// 사각형 면적 계산
			area = width * length;				// 면적 = 가로 * 세로
			area = (int) (area * 100) / 100.0;	// 소수점 2자리
			
			// 결과 출력
			System.out.println("사각형("+figure+")의 면적은 "+area+" 입니다.(소수점 2자리 표기)");
			break;
		case 'T':
		case 't':
			// 삼각형의 높이 입력
			System.out.println("삼각형의 높이를 입력하세요.");
			height = input.nextDouble();
			
			// 삼각형의 밑면 입력
			System.out.println("삼각형의 밑면을 입력하세요.");
			theBaseSide = input.nextDouble();
			
			// 삼격형의 면적 계산
			area = (1.0 / 2.0) * height * theBaseSide;	// 면적 = (1/2) * 높이 * 밑면
			area = (int) (area * 100) / 100.0;			// 소수점 2자리
			
			// 결과 출력
			System.out.println("삼각형("+figure+")의 면적은 "+area+" 입니다.(소수점 2자리 표기)");
			break;
		case 'C':
		case 'c':
			// 원의 반지름 입력
			System.out.println("원의 반지름을 입력하세요.");
			radius = input.nextDouble();
			
			// 원의 면적 계산
			area = pi * (radius * radius);		// 면적 = 원주율 * (반지름 * 반지름)
			area = (int) (area * 100) / 100.0;	// 소수점 2자리
			
			// 결과 출력
			System.out.println("원형("+figure+")의 면적은 "+area+" 입니다.(소수점 2자리 표기)");
			break;
		default:
			System.out.println("도형을 잘못 입력하셨습니다.");
			System.out.println("프로그램을 다시 실행하여 입력해주세요.");
			break;
		}

	}

}
