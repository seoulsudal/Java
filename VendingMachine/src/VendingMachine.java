import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {

		// 스케너 생성
		Scanner input = new Scanner(System.in);

		// 변수 선언
		int money; 							// 투입금액
		int sum; 							// 투입금액 합
		sum = 0; 							// 투입금액 합 초기화
		int itemNumber; 					// 물품번호
		char additionalPurchase; 			// 추가 물품 구매여부
		char additionalInput; 				// 추가 투입 여부
		int colaPrice; 						// 콜라
		int macolPrice; 					// 맥콜
		int ciderPrice; 					// 사이다
		int fantaPrice; 					// 환타
		int retsbePrice; 					// 레쓰비
		int topPrice; 						// topPrice
		int georgiaPrice; 					// 조지아
		int orancPrice; 					// 오란씨
		int carbonatedwaterPricePrice; 		// 탄산수
		int waterPrice; 					// 물
		String colaName; 					// 콜라 이름
		String macolName; 					// 맥콜 이름
		String ciderName; 					// 사이다 이름
		String fantaName; 					// 환타 이름
		String retsbeName; 					// 레쓰비 이름
		String topName; 					// top 이름
		String georgiaName; 				// 조지아 이름
		String orancName; 					// 오란씨 이름
		String carbonatedwaterName; 		// 탄산수 이름
		String waterName; 					// 물 이름
		// 변수 초기화
		colaPrice = 1400; 					// 콜라 가격
		macolPrice = 1600; 					// 맥콜 가격
		ciderPrice = 1400; 					// 사이다 가격
		fantaPrice = 1600; 					// 환타 가격
		retsbePrice = 1000; 				// 레쓰비 가격
		topPrice = 2000; 					// topPrice 가격
		georgiaPrice = 1800; 				// 조지아 가격
		orancPrice = 1000; 					// 오란씨 가격
		carbonatedwaterPricePrice = 2500; 	// 탄산수 가격
		waterPrice = 500; 					// 물 가격
		colaName = "콜라"; 					// 콜라 이름
		macolName = "맥콜"; 					// 맥콜 이름
		ciderName = "사이다"; 				// 사이다 이름
		fantaName = "환타"; 					// 환타 이름
		retsbeName = "레쓰비"; 				// 레쓰비 이름
		topName = "top"; 					// top 이름
		georgiaName = "조지아"; 				// 조지아 이름
		orancName = "오란씨"; 				// 오란씨 이름
		carbonatedwaterName = "탄산수";		// 탄산수 이름
		waterName = "물"; 					// 물 이름

		// 전체 반복
		do {
			// 메뉴판
			System.out.println("\t    ☆음료 자판기☆");
			System.out.println("");
			System.out.println("\t        메뉴");
			System.out.println("┌────────────────┬──────────────┐");
			System.out.println("│1." + colaName + "(" + colaPrice + "원)\t │2." + macolName + "(" + macolPrice + "원)\t│");
			System.out.println("├────────────────┼──────────────┤");
			System.out.println("│3." + ciderName + "(" + ciderPrice + "원)\t │4." + fantaName + "(" + fantaPrice + "원)\t│");
			System.out.println("├────────────────┼──────────────┤");
			System.out.println("│5." + retsbeName + "(" + retsbePrice + "원)\t │6." + topName + "(" + topPrice + "원)\t│");
			System.out.println("├────────────────┼──────────────┤");
			System.out.println("│7." + georgiaName + "(" + georgiaPrice + "원)\t │8." + orancName + "(" + orancPrice + "원)\t│");
			System.out.println("├────────────────┼──────────────┤");
			System.out.println("│9." + carbonatedwaterName + "(" + carbonatedwaterPricePrice + "원)\t │10." + waterName + "(" + waterPrice
					+ "원)\t│");
			System.out.println("└────────────────┴──────────────┘");
			System.out.println("");
			// 금액 반복
			do {
				// 투입금액 입력
				do {
					System.out.println("금액을 투입하세요.");
					money = input.nextInt();
					// 마이너스, 0 값 체크
					if (money < 0) {
						System.out.println("금액은 0보다 크게 입력해주세요.");
						System.out.println("프로그램을 다시 시작합니다.");
						System.out.println("");
					} else {
						sum = sum + money; // 추가 금액 합
						break;
					}
				} while (true);
				// 투입금액 출력
				System.out.println("투입 금액 : " + sum + "원");
				// 상품의 최저가격 체크
				if (sum < waterPrice) {
					System.out.println("최소 투입 금액이 모자랍니다.");
				}
				// 추가 투입 여부 체크
				System.out.println("금액을 더 투입하시겠습니까?(Y/N)");
				additionalInput = input.next().charAt(0);
				if (additionalInput == 'N' || additionalInput == 'n') {
					if (sum >= waterPrice) {
						System.out.println("총 투입금액은 " + sum + "원 입니다.");
						break;
					} else {
						System.out.println("총 반환금액은 " + sum + "원 입니다.");
						break;
					}
				} else if (additionalInput == 'Y' || additionalInput == 'y') {
					System.out.println("현재 총 투입금액은 " + sum + "원 입니다.");
				}
			} while (true);
			// 상품 최저금액 체크
			if (sum >= waterPrice) {
				// 상품 반복
				do {
					// 상품번호 입력
					System.out.println("상품 번호를 입력하세요.(1~10)");
					itemNumber = input.nextInt();
					// 상품 출력
					switch (itemNumber) {
					case 1:
					case 3:
						// 상품 금액 체크
						if (sum >= colaPrice) {
							sum = sum - colaPrice;
							System.out.println("선택하신 상품이 나왔습니다.");
							System.out.println("상품의 금액은 " + colaPrice + "원 이고 반환금은 " + sum + "원 입니다.");
							break;
						} else {
							System.out.println("금액이 " + (colaPrice - sum) + "원 모자릅니다.");
							break;
						}
					case 2:
					case 4:
						if (sum >= macolPrice) {
							sum = sum - macolPrice;
							System.out.println("선택하신 상품이 나왔습니다.");
							System.out.println("상품의 금액은 " + macolPrice + "원 이고 반환금은 " + sum + "원 입니다.");
							break;
						} else {
							System.out.println("금액이 " + (macolPrice - sum) + "원 모자릅니다.");
							break;
						}
					case 5:
					case 8:
						if (sum >= retsbePrice) {
							sum = sum - retsbePrice;
							System.out.println("선택하신 상품이 나왔습니다.");
							System.out.println("상품의 금액은 " + retsbePrice + "원 이고 반환금은 " + sum + "원 입니다.");
							break;
						} else {
							System.out.println("금액이 " + (retsbePrice - sum) + "원 모자릅니다.");
							break;
						}
					case 6:
						if (sum >= topPrice) {
							sum = sum - topPrice;
							System.out.println("선택하신 상품이 나왔습니다.");
							System.out.println("상품의 금액은 " + topPrice + "원 이고 반환금은 " + sum + "원 입니다.");
							break;
						} else {
							System.out.println("금액이 " + (topPrice - sum) + "원 모자릅니다.");
							break;
						}
					case 7:
						if (sum >= georgiaPrice) {
							sum = sum - georgiaPrice;
							System.out.println("선택하신 상품이 나왔습니다.");
							System.out.println("상품의 금액은 " + georgiaPrice + "원 이고 반환금은 " + sum + "원 입니다.");
							break;
						} else {
							System.out.println("금액이 " + (georgiaPrice - sum) + "원 모자릅니다.");
							break;
						}
					case 9:
						if (sum >= carbonatedwaterPricePrice) {
							sum = sum - carbonatedwaterPricePrice;
							System.out.println("선택하신 상품이 나왔습니다.");
							System.out.println("상품의 금액은 " + carbonatedwaterPricePrice + "원 이고 반환금은 " + sum + "원 입니다.");
							break;
						} else {
							System.out.println("금액이 " + (carbonatedwaterPricePrice - sum) + "원 모자릅니다.");
							break;
						}
					case 10:
						if (sum >= waterPrice) {
							sum = sum - waterPrice;
							System.out.println("선택하신 상품이 나왔습니다.");
							System.out.println("상품의 금액은 " + waterPrice + "원 이고 반환금은 " + sum + "원 입니다.");
							break;
						} else {
							System.out.println("금액이 " + (waterPrice - sum) + "원 모자릅니다.");
							break;
						}
					default:
						System.out.println("선택하신 상품 번호는 없습니다.");
					}
					break;
				} while (true);
			}
			// 상품구매 여부 체크
			System.out.println("추가로 상품을 더 구매하시겠습니까?(Y/N)");
			additionalPurchase = input.next().charAt(0);
			if (additionalPurchase == 'N' || additionalPurchase == 'n') {
				System.out.println("추가 구매를 선택하지 않으셨습니다.");
				System.out.println(sum + "원을 반환합니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (additionalPurchase == 'Y' || additionalPurchase == 'y') {
				System.out.println("추가 구매를 선택하셨습니다.");
				System.out.println("남은 금액은 " + sum + "원 입니다.");
				System.out.println("");
			}
		} while (true);
	}
}
