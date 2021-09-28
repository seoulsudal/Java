import java.util.Scanner;

public class SubtractionQuizLoop {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		final int NUMBER_OF_QUESTIONS = 5;	// 총 문제 개수
		int correctCount = 0;	// 정답 개수
		int count = 0;			// 반복문 탈출
		long startTime;			// 시작 시각
		long endTime;			// 종료 시각
		long testTime;			// 테스트 전체 초
		long currentSecond;		// 테스트 초 계산
		long totalMinutes;		// 테스트 분 계산
		
		startTime = System.currentTimeMillis() / 1000;	// 밀리나노초를 초로 변경
		String output = "";
		
		System.out.println("다섯개의 뺄셈 문제 테스트 프로그램");
		
		while(count < NUMBER_OF_QUESTIONS) {
			int number1;	// 첫번째 랜덤 수
			int number2;	// 두번째 랜덤 수
			
			number1 = (int) (Math.random() * 101);
			number2 = (int) (Math.random() * 101);
			
			if(number1 < number2) {
				int temp;	// 임의의 변수
				temp = number1;
				number1 = number2;
				number2 = temp;
			}
			
			// 문제 횟수
			count++;
			
			System.out.println("\n문제 "+count+"번");
			System.out.println(number1+" - "+number2+" = ?");
			int answer = input.nextInt();
			
			if(number1-number2 == answer) {
				System.out.println("정답!");
				correctCount++;
			}
			else {
				System.out.println("오답!\n"+number1+" - "+number2+" = "+(number1-number2));
			}
			
			output += "\n"+count+"번 문제 : "+number1+" - "+number2+" = "+answer+((number1 - number2 == answer)? " 정답 " : " 오답 ");
			
			endTime = System.currentTimeMillis() / 1000;	// 밀리나노초를 초로 변경
			testTime = endTime - startTime;					// 테스트 전체 초
			currentSecond = (int) (testTime % 60);			// 초 계산
			totalMinutes = testTime / 60;					// 분 계산
			
			System.out.println("\n정답갯수 : "+correctCount);
			System.out.println("테스트 시간 : "+totalMinutes+"분 "+currentSecond+"초\n"+output);
		}

	}

}
