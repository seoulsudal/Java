import java.util.Scanner;

public class ComputeBMI {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		double weight;		// 몸무게
		double height;		// 키
		double bmi;			// BMI 지수
		String result;		// 결과값
		
		System.out.println("BMI(Body mass Index) 체질량 지수측정 프로그램");
		
		// 몸무게 입력
		System.out.println("몸무게(Kg)를 입력하세요.(75.42)");
		weight = input.nextDouble();
		
		// 키 입력
		System.out.println("키(M)를 입력하세요.(1.77)");
		height = input.nextDouble();
		
		// BMI 계산(몸무게 / (키 * 키))
		bmi = (weight / (height * height));
		bmi = (int) (bmi * 100) / 100.0;		// 소수점 2자리
		
		// 결과 출력
		switch ((int)bmi) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
			result = "심각한 저체중";
			break;
		case 16:
		case 17:			
			result = "저체중";
			break;
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
			result = "정상 체중";
			break;
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
			result = "과체중";
			break;
		case 29:
		case 30:
		case 31:
		case 32:
		case 33:
		case 34:
			result = "심각한 과체중";
			break;
		default:
			result = "위험한 과체중";
		}
		
		System.out.println("당신의 BMI: "+bmi);
		System.out.println("당신은 "+result+" 입니다.");
		

	}

}
