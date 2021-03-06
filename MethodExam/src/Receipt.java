import java.util.Scanner;

public class Receipt {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 입력
		int sellingPrice;	// 판매금액
		int amount;			// 받은금액
		int change;			// 거스름돈
		double vat;			// 부가세
		
		System.out.println("영수증 출력 프로그램");
		
		// 판매금액 입력
		while(true) {
			System.out.println("판매금액을 입력하세요.(예 : 10000)");
			sellingPrice = input.nextInt();
			if(sellingPrice <= 0) {
				System.out.println("판매금액을 0보다 작게 입력하실 수 없습니다.");
			}
			else {
				break;
			}
		}
		
		// 받은금액 입력
		while(true) {
			System.out.println("받은금액을 입력하세요.(예 : 10000)");
			amount = input.nextInt();
			if(amount <= 0 || amount < sellingPrice) {
				System.out.println("받은금액은 판매금액보다 작을 수 없습니다.");
			}
			else {
				break;
			}
		}
		
		// 메소드 호출
		change = change(amount, sellingPrice);	// 거스름돈을 구하는 메소드
		vat = vat(sellingPrice);				// 부가세를 구하는 메소드
		// 결과 출력			
		System.out.println("    = 영수증 =");
		System.out.println("받은 금액\t: "+amount);
		System.out.println("상품 총액\t: "+sellingPrice);
		System.out.println("부가세\t: "+(int)vat);
		System.out.println("거스름돈\t: "+change);		

	}
	
	// 거스름돈을 구하는 메소드
	public static int change(int amount, int sellingPrice) {
		int change;
		change = amount - sellingPrice;	// 거스름돈 = 받은금액 - 상품금액
		return change;
	}
	
	// 부가세를 구하는 메소드
	public static double vat(double sellingPrice) {
		double vat;
		vat = sellingPrice * 0.1;	// 부가세 = 상품금액 * 0.1
		return vat;
	}
	
}
