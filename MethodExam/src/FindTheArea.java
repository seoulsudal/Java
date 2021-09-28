import java.util.Scanner;

public class FindTheArea {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		char figure;	// 도형
		
		System.out.println("도형과 수치를 받아 면적을 구하는 프로그램");
		
		// 도형 입력
		while(true) {
			System.out.println("도형을 입력하세요.(R, T, C)");
			figure = input.next().charAt(0);
			if((figure != 'R') && (figure != 'r') && (figure != 'T') && (figure != 't') && (figure != 'C') && (figure != 'c')) {
				System.out.println("도형을 다시 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		// 도형에 따른 결과 입력
		switch (figure) {
		case 'R':
		case 'r':
			
			// 변수 생성
			double square;
			
			// 사각형 구하는 메소드 호출
			square = square(figure);			

			// 결과 출력
			System.out.println("사각형("+figure+")의 면적은 "+square+" 입니다.(소수점 2자리 표기)");
			break;
			
		case 'T':
		case 't':
			
			// 변수 생성
			double triangle;
			
			// 삼각형의 면적을 구하는 메소드 호출
			triangle = triangle(figure);

			// 결과 출력
			System.out.println("삼각형("+figure+")의 면적은 "+triangle+" 입니다.(소수점 2자리 표기)");
			break;
			
		case 'C':
		case 'c':
			// 변수 생성
			double circle;
			
			// 원의 면적을 구하는 메소드 호출
			circle = circle(figure);
			
			// 결과 출력
			System.out.println("원형("+figure+")의 면적은 "+circle+" 입니다.(소수점 2자리 표기)");
			break;
			
		}	

	}

	// 원의 면적을 구하는 메소드
	private static double circle(char figure) {
		
		// 변수 생성
		Scanner input1 = new Scanner(System.in);
		double area;		// 면적
		double radius;		// 반지름
		
		// 원의 반지름 입력
		while(true) {
			System.out.println("원의 반지름을 입력하세요.");
			radius = input1.nextDouble();
			if(radius <= 0) {
				System.out.println("0보다 큰 값을 입력하세요.");
			}
			else {
				break;
			}
		}
		
		// 원의 면적 계산
		area = 3.14 * (radius * radius);		// 면적 = 상수(3.14) * (반지름 * 반지름)
		area = (int) (area * 100) / 100.0;	// 소수점 2자리
		return area;
	}

	// 삼각형의 면적을 구하는 메소드
	private static double triangle(char figure) {

		// 변수 생성
		Scanner input1 = new Scanner(System.in);
		double area;		// 면적
		double height;		// 높이
		double theBaseSide;	// 밑면
		
		// 삼각형의 높이 입력
		while(true) {
			System.out.println("삼각형의 높이를 입력하세요.");
			height = input1.nextDouble();
			if(height <= 0) {
				System.out.println("0보다 큰 값을 입력하세요.");
			}
			else {
				break;
			}
		}
		
		// 삼각형의 밑면 입력
		while(true) {
			System.out.println("삼각형의 밑면을 입력하세요.");
			theBaseSide = input1.nextDouble();
			if(theBaseSide <= 0) {
				System.out.println("0보다 큰 값을 입력하세요.");
			}
			else {
				break;
			}
		}
		
		// 삼격형의 면적 계산
		area = (1.0 / 2.0) * height * theBaseSide;	// 면적 = (1/2) * 높이 * 밑면
		area = (int) (area * 100) / 100.0;			// 소수점 2자리
		return area;
	}

	// 사각형의 면적을 구하는 메소드
	private static double square(char figure) {
		
		// 변수 생성
		Scanner input1 = new Scanner(System.in);
		double area;		// 면적
		double width;		// 가로
		double length;		// 세로
		
		// 사각형의 가로 입력
		while(true) {
			System.out.println("사각형의 가로를 입력하세요.");
			width = input1.nextDouble();
			if(width <= 0) {
				System.out.println("0보다 큰 값을 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		// 사각형의 세로 입력
		while(true) {
			System.out.println("사각형의 세로를 입력하세요.");
			length = input1.nextDouble();
			if(length <= 0) {
				System.out.println("0보다 큰 값을 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		// 사각형 면적 계산
		area = width * length;				// 면적 = 가로 * 세로
		area = (int) (area * 100) / 100.0;	// 소수점 2자리
		return area;
	}
}