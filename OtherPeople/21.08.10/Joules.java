
/*
개발자 : 최성호
개발일 : 2021.08.10
프로젝트명 : 에너지 계산(14번문제)
*/
import java.util.Scanner;

public class Joules {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		double amountOfWater;		// 물의 양
		double initialTemperature;	// 초기온도
		double finalTemperature; 	// 최종온도
		double joules;				// 에너지
		
		System.out.print("에너지를 계산하는 프로그램");
		
		// 물의 양 입력
		System.out.print("물의 양을 입력하세요(예 : 2kg) : ");
		amountOfWater=input.nextDouble();
		
		// 초기온도 입력
		System.out.print("초기온도를 입력하세요(예 : 10도 : ");
		initialTemperature=input.nextDouble();
		
		// 최종온도 입력
		System.out.print("최종온도를 입력하세요(예 : 100도 : ");
		finalTemperature=input.nextDouble();
		
		// 에너지계산=물의양*(최종온도-초기온도)*4184
		joules=amountOfWater*(finalTemperature-initialTemperature)*4184;
		
		// 계산값 출력
		System.out.println(initialTemperature + "도 부터" + finalTemperature + "도 까지" + amountOfWater + "kg의 물을 데우는데 필요한 에너지는 " + joules + "줄(Joules)입니다");
		
	}

}
