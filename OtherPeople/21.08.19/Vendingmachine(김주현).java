import java.util.Scanner;

public class Vendingmachine {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // 콘솔을 통해 키보드로 입력값을 받는다

		int inputMoney; // 투입금액
		int sumMoney; // 총투입금액
		int productNumber; // 상품번호
		int change; // 거스름돈
		int button; // 종료
		int i;

		String colaStr;
		String ciderStr;
		String fantaStr;
		String sikhyeStr;
		String silonteaStr;
		String jetiStr;
		String greenmasilStr;
		String dejawaStr;
		String letsbeeStr;
		String macoleStr;

		colaStr = "콜라";
		ciderStr = "사이다";
		fantaStr = "환타";
		sikhyeStr = "식혜";
		silonteaStr = "실론티";
		jetiStr = "제티";
		greenmasilStr = "초록매실";
		dejawaStr = "데자와";
		letsbeeStr = "레츠비";
		macoleStr = "맥콜";
		button = 1;

		inputMoney = 0;
		sumMoney = 0;
		change = 0;

		do {//전체 반복 시작
			System.out.println("                                                     <음료자판기 메뉴>");
			System.out.println("            ");
			System.out.println(
					" -----------------------------------------------------------------------------------------------------------------------");
			System.out.print("|\t");
			System.out.print("1." + colaStr + "(100)\t");
			System.out.print("|\t");
			System.out.print("2." + ciderStr + "(200)\t");
			System.out.print("|\t");
			System.out.print("3." + fantaStr + "(300)\t");
			System.out.print("|\t");
			System.out.print("4." + sikhyeStr + "(400)\t");
			System.out.print("|\t");
			System.out.println("5." + silonteaStr + "(500)\t|");
			System.out.print(
					" -----------------------------------------------------------------------------------------------------------------------");
			System.out.println("              ");

			System.out.print("|\t");
			System.out.print("6." + jetiStr + "(600)\t");
			System.out.print("|\t");
			System.out.print("7." + greenmasilStr + "(700)\t");
			System.out.print("|\t");
			System.out.print("8." + dejawaStr + "(800)\t");
			System.out.print("|\t");
			System.out.print("9." + letsbeeStr + "(900)\t");
			System.out.print("|\t");
			System.out.println("10." + macoleStr + "(1000)\t|");
			System.out.print(
					" -----------------------------------------------------------------------------------------------------------------------");

			System.out.println("              ");
			System.out.println("              ");
			System.out.println("              ");
			System.out.println("                                                     [금액을 투입하세요.]");

			// 금액입력받기
			
			if(change==0) {			//잔돈이 0일경우 투입금 총액도 0으로 설정
				sumMoney=0;
			}
			while (button != 2) {	//작은 반복 시작. 2를 누르면 금액투입반복 종료

				System.out.println("금액을 투입해주세요.");
				inputMoney = input.nextInt();
				if (inputMoney < 0) {
					System.out.println("투입금액은 0보다 작을수 없습니다.");

				}
				//투입금총액=투입금+투입금총액
				sumMoney = sumMoney + inputMoney;
				
				
				System.out.println("투입한 금액은 " + sumMoney + "원 입니다.");
				//최저금액이 100보다 작을경우 투입금액이 부족하다고 출력
				if (inputMoney > 0 && inputMoney < 100) {
					System.out.println("투입금액이 부족합니다.");
					System.out.println("금액을 더 넣으시겠습니까?");

					System.out.println("Yes: 1 | No: 2 ");
					button = input.nextInt();
				}

				System.out.println("금액을 더 넣으시겠습니까?");
				System.out.println("Yes: 1 | No: 2  ");
				button = input.nextInt();

				if (button == 1) {
					System.out.println("금액을 투입해주세요");
					inputMoney = input.nextInt();
					System.out.println("투입한 금액은 " + sumMoney + "원 입니다.");
					System.out.println("금액을 더 넣으시겠습니까?");
					System.out.println("Yes: 1 | No: 2 ");
					button = input.nextInt();

				}
			}//작은반복 종료
			// 상품번호를 인식해 음료를 판단하고 가격을 계산한다
			if (inputMoney > 0) {				//투입금액이 음수라면 거르기
				System.out.println("상품번호를 입력해주세요! : ");
				productNumber = input.nextInt();// 상품번호 입력

				switch (productNumber) {
				case 1:
					change = sumMoney - 100;
					System.out.println("콜라를 배출합니다.");
					System.out.println("거스름돈은 " + change + "원입니다.");
					break;

				case 2:
					change = sumMoney - 200;
					System.out.println("사이다를 배출합니다.");
					System.out.println("거스름돈은 " + change + "원입니다.");
					break;

				case 3:
					change = sumMoney - 300;
					System.out.println("환타를 배출합니다.");
					System.out.println("거스름돈은 " + change + "원입니다.");
					break;

				case 4:
					change = sumMoney - 400;
					System.out.println("식혜를 배출합니다.");
					System.out.println("거스름돈은 " + change + "원입니다.");
					break;

				case 5:
					change = sumMoney - 500;
					System.out.println("실론티를 배출합니다.");
					System.out.println("거스름돈은 " + change + "원입니다.");
					break;

				case 6:
					change = sumMoney - 600;
					System.out.println("제티를 배출합니다.");
					System.out.println("거스름돈은 " + change + "원입니다.");
					break;

				case 7:
					change = sumMoney - 700;
					System.out.println("초록매실을 배출합니다.");
					System.out.println("거스름돈은 " + change + "원입니다.");
					break;

				case 8:
					change = sumMoney - 800;
					System.out.println("데자와를 배출합니다.");
					System.out.println("거스름돈은 " + change + "원입니다.");
					break;

				case 9:
					change = sumMoney - 900;
					System.out.println("레쯔비를 배출합니다.");
					System.out.println("거스름돈은 " + change + "원입니다.");
					break;

				case 10:
					change = sumMoney - 1000;
					System.out.println("맥콜을 배출합니다.");
					System.out.println("거스름돈은 " + change + "원입니다.");
					break;

				default:
					System.out.println("입력하신 번호에 해당하는 메뉴가 없습니다!");
					break;
				}

			}

			System.out.println("금액을 더 넣으시겠습니까?");
			System.out.println("Yes: 1 | 종료: 0 ");
			button = input.nextInt();

			System.out.println("잔돈을 반환합니다. : " + change);
			System.out.println("자판기를 종료합니다.");
		} while (button != 0);	//전체 반복 종료
	}
}
