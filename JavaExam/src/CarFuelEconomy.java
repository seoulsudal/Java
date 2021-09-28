import java.util.Scanner;

public class CarFuelEconomy {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int startingPointOdometer;	// 출발지점 주행거리계
		int destinationOdometer;	// 도착지점 주행거리계
		int distanceDriven;			// 주행 거리
		int fuelForUse;				// 사용한 연료량
		int fuelEfficiency;			// 연비
		
		System.out.println("연비를 계산해주는 프로그램");
		
		// 출발지점 주행거리계 입력
		System.out.println("출발한 지점의 주행거리계(Km)를 입력하세요.(예 : 1024)");
		startingPointOdometer = input.nextInt();

		// 출발지점 주행거리계 음수 체크
		if (startingPointOdometer < 0) {
			System.out.println("출발 지점의 주행거리계를 0이상 입력해주세요.");
		}
		
		// 도착지점 주행거리계 입력
		System.out.println("도착한 지점의 주행거리계(Km)를 입력하세요.(예 : 2048)");
		destinationOdometer = input.nextInt();
		
		// 도착지점 주행거리계가 출발지금 주행거리계보다 큰지 체크
		if (startingPointOdometer > destinationOdometer) {
			System.out.println("도착 지점의 주행거리계는 출발 지점 주행거리계보다 큰 값을 입력해주세요.");
		}
		
		// 사용한 연료 입력
		System.out.println("사용한 연료량(L)을 입력하세요.(예 : 42)");
		fuelForUse = input.nextInt();
		
		// 사용한 연료 음수 체크
		if (fuelForUse <= 0) {
			System.out.println("사용한 연료는 0보다 큰 값을 입력해주세요.");
		}
		
		// 도착 주행거리계가 출발 주행거리계보다 큰지, 연료 양수 체크 
		if ((destinationOdometer >= startingPointOdometer) && (fuelForUse > 0)) {
			// 연비 계산
			distanceDriven = destinationOdometer - startingPointOdometer;	// 주행거리 = 도착 거리계 - 출발 거리계
			fuelEfficiency = distanceDriven / fuelForUse;					// 연비 = 주행거리 / 사용한 연료

			// 결과 출력
			System.out.println("연비는 "+fuelEfficiency+" Km/l 입니다.");
		}
		else {
			System.out.println("재시작하여 값을 다시 입력해주세요.");
		}
	
	}

}
