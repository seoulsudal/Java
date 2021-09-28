import java.util.Scanner;

public class Test37 {

	public static void main(String[] args) {
		
		// 스캐너 입력
		Scanner input = new Scanner(System.in);
		
		// 변수 입력
		int su1;	// 첫번째 수
		int su2;	// 두번째 수
		
		// 수 입력
		System.out.println("첫번째 수를 입력하세요.");
		su1 = input.nextInt();
		
		System.out.println("두번째 수를 입력하세요.");
		su2 = input.nextInt();
		
		// 결과 출력
		if ( su1 > su2 ) {
			System.out.println("큰수는 "+su1+" 입니다.");
		}
		else if ( su1 < su2 ) {
			System.out.println("큰수는 "+su2+" 입니다.");
		}
		else {
			System.out.println("EQUAL");
		}

	}

}
