import java.util.Scanner;

public class LoopTest4 {

	public static void main(String[] args) {
		
		// 스캐너 입력
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int dan;
		
		// 단 입력
		System.out.println("출력할 단을 입력하세요.");
		dan = input.nextInt();
		
		System.out.println("입력하신 "+dan+"단의 구구단 입니다.");
		
		// 반복 계산 및 결과 출력
		for(int i = 1; i <= 9; ++i) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}

	}

}
