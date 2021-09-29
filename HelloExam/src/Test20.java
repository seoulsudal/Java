import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int quantity;			//수량 변수 선언
		int unitCost;			//단가 변수 선언
		int amount;				//금액 변수 선언
		double discount;		//할인액 변수 선언
		double amountDue;		//지불금액 변수 선언
		
		System.out.println("금액을 입력하세요.");
		unitCost = input.nextInt();	//단가 입력
		
		System.out.println("수량을 입력하세요.");
		quantity = input.nextInt();	//수량 입력
		
		amount = unitCost * quantity;	//금액 계산
		discount = amount * 0.25;		//할인액 계산
		amountDue = amount - discount;	//지불금액 계산
				
		System.out.print("할인율 25%일때, 금액은 "+amount+"원, 할인금액은 ");
		System.out.printf("%.0f원 이고, 지불금액은 ",discount);	//자리 수 없애기
		System.out.printf("%.0f원 입니다.",amountDue);			//자리 수 없애기
		
		
	}

}
