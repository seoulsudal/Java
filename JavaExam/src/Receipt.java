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
		System.out.println("판매금액을 입력하세요.(예 : 10000)");
		sellingPrice = input.nextInt();
		
		// 판매금액 음수 체크
		if (sellingPrice <= 0) {
			System.out.println("판매금액을 0보다 크게 입력해주세요.");
		}
		
		// 받은금액 입력
		System.out.println("받은금액을 입력하세요.(예 : 10000)");
		amount = input.nextInt();
		
		// 받은금액이 판매금액보다 높은지 체크
		if (amount < sellingPrice) {
			System.out.println("받은금액은 판매금액보다 크거나 같아야 합니다.");
		}
		
		// 판매금액이 양수인지, 받은금액이 판매금액보다 높은지 체크
		if ((sellingPrice >= 0) && (amount >= sellingPrice)) {
			// 거스름돈 및 부가세 계산
			change = amount - sellingPrice;	// 거스름돈 = 받은금액 - 판매금액
			vat = sellingPrice * 0.1;		// 부가세 = 판매금액 * 0.1

			// 결과 출력			
			System.out.println("    = 영수증 =");
			System.out.println("받은 금액\t: "+amount);
			System.out.println("상품 총액\t: "+sellingPrice);
			System.out.println("부가세\t: "+(int)vat);
			System.out.println("거스름돈\t: "+change);	
		}
		else {
			System.out.println("재시작하여 값을 다시 입력해주세요.");
		}
		
	}

}
