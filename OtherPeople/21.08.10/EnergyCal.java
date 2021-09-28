import java.util.Scanner;

public class EnergyCal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			// 입력할 Scanner 인스턴스 선언
		
		double firstTemperature;		// 초기 온도
		double lastTemperature;			// 최종 온도
		double waterMass;				// 물의 양
		double energy;					// 에너지
		
		System.out.println("물을 데우는데 필요한 에너지를 구하는 프로그램입니다.");
		
		//입력
		System.out.print("초기 온도를 입력하세요(℃) : ");
		firstTemperature = input.nextDouble();
		System.out.print("최종 온도를 입력하세요(℃) : ");
		lastTemperature = input.nextDouble();
		System.out.print("넣은 물의 양을 입력하세요(kg) : ");
		waterMass = input.nextDouble();
		
		// 에너지 = 물의 양 * (최종 온도 - 초기 온도) * 상수(4184)
		energy = waterMass * (lastTemperature - firstTemperature) * 4184;

		// 출력
		System.out.println(firstTemperature + "℃ 에서 " + lastTemperature + "℃ 까지 데우는데 필요한"
				+ " 에너지의 양은 " + energy + "J과 같다.");
	}

}
