import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int randomNumber1;	// 첫번째 임의의 수
		int randomNumber2;	// 두번째 임의의 수
		int temp;			// 임의 변수
		int answer;			// 정답 입력
		
		// 임의의 1~100 정수를 생성
		randomNumber1 = (int) (Math.random() * 101);
		randomNumber2 = (int) (Math.random() * 101);
		
		// 두번째 수가 첫번째 수보다 크면 값을 교환
		if (randomNumber1 < randomNumber2) {
			temp = randomNumber1;
			randomNumber1 = randomNumber2;
			randomNumber2 = temp;			
		}
		
		// 문제 출력 및 정답 입력
		System.out.println("뺄셈을 맞추는 퀴즈");
		System.out.print(randomNumber1+" - "+randomNumber2+" = ");
		answer = input.nextInt();
		
		// 정답 체크
		if (randomNumber1 - randomNumber2 == answer) {
			System.out.println("정답입니다.");
		}
		else {
			System.out.println("오답입니다.");
			System.out.println("정답은 : "+randomNumber1+" - "+randomNumber2+" = "+(randomNumber1-randomNumber2));
		}
	}

}
