import java.util.Scanner;

public class Add {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	//스캐너 생성
		
		int firstNumber;	//첫 번째 정수 변수 선언
		int secondNumber;	//두 번째 정수 변수 선언
		int sum;			//합 변수 선선
		
		System.out.println("첫 번째 정수를 입력하세요");
		firstNumber = input.nextInt();		//첫 번째 정수 입력
		
		System.out.println("두 번째 정수를 입력하세요.");
		secondNumber =  input.nextInt();	//두 번째 정수 입력
		
		sum = firstNumber + secondNumber;	//두 수의 합 입력
	
		System.out.println("첫번째 수 "+firstNumber+"와 두번째 수 "+secondNumber+"의 합은 "+sum+" 입니다.");
		

	}

}
