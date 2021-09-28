import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int randomNumber1;		// 첫번째 임의의 수
		int randomNumber2;		// 두번째 임의의 수
		int answer;				// 정답
		
		// 임의의 수 생성
		randomNumber1 = (int)(System.currentTimeMillis() % 100);
		randomNumber2 = (int)(System.currentTimeMillis() * 7 % 100);
		
		// 정답 입력
		System.out.println("두 수의 합을 맞추는 퀴즈");
		System.out.print(randomNumber1+" + "+randomNumber2+" = ");
		answer = input.nextInt();
			
		// 결과 풀력
		System.out.println("정답 : "+randomNumber1+" + "+randomNumber2+" = "+(randomNumber1+randomNumber2));
		System.out.println("결과 : "+( randomNumber1+randomNumber2 == answer ));

	}

}
