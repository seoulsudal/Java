import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int money = 0; // 투입금액
		int totalInput = 0;	//총 투입금
		int choice; // 메뉴선택
		int moneyChoice = 0;// 금액 추가 투입
		int smallChange = 0; // 잔돈
		int cola; // 콜라
		int fanta; // 환타
		int chisung; // 사이다
		int yulmuCha; // 율무차
		int kenCoffee; // 커피
		int pocari; // 포카리
		int icedTea; // 아이스티
		int latte; // 라떼
		int drPepper; // 닥터페퍼
		int welchs; // 웰치스

		// 메뉴 가격

		cola = 100; // 콜라=100
		fanta = 200; // 환타=200
		chisung = 300; // 사이다=300
		yulmuCha = 400; // 율무차=400
		kenCoffee = 500; // 커피=500
		pocari = 600; // 포카리=600
		icedTea = 700; // 아이스티=700
		latte = 800; // 라떼=800
		drPepper = 900; // 닥터페퍼=900
		welchs = 1000; // 웰치스=1000

		String cokeName; // 콜라
		String fantaName; // 환타
		String chisungName; // 사이다
		String yulmuChaName; // 율무차
		String kenCoffeeName; // 커피
		String pocariName; // 포카리
		String icedTeaName; // 아이스티
		String latteName; // 라떼
		String drPepperName; // 닥터페퍼
		String welchsName; // 월치스

		cokeName = "콜라"; // cokeName=콜라
		fantaName = "환타"; // fantaName=환타
		chisungName = "사이다"; // chisungName=사이다
		yulmuChaName = "율무차"; // yulmuChaName=율무차
		kenCoffeeName = "커피"; // kenCoffeeName=커피
		pocariName = "포카리"; // pocariName=포카리
		icedTeaName = "아이스티"; // incedTeaName=아이스티
		latteName = "라떼"; // latteName=라떼
		drPepperName = "닥터페퍼"; // drPepperName=닥터페퍼
		welchsName = "웰치스"; // welchsName=웰치스

		// 자판기 메뉴
		System.out.println("\t   자판기 메뉴");
		System.out.println("");
		System.out.print("1. " + cokeName + ":" + cola + "원");
		System.out.println("\t2. " + fantaName + " :" + fanta + "원");
		System.out.println("");
		System.out.print("3. " + chisungName + " :" + chisung + "원");
		System.out.println("\t4. " + yulmuChaName + " :" + yulmuCha + "원");
		System.out.println();
		System.out.print("5. " + kenCoffeeName + " :" + kenCoffee + "원");
		System.out.println("\t6. " + pocariName + " :" + pocari + "원");
		System.out.println();
		System.out.print("7. " + icedTeaName + ":" + icedTea + "원");
		System.out.println("\t8. " + latteName + " :" + latte + "원");
		System.out.println();
		System.out.print("9. " + drPepperName + ":" + drPepper + "원");
		System.out.println("\t10. " + welchsName + " :" + welchs + "원");
		System.out.println();
		System.out.println("종료하실때는 금액 투입에 -1을 입력해 주세요.");
		
		while (true) {
			
			// 금액 투입
			System.out.print("금액을 투입하세요 :");
			money = input.nextInt();
			totalInput = totalInput + money;
			
			
				
			//반복 종료 버튼
			if (money == -1) {
				System.out.println("종료. 반환금" + smallChange );
				break;
			}
			
			//금액이 상품최소금액 보다 작을시 추가 투입 or 종료
			if (totalInput < cola) {
				totalInput = totalInput + money;
				System.out.print("최소 상품금액보다 투입금이 적습니다\n 추가투입 or 종료 : ");
				money = input.nextInt();
				totalInput = totalInput + money;
			}
			
			//총 투입금 출력
			System.out.print("총 투입금액은" + totalInput + "입니다");
			System.out.println();
			
			//금액 연속 투입
			while (moneyChoice != 2) {
				
				System.out.print("금액을 추가 투입 하시겠습니까? \n1.추가투입  2.상품선택 : ");
				moneyChoice = input.nextInt();
				if (moneyChoice == 1) {
					System.out.print("금액을 투입하세요 :");
					money = input.nextInt();
					totalInput = totalInput + money;
				}
			}
			
			//총 투입금 출력
			System.out.print("총 투입금액은" + totalInput + "입니다");
			System.out.println();
			
			//상품 선택
			System.out.print("상품을 선택해주세요 : ");
			choice = input.nextInt();
			
			switch (choice) {
			case 1:
				
				//잔돈 계산
				smallChange = totalInput - cola;
				
				//선택한 상품과 남은 금액 표시
				System.out.println("선택상품> " + cokeName + "\n남은금액> " + smallChange);
				break;
			case 2:
				//총 투입금이 상품금액 보다 적을 경우 다시 투입 or 종료
				if (totalInput < fanta) {
					System.out.print("투입금이 상품금액 보다 적습니다.\n 추가 투입 or 종료 : ");
					money = input.nextInt();
					totalInput = totalInput + money;
				}
				
				//잔돈 계산
				smallChange = totalInput - fanta;
				
				//선택한 상품과 남은 금액 표시
				System.out.println("선택상품> " + fantaName + "\n남은금액> " + smallChange);
				break;
			case 3:
				//총 투입금이 상품금액 보다 적을 경우 다시 투입 or 종료
				if (totalInput < chisung) {
					System.out.print("투입금이 상품금액 보다 적습니다.\n 추가 투입 or 종료 : ");
					money = input.nextInt();
					totalInput = totalInput + money;
				}
				
				//잔돈 계산
				smallChange = totalInput - chisung;
				
				//선택한 상품과 남은 금액 표시
				System.out.println("선택상품> " + chisungName + "\n남은금액> " + smallChange);
				break;
			case 4:
				//총 투입금이 상품금액 보다 적을 경우 다시 투입 or 종료
				if (totalInput < yulmuCha) {
					System.out.print("투입금이 상품금액 보다 적습니다.\n 추가 투입 or 종료 : ");
					money = input.nextInt();
					totalInput = totalInput + money;
				}
				
				//잔돈 계산
				smallChange = totalInput - yulmuCha;
				
				//선택한 상품과 남은 금액 표시
				System.out.println("선택상품> " + yulmuChaName + "\n남은금액> " + smallChange);
				break;
			case 5:
				//총 투입금이 상품금액 보다 적을 경우 다시 투입 or 종료
				if (totalInput < kenCoffee) {
					System.out.print("투입금이 상품금액 보다 적습니다.\n 추가 투입 or 종료 : ");
					money = input.nextInt();
					totalInput = totalInput + money;
				}
				//잔돈 계산
				smallChange = totalInput - kenCoffee;
				
				//선택한 상품과 남은 금액 표시
				System.out.println("선택상품> " + kenCoffeeName + "\n남은금액> " + smallChange);
				break;
			case 6:
				//총 투입금이 상품금액 보다 적을 경우 다시 투입 or 종료
				if (totalInput < pocari) {
					System.out.print("투입금이 상품금액 보다 적습니다.\n 추가 투입 or 종료 : ");
					money = input.nextInt();
					totalInput = totalInput + money;
				}
				//잔돈 계산
				smallChange = totalInput - pocari;
				
				//선택한 상품과 남은 금액 표시
				System.out.println("선택상품> " + pocariName + "\n남은금액> " + smallChange);
				break;
			case 7:
				//총 투입금이 상품금액 보다 적을 경우 다시 투입 or 종료
				if (totalInput < icedTea) {
					System.out.print("투입금이 상품금액 보다 적습니다.\n 추가 투입 or 종료 : ");
					money = input.nextInt();
					totalInput = totalInput + money;
				}
				//잔돈 계산
				smallChange = totalInput - icedTea;
				
				//선택한 상품과 남은 금액 표시
				System.out.println("선택상품> " + icedTeaName + "\n남은금액> " + smallChange);
				break;
			case 8:
				//총 투입금이 상품금액 보다 적을 경우 다시 투입 or 종료
				if (totalInput < latte) {
					System.out.print("투입금이 상품금액 보다 적습니다.\n 추가 투입 or 종료 : ");
					money = input.nextInt();
					totalInput = totalInput + money;
				}
				//잔돈 계산
				smallChange = totalInput - latte;
				
				//선택한 상품과 남은 금액 표시
				System.out.println("선택상품> " + latteName + "\n남은금액> " + smallChange);
				break;
			case 9:
				//총 투입금이 상품금액 보다 적을 경우 다시 투입 or 종료
				if (totalInput < drPepper) {
					System.out.print("투입금이 상품금액 보다 적습니다.\n 추가 투입 or 종료 : ");
					money = input.nextInt();
					totalInput = totalInput + money;
				}
				//잔돈 계산
				smallChange = totalInput - drPepper;
				
				//선택한 상품과 남은 금액 표시
				System.out.println("선택상품> " + drPepperName + "\n남은금액> " + smallChange);
				break;
			case 10:
				//총 투입금이 상품금액 보다 적을 경우 다시 투입 or 종료
				if (totalInput < welchs) {
					System.out.print("투입금이 상품금액 보다 적습니다.\n 추가 투입 or 종료 : ");
					money = input.nextInt();
					totalInput = totalInput + money;
				}
				//잔돈 계산
				smallChange = totalInput - welchs;
				
				//선택한 상품과 남은 금액 표시
				System.out.println("선택상품> " + welchsName + "\n남은금액> " + smallChange);
				break;
			default:
				System.out.println("번호를 다시 선택해 주세요.");
				break;
			}
		}
	}
}
