import java.util.Scanner;

/*개발자 : 박찬영
  수정일 : 2021.08.10
  */
public class EnergyCalculation {

	public static void main(String[] args) {
		
		System.out.println("초기 온도에서 최종 온도까지 물을 데우는데 필요한 에너지를 계산하는 프로그램");
		
		double firstTemperature;//초기 온도
		double lastTemperature;//최종 온도
		double water;//물의 무게
		double energy;//필요한 에너지
		
		Scanner input = new Scanner(System.in);

		System.out.print("물을 ㎏단위로 입력하시오 : ");
		water = input.nextDouble();
		System.out.print("초기온도를 섭씨 기준으로 입력하시오 : ");
		firstTemperature = input.nextDouble();
		System.out.print("최종온도를 섭씨 기준으로 입력하시오 : ");
		lastTemperature = input.nextDouble();
		
		//물을 데우는데 필요한 에너지를 구하는 공식
		energy = water*(lastTemperature - firstTemperature)*4184;
		//물을 데우는데 필요한 에너지 = 킬로그램단위 무게*(최종온도-초기온도)*4184
		
		System.out.println("입력한 물의 무게는 : "+ water +"㎏");
		System.out.println("입력한 초기 온도는 :섭씨 "+firstTemperature+"℃");
		System.out.println("입력한 최종 온도는 :섭씨 "+lastTemperature+"℃");
		System.out.println("필요한 에너지는 : "+energy+"Joules");
		
	}

}
