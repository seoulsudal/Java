import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
	
		double rate;               //연이율 변수 선언
		
		System.out.println("정기적금 연이율 입력 : ");
				
		rate = input.nextDouble(); //스케너 입력
		
		System.out.println("입력한 정기적금의 연이율은 "+rate+"% 입니다.");

	}

}
