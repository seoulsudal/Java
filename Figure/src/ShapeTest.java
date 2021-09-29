import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {

		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		int x; 		// x좌표
		int y; 		// y좌표
		int radius; // 반지름
		int width; 	// 가로
		int length; // 세로
		int height; // 높이
		char shape; // 도형선택

		// 도형 선택
		do {
			while (true) {
				System.out.println("그리고 싶은 도형을 설정하세요.(C/R/T)");
				System.out.println("종료는 a 입니다.");
				shape = input.next().charAt(0);
				if (shape == 'C' || shape == 'c' || shape == 'R' || shape == 'r' || shape == 'T' || shape == 't'
						|| shape == 'a') {
					break;
				} else {
					System.out.println("도형을 다시 선택해주세요.");
				}
			}
			
			// 도형 판단
			switch (shape) {
			case 'C':
			case 'c':
				System.out.println("원 그리기");

				// 중심점 입력
				System.out.println("중심점의 x좌표를 입력하세요.");
				x = input.nextInt();
				System.out.println("중심점의 y좌표를 입력하세요.");
				y = input.nextInt();

				Point point = new Point(x, y); // Point 객체 변수 선언

				// 반지름 입력
				System.out.println("반지름을 입력하세요.");
				radius = input.nextInt();

				Circle circle = new Circle(point, radius); // Circle 객체 변수 선언

				// 결과 출력
				System.out.println(circle);
				System.out.println();
				break;
				
			case 'R':
			case 'r':
				System.out.println("사각형 그리기");

				// 꼭지점 입력
				System.out.println("꼭지점의 x좌표를 입력하세요.");
				x = input.nextInt();
				System.out.println("꼭지점의 y좌표를 입력하세요.");
				y = input.nextInt();

				Point point1 = new Point(x, y); // Point 객체 변수 선언

				System.out.println("가로를 입력하세요");
				width = input.nextInt();
				System.out.println("세로를 입력하세요.");
				length = input.nextInt();

				Rectangle rectangle = new Rectangle(point1, width, length); // Rectangle 객체 변수 선언

				// 결과 출력
				System.out.println(rectangle);
				System.out.println();
				break;
				
			case 'T':
			case 't':
				System.out.println("삼각형 그리기");

				// 꼭지점 입력
				System.out.println("꼭지점의 x좌표를 입력하세요.");
				x = input.nextInt();
				System.out.println("꼭지점의 y좌표를 입력하세요.");
				y = input.nextInt();

				Point point2 = new Point(x, y); // Point 객체 변수 선언

				System.out.println("가로를 입력하세요.");
				width = input.nextInt();
				System.out.println("높이를 입력하세요.");
				height = input.nextInt();

				Triangle triangle = new Triangle(point2, width, height); // Triangle 객체 변수 선언

				// 결과 출력
				System.out.println(triangle);
				System.out.println();
				break;
			}

			// 종료 프로그램
			if (shape == 'a') {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		} while (true);
	}

}
