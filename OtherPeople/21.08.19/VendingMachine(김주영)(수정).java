import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// 입력 스캐너 선언
		Scanner input = new Scanner(System.in);

		// 자판기 내부 변수
		int money; // 투입 금액 변수 선언
		int storeMoney; // 저장금액
		int price;	// 상품 금액
		int productNumber; // 상품 번호
		String productName; // 상품 이름
		char additionalInputCheck; // 추가 투입 판단
		char purchaseCheck; // 추가 구매 판단

		// 자판기 메뉴 가격 변수
		int kkumtulee; // 1. 꿈틀이 변수 선언
		int cola; // 2. 콜라 변수 선언
		int hwanta; // 3. 환타 변수 선언
		int cida; // 4. 사이다 변수 선언
		int tissue; // 5. 티슈 변수 선언
		int selfbong; // 6. 셀프봉 변수 선언
		int kf94; // 7. kf94 변수 선언
		int mentos; // 8. 멘토스 변수 선언
		int xylitol; // 9. 자일리톨 변수 선언
		int gaugul; // 10. 가글 변수 선언

		// 자판기 메뉴 문자열 변수
		String kkumtuleeStr; // 1. 꿈틀이 문자열 변수 선언
		String colaStr; // 2. 콜라 문자열 변수 선언
		String hwantaStr; // 3. 환타 문자열 변수 선언
		String cidaStr; // 4. 사이다 문자열변수 선언
		String tissueStr; // 5. 티슈 문자열 변수 선언
		String selfbongStr; // 6. 셀프봉 문자열 변수 선언
		String kf94Str; // 7. kf94 문자열 변수 선언
		String mentosStr; // 8. 멘토스 문자열 변수 선언
		String xylitolStr; // 9. 자일리톨 문자열 변수 선언
		String gaugulStr; // 10. 가글 문자열 변수 선언

		// 자판기 메뉴 가격 초기화
		kkumtulee = 1000; // 1. 꿈틀이 가격
		cola = 1500; // 2. 콜라 가격
		hwanta = 600; // 3. 환타 가격
		cida = 300; // 4. 사이다 가격
		tissue = 500; // 5. 티슈 가격
		selfbong = 10000; // 6. 셀프봉 가격
		kf94 = 2000; // 7. kf94 가격
		mentos = 1000; // 8. 멘토스 가격
		xylitol = 1000; // 9. 자일리톨 가격
		gaugul = 2000; // 10. 가글 가격

		// 내부 변수 초기화
		storeMoney = 0;
		price = 0;
		purchaseCheck = 'y';
		additionalInputCheck = 'y';

		// 자판기 메뉴 문자열 초기화
		kkumtuleeStr = "꿈틀이"; // 1. 꿈틀이 문자열
		colaStr = "콜라"; // 2. 콜라 문자열
		hwantaStr = "환타"; // 3. 환타 문자열
		cidaStr = "사이다"; // 4. 사이다 문자열
		tissueStr = "티슈"; // 5. 티슈 문자열
		selfbongStr = "셀프봉"; // 6. 셀프봉 문자열
		kf94Str = "kf94"; // 7. kf94 문자열
		mentosStr = "멘토스"; // 8. 멘토스 문자열
		xylitolStr = "자일리톨"; // 9. 자일리톨 문자열
		gaugulStr = "가글"; // 10. 가글 문자열

		// 자판기
		System.out.println("                    ★숫자 자판기★\n");
		System.out.println("┌───────────────────────┬───────────────────────┐");
		System.out.print("│1. " + kkumtuleeStr + " (" + kkumtulee + "원)\t│");
		System.out.println("2. " + colaStr + " (" + cola + "원)\t\t│");
		System.out.println("├───────────────────────┼───────────────────────┤");
		System.out.print("│3. " + hwantaStr + " (" + hwanta + "원)\t\t│");
		System.out.println("4. " + cidaStr + " (" + cida + "원)\t\t│");
		System.out.println("├───────────────────────┼───────────────────────┤");
		System.out.print("│5. " + tissueStr + " (" + tissue + "원)\t\t│");
		System.out.println("6. " + selfbongStr + " (" + selfbong + "원)\t│");
		System.out.println("├───────────────────────┼───────────────────────┤");
		System.out.print("│7. " + kf94Str + " (" + kf94 + "원)\t│");
		System.out.println("8. " + mentosStr + " (" + mentos + "원)\t│");
		System.out.println("├───────────────────────┼───────────────────────┤");
		System.out.print("│9. " + xylitolStr + " (" + xylitol + "원)\t│");
		System.out.println("10. " + gaugulStr + " (" + gaugul + "원)\t│");
		System.out.println("└───────────────────────┴───────────────────────┘");

		while (true) {
			while(true)
			{
				// 자판기 내부 코딩
				System.out.print("\n금액을 투입하세요 : ");
				money = input.nextInt();
				storeMoney += money;
				System.out.println("투입된 금액은 " + storeMoney + "원 입니다.");
				
				// 가격 넣은게 음수일 경우
				if(money < 0)
				{
					System.out.println("투입된 돈은 음수가 될 수 없습니다.");
					System.out.println("다시 돈을 투입하십시오.");
				}
				
				// 가격 넣은게 양수일 경우
				if(money >= 0)
				{
					// 상품의 최저가격보다 낮을 때 다시 투입 or 종료
					if (storeMoney < cida) {
						System.out.print("투입된 돈이 상품 최저금액보다 적습니다. 더 투입하시겠습니까?(y/n) : ");
						additionalInputCheck = input.next().charAt(0);
		
						// 더 투입하지 않으면 종료
						if (additionalInputCheck == 'n' || additionalInputCheck == 'N') {
							System.out.println("잔돈을 반환합니다.");
							System.out.println("잔돈은 " + storeMoney + "원 입니다.");
							purchaseCheck = 'n';
							break;
						}
						
						// 문자 예외 체크
						if (additionalInputCheck != 'n' && additionalInputCheck != 'N' &&
								additionalInputCheck != 'y' && additionalInputCheck != 'Y')
						{
							System.out.println("문자를 잘못 입력하셨습니다.");
							purchaseCheck = 'n';
							break;
						}
					}
					
					// 가격이 사이다보다 크면 진행
					if (storeMoney >= cida) {
						// 추가 투입여부 입력
						System.out.print("금액을 더 투입하시겠습니까?(y/n) : ");
						additionalInputCheck = input.next().charAt(0);
		
						// 더 투입하지 않으면 진행
						if (additionalInputCheck == 'n' || additionalInputCheck == 'N') {
							break;
						}
						
						// 문자 예외 체크
						if (additionalInputCheck != 'n' && additionalInputCheck != 'N' &&
								additionalInputCheck != 'y' && additionalInputCheck != 'Y')
						{
							System.out.println("문자를 잘못 입력하셨습니다.");
							purchaseCheck = 'n';
							break;
						}
					}
				}
			}
			
			// 상품 구입 확인
			while (purchaseCheck == 'y' || purchaseCheck == 'Y'){

				System.out.print("상품 번호를 입력하세요. : ");
				productNumber = input.nextInt();
				
				// 상품 선택
				switch (productNumber) {
				case 1:
					price = kkumtulee;
					productName = kkumtuleeStr;
					break;
				case 2:
					price = cola;
					productName = colaStr;
					break;
				case 3:
					price = hwanta;
					productName = hwantaStr;
					break;
				case 4:
					price = cida;
					productName = cidaStr;
					break;
				case 5:
					price = tissue;
					productName = tissueStr;
					break;
				case 6:
					price = selfbong;
					productName = selfbongStr;
					break;
				case 7:
					price = kf94;
					productName = kf94Str;
					break;
				case 8:
					price = mentos;
					productName = mentosStr;
					break;
				case 9:
					price = xylitol;
					productName = xylitolStr;
					break;
				case 10:
					price = gaugul;
					productName = gaugulStr;
					break;
				default:
					System.out.println("없는 번호입니다. 번호를 다시 입력해주세요.");
					productName = "";
				}
				
				// (저장금액 - 상품가격) >= 0
				// 돈이 충분한 경우 && 상품번호가 정상일 경우
				if(((storeMoney - price) >= 0) && (productNumber > 0 && productNumber <= 10))
				{
					System.out.println("\n★ 상품 획득 ★\n");
					System.out.println(productName + "이(가) 출력되었습니다.");
					storeMoney -= price;
					System.out.println("잔돈은 " + storeMoney + "원 입니다.");
					price = 0;
					System.out.print("추가 구매 하시겠습니까?(y/n) : ");
					purchaseCheck = input.next().charAt(0);
					
					// 문자 예외 체크
					if (additionalInputCheck != 'n' && additionalInputCheck != 'N' &&
							additionalInputCheck != 'y' && additionalInputCheck != 'Y')
					{
						System.out.println("문자를 잘못 입력하셨습니다.");
						break;
					}
				}
				
				// (저장금액 - 상품가격) < 0
				// 돈이 부족한 경우 && 상품번호가 정상일 경우
				if(((storeMoney - price) < 0) && (productNumber > 0 && productNumber <= 10)) {
					System.out.println("상품 금액 : " + price);
					System.out.println("현재 금액 : " + storeMoney);
					System.out.print("돈이 모자랍니다. 돈을 더 투입하시겠습니까?(y/n) : ");
					additionalInputCheck = input.next().charAt(0);
					
					// 금액 투입
					if (additionalInputCheck == 'y' || additionalInputCheck == 'Y') {
						break;
					}
					
					// 더 투입하지 않으면 종료
					if (additionalInputCheck == 'n' || additionalInputCheck == 'N') {
						System.out.println("잔돈을 반환합니다.");
						System.out.println("잔돈은 " + storeMoney + "원 입니다.");
						purchaseCheck = 'n';
						break;
					}
					
					// 문자 예외 체크
					if (additionalInputCheck != 'n' && additionalInputCheck != 'N' &&
							additionalInputCheck != 'y' && additionalInputCheck != 'Y')
					{
						System.out.println("문자를 잘못 입력하셨습니다.");
						break;
					}
				}
			}
			
			// 상품 구입 종료 및 잔돈 반환 이후 프로그램 종료
			if (purchaseCheck == 'n' || purchaseCheck == 'N') {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
