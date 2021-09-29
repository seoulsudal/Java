import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Score s = new Score();
		
		System.out.println("3가지 과목의 평균을 계산하는 프로그램");
		
		System.out.println("국어 점수를 입력하세요.");
		s.setKorean(input.nextInt());
		
		System.out.println("영어 점수를 입력하세요.");
		s.setEnglish(input.nextInt());
		
		System.out.println("수학 점수를 입력하세요.");
		s.setMath(input.nextInt());
				
		System.out.println(s);
		
	}

}
