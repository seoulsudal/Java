import java.util.Scanner;

public class EnergyCalculation {

	public static void main(String[] args) {

		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		double energy;				// 에너지
		double weight;				// 물의 무게
		double initialTemperature;	// 초기 온도
		double finalTemperature;	// 최종 온도
		
		System.out.println("초기 온도(℃)부터 최종 온도(℃)까지 물을 데우는데 필요한 에너지를 구하는 프로그램");
		
		// 초기 온도 입력
		System.out.println("초기 온도를 입력하세요(예 : 34.5℃)");
		initialTemperature = input.nextDouble();
		
		// 최종 온도 입력
		System.out.println("최종 온도를 입력하세요(예 : 99.8℃)");
		finalTemperature = input.nextDouble();
		
		// 물의 무게 입력
		System.out.println("물의 양을 입력하세요(예 : 5.4Kg)");
		weight = input.nextDouble(); 
		
		// 물의 무게 음수 체크
		if (weight <= 0) {
			System.out.println("물의 무게를 0보다 크게 입력하세요.");
		}
		
		// 물의 무게 양수 체크
		if (weight > 0) {
			// 에너지 계산
			energy = weight * ( finalTemperature - initialTemperature ) * 4184;	// 에너지 = 물의 무게 * ( 최종 온도 - 초기 온도) * 상수(4184)
			energy = (int) ( energy * 1000 ) / 1000.0;							// 소수점 3자리

			// 결과 출력
			System.out.println(weight+" Kg 만큼의 물을 "+initialTemperature+" ℃ 에서 "+finalTemperature+" ℃ 까지 데우는데 필요한 에너지의 양은 "+energy+" 줄 입니다.");
		}
		else {
			System.out.println("재시작하여 값을 다시 입력해주세요.");
		}

	}

}
