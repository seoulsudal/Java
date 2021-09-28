import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		
		// 인스턴스 생성
		Rectangle rectArea = new Rectangle();
		
		do {
		// 가로 세로 입력
		while(true) {
			System.out.println("가로를 입력하세요.");
			rectArea.setWidth(input.nextDouble());
			if(rectArea.getWidth() <= 0) {
				System.out.println("0보다 큰 값을 입력하세요.");
			}
			else {
				break;
			}
		}
		while(true) {
			System.out.println("세로를 입력하세요.");
			rectArea.setLength(input.nextDouble());
			if(rectArea.getLength() <= 0) {
				System.out.println("0보다 큰 값을 입력하세요.");
			}
			else {
				break;
			}
		}
		
		// 결과 출력
		System.out.println("가로 길이가 "+rectArea.getWidth()+"이고 세로 길이가 "+rectArea.getLength()+"인 사각형의 넓이는 "+rectArea.calcArea()+" 이다.\n");
		
		// 변수 생성
		char questions;
		
		// 종료 질문
		System.out.println("계속 하시겠습니까?(Y/N)");
		questions = input.next().charAt(0);	// 답변 변수 생성
		if((questions == 'N') || (questions == 'n')) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		else {
			System.out.println("프로그램을 다시 시작합니다.");
		}
		}while(true);

	}

}
