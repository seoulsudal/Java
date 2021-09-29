import java.util.Scanner;

public class Test31 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int qty;		// 수량
		int price;		// 단가
		double amount;	// 금액
		
		System.out.println("상품 수량에 따른 금액을 알려주는 프로그램");
		
		// 금액 입력
		System.out.println("상품 단가를 입력하세요.");
		price = input.nextInt();
		
		System.out.println("상품 수량을 입력하세요.");
		qty = input.nextInt();
		
		amount = price * qty;	// 금액 = 단가 * 수량
		
		// 결과 출력
		if ( qty >= 100 ) {
			amount = amount - ( amount * 0.5 );
		} 
		
		else {
			amount = amount - ( amount * 0.2 );
		}
		
		System.out.println("상품의 할인 된 금액은 "+(int)amount+" 원 입니다.");

	}

}
