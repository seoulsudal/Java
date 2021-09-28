// 물 끓이는데 필요한 에너지 구하기
import java.util.Scanner;

public class BoilingWater {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int water;						// 물의 무게
		double initialTemperature;		// 초기 온도
		double finalTemperature;		// 최종 온도
		double joules;					// 에너지
		
		System.out.println("초기 온도로 부터 최종 온도 까지 물을 데우는데 필요한 에너지를 찾는 프로그램입니다.\n");
		
		// 물의 무게, 초기온도, 최종온도 입력
		System.out.print("물의 양을 입력하세요(kg). : \n");
		water = input .nextInt();
		System.out.print("초기 온도를 입력하세요.(℃) : \n");
		initialTemperature = input .nextDouble();
		System.out.print("최종 온도를 입력하세요.(℃) : \n");
		finalTemperature = input .nextDouble();
		
		// 에너지 계산
		joules = water * (finalTemperature - initialTemperature) * 4184;	// 에너지 = 무게 * (최종온도-초기온도) * 변환상수(4184)
		
		// 에너지 값 출력
		System.out.println(initialTemperature + " ℃ 의 물을" + finalTemperature + " ℃ 까지 데우는데 필요한 에너지는 " + joules + " 줄 입니다.");

	}

}
