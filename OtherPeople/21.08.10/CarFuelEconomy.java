import java.util.Scanner;

public class CarFuelEconomy {

	public static void main(String[] args) {
		
		System.out.println("출발 지점의 주행거리계와 도착 지점의 주행거리계와 \n사용한 연료의 양(리터)를 받아 연비를 계산하는 프로그램");
		
		int departurePoint;//출발지점
		int arrivalPoint;//도착지점
		int distanceDriven;//주행거리
		int fuel;//연료
		double fuelEfficiency;//연비
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("출발 지점의 주행거리계를 입력하시오 : ");
		departurePoint = input.nextInt();
		System.out.print("도착 지점의 주행거리계를 입력하시오 : ");
		arrivalPoint = input.nextInt();
		System.out.print("사용한 연료의 양(L)을 입력하시오 : ");
		fuel = input.nextInt();
		
		//주행거리와 연비 계산식
		distanceDriven = arrivalPoint - departurePoint; // 주행거리 = 도착지점 주행 거리계 - 출발지점 주행 거리계
		fuelEfficiency = distanceDriven/fuel; // 연비 = 주행거리/사용한 연료의 양
		
		System.out.println("입력한 출발지점의 주행 거리계 : " + departurePoint);
		System.out.println("입력한 도착지점의 주행 거리계 : " + arrivalPoint);
		System.out.println("입력한 사용한 연료의 양(L) : " + fuel);
		System.out.println("연비 : " + fuelEfficiency + "km/L");
		
	}

}
