import java.util.Scanner;

public class ControlExample {

	public static void main(String[] args) {
	
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int menu;			// 메뉴 
		int deposit;		// 예금
		int withdraw;		// 출금
		int totalDeposit;	// 총 예금
		
		// 총 예금 초기화
		totalDeposit = 0;
		
		do {
			// 메뉴 출력
			System.out.println("--------------------------------");
			System.out.println("1. 예금 │ 2. 출금 │ 3. 잔고 │ 4. 종료");
			System.out.println("--------------------------------");
			
			// 메뉴 선택
			System.out.println("선택> ");
			menu = input.nextInt();
			
			if(menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch(menu) {
			case 1:
				System.out.println("예금액> ");
				deposit = input.nextInt();
				if(deposit > 0) {
					System.out.println(deposit+"원 입급 됩니다.");
					System.out.println("");
					totalDeposit = totalDeposit + deposit;
				}
				else {
					System.out.println("0보다 큰 값을 입력해주세요.");
					System.out.println("");
				}
				break;
			case 2:
				System.out.println("출금액> ");
				withdraw = input.nextInt();
				if(totalDeposit >= withdraw) {
					if(withdraw > 0) {
						System.out.println(withdraw+"원 출금 됩니다.");
						System.out.println("");
						totalDeposit = totalDeposit - withdraw;
					}
					else {
						System.out.println("0보다 큰 값을 입력해주세요.");
						System.out.println("");
					}
				}
				else {
					System.out.println("잔고 부족!!!");
					System.out.println("");
				}
				break;
			case 3:
				System.out.println("잔고> "+totalDeposit+"원 입니다.");
				System.out.println("");
				break;
			default:
				System.out.println("메뉴를 잘못 누르셨습니다.");
				System.out.println("다시 입력해주세요.");
				System.out.println("");
				break;
			}
		}while(true);

	}

}
