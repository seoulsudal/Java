import java.util.Scanner;

public class WindSpeedCoolingTemperature {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		double outsideTemperature;			// 외부온도
		double windSpeed;					// 바람의 속도
		double windSpeedCoolingTemperature;	// 풍속냉각온도
		
		System.out.println("외부온도와 바람의 속도로 풍속 냉각 온도를 구하는 프로그램");
		
		// 외부온도 입력
		while(true) {
			System.out.println("외부온도(℃)를 입력하세요.(예 : - 30)");
			outsideTemperature = input.nextDouble();
			if(outsideTemperature <= -50 || outsideTemperature >= 5) {
				System.out.println("외부온도값을 -50℃이하, 5℃이상 제외하여 다시 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		// 바람의 속도 입력
		while(true) {
			System.out.println("바람의 속도(Km/h)를 입력하세요.(예 : 25)");
			windSpeed = input.nextDouble();
			if(windSpeed <= 3) {
				System.out.println("바람의 속도를 3Km/h이하 제외하여 다시 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		// 풍속 냉각 온도를 구하는 메소드 호출
		windSpeedCoolingTemperature = windSpeedCoolingTemperature(outsideTemperature, windSpeed);

		// 결과 출력
		System.out.println("풍속 냉각 온도는 "+windSpeedCoolingTemperature+" ℃ 입니다.(소수점 2자리까지 표기)");		

	}

	private static double windSpeedCoolingTemperature(double outsideTemperature, double windSpeed) {
		// 풍속 냉각 온도 계산
		double result;
		result = 13.12 + (0.6215 * outsideTemperature) - (11.37 * Math.pow(windSpeed, 0.16)) + (0.3965 * outsideTemperature * Math.pow(windSpeed, 0.16));	// 풍속냉각온도 = 상수(13.12) + (0.6215 * 외부온도) - (11.37 * 바람의 속도 * 0.16승) + (0.3965 * 외부온도 * 바람의 속도 * 0.16승) 
		result = (int) (result * 100) / 100.0;																												// 소수점 2자리
		return result;
	}

}
