import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		final int TOTAL_NUMBERS = 6;			// 배열 개수
		int[] numbers = new int[TOTAL_NUMBERS];	// 1차원 배열 선언
		int max;								// 최대값
		int count;								// 최대값 개수
		String output;							// 출력 문자열
		
		// 변수 초기화
		count = 0;
		output = "\n 배열 : ";
		
		System.out.println("6개의 정수를 입력받아 최대값을 출력하는 프로그램");
		
		// 정수 입력
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("정수를 입력하세요.");
			numbers[i] = input.nextInt();
		}
		
		// 최대값 초기화
		max = numbers[0];
		
		// 최대값 판단
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] >= max) {
				max = numbers[i];
			}
		}
		
		// 최대값 개수
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == max) {
				count++;
			}
		}
		
		// 배열 출력
		for(int i = 0; i < TOTAL_NUMBERS; i++) {
			output += numbers[i] + " ";
		}
		
		output += "\n 최대값 : "+max;
		output += "\n 가장큰 숫자의 발생 횟수 : "+count;
		
		// 결과 출력
		System.out.println(output);

	}

}
