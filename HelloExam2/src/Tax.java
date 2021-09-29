import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int income;	// 과세 표준
		int tax;	// 세금
		
		// 연봉 입력
		System.out.println("연봉을 입력하세요.(단위 만원)");
		income = input.nextInt();
		
		// 세금 계산
		if(income <= 1200) {
			tax = (int) (0.06 * income);
		}
		else if(income <= 4600) {
			tax = (int) (0.15 * income) - 108;
		}
		else if(income <= 8800) {
			tax = (int) (0.24 * income) - 522;
		}
		else if(income <= 15000) {
			tax = (int) (0.35 * income) - 1490;
		}
		else if(income < 30000) {
			tax = (int) (0.38 * income) - 1940;
		}
		else if(income < 50000) {
			tax = (int) (0.4 * income) - 2540;
		}
		else {
			tax = (int) (0.42 * income) - 3540;
		}
		
		// 결과 출력
		System.out.println("소득세 : "+tax+" 만원");

	}

}
