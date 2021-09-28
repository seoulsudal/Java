import java.util.Scanner;

public class VendingMachin2 {

	public static void main(String[] args) {
		int muny;// 투입금액 변수 선언
		int total;// 총금액 변수 선언
		int pay; // 물건값
		int drink;// 물건번호
		String drinkName;// 물건이름
		int choco; // 초코 변수 선언
		int apple; // 사과 변수 선언
		int candy; // 사탕 변수 선언
		int tishu; // 티슈 변수 선언
		int coffee; // 커피 변수 선언
		int coke; // 콜라 변수 선언
		int cheese; // 치즈 변수 선언
		int pear; // 배 변수 선언
		int milk; // 우유 변수 선언
		int podo; // 포도 변수 선언
		int ch;// 구매의사 변수
		int deposit;// 동전투입반복변수
		String chocos; // 초코 문자열 선언
		String apples; // 사과 문자열 선언
		String candys; // 사탕 문자열 선언
		String tishus; // 티슈 문자열 선언
		String coffees; // 커피 문자열 선언
		String cokes; // 콜라 문자열 선언
		String cheeses; // 치즈 문자열 선언
		String pears; // 배 문자열 선언
		String milks; // 우유 문자열 선언
		String podos; // 포도 문자열 선언
		chocos = "초코"; // 초코 문자열 초기화
		apples = "사과"; // 사과 문자열 초기화
		candys = "사탕"; // 사탕 문자열 초기화
		tishus = "티슈"; // 티슈 문자열 초기화
		coffees = "커피"; // 커피 문자열 초기화
		cokes = "콜라"; // 콜라 문자열 초기화
		cheeses = "치즈"; // 치즈 문자열 초기화
		pears = "배"; // 배 문자열 초기화
		milks = "우유"; // 우유 문자열 초기화
		podos = "포도"; // 포도 문자열 초기화
		total = 0;// 총금액 초기화
		pay = 0; // 물건값 초기화
		drinkName = "";// 물건이름 초기화
		choco = 500; // 초코 가격
		apple = 600; // 사과 가격
		candy = 100; // 사탕 가격
		tishu = 300; // 티슈 가격
		coffee = 500; // 커피 가격
		coke = 700; // 콜라 가격
		cheese = 800; // 치즈 가격
		pear = 1000; // 배 가격
		milk = 400; // 우유 가격
		podo = 600; // 포도 가격
		deposit = 0;// 동전투입반복변수 초기화

		Scanner input = new Scanner(System.in); // 입력받기위한 스케너 클래스 선언

		System.out.println("\t\t     음료자판기\n");
		System.out.println("\t\t       메뉴");
		System.out.println("\t┌───────────────┬───────────────┐");
		System.out.print("\t│ 1." + chocos + "(" + choco + "원)");
		System.out.println("\t│ 2." + apples + "(" + apple + "원)\t│");
		System.out.println("\t├───────────────┼───────────────┤");
		System.out.print("\t│ 3." + candys + "(" + candy + "원)\t│");
		System.out.println(" 4." + tishus + "(" + tishu + "원)\t│");
		System.out.println("\t├───────────────┼───────────────┤");
		System.out.print("\t│ 5." + coffees + "(" + coffee + "원)\t│");
		System.out.println(" 6." + cokes + "(" + coke + "원)\t│");
		System.out.println("\t├───────────────┼───────────────┤");
		System.out.print("\t│ 7." + cheeses + "(" + cheese + "원)");
		System.out.println("\t│ 8." + pears + "(" + pear + "원)\t│");
		System.out.println("\t├───────────────┼───────────────┤");
		System.out.print("\t│ 9." + milks + "(" + milk + "원)");
		System.out.println("\t│ 10." + podos + "(" + podo + "원)\t│");
		System.out.println("\t└───────────────┴───────────────┘\n");

		while (deposit != 2) {
			System.out.println("\t 1.금액 투입 | 2.반환 | 3.물건 선택");
			deposit = input.nextInt();

			switch (deposit) {
			case 1:
				System.out.print("\t 1.금액을 투입하세요 : ");
				muny = input.nextInt(); // 금액을 입력받는 콘솔
				if (muny > 0) {
					// 총금액 구하는 공식
					total = total + muny; // 총금액 = 총금액 + 투입금
					System.out.println("\n\t 총액 : " + total + "원");
				} else {
					System.out.println("\t 1원 이상만 투입가능합니다.");
				}
				break;
			case 2:
				if (total > 0) {
					System.out.println("\n\t 반환금 : " + total + "원");
				} else {
					System.out.println("\t 반환금이 없습니다.");
				}
				break;
			case 3:
				if (total >= 100) {
					System.out.println("\t\t     음료자판기\n");
					System.out.println("\t\t       메뉴");
					System.out.println("\t┌───────────────┬───────────────┐");
					System.out.print("\t│ 1." + chocos + "(" + choco + "원)");
					System.out.println("\t│ 2." + apples + "(" + apple + "원)\t│");
					System.out.println("\t├───────────────┼───────────────┤");
					System.out.print("\t│ 3." + candys + "(" + candy + "원)\t│");
					System.out.println(" 4." + tishus + "(" + tishu + "원)\t│");
					System.out.println("\t├───────────────┼───────────────┤");
					System.out.print("\t│ 5." + coffees + "(" + coffee + "원)\t│");
					System.out.println(" 6." + cokes + "(" + coke + "원)\t│");
					System.out.println("\t├───────────────┼───────────────┤");
					System.out.print("\t│ 7." + cheeses + "(" + cheese + "원)");
					System.out.println("\t│ 8." + pears + "(" + pear + "원)\t│");
					System.out.println("\t├───────────────┼───────────────┤");
					System.out.print("\t│ 9." + milks + "(" + milk + "원)");
					System.out.println("\t│ 10." + podos + "(" + podo + "원)\t│");
					System.out.println("\t└───────────────┴───────────────┘\n");
					System.out.print("\t 물건을 고르시오(1부터 10까지 수로 입력): ");
					drink = input.nextInt();

					switch (drink) {
					case 1:
						drinkName = chocos;
						pay = choco;
						break;
					case 2:
						drinkName = apples;
						pay = apple;
						break;
					case 3:
						drinkName = candys;
						pay = candy;
						break;
					case 4:
						drinkName = tishus;
						pay = tishu;
						break;
					case 5:
						drinkName = coffees;
						pay = coffee;
						break;
					case 6:
						drinkName = cokes;
						pay = coke;
						break;
					case 7:
						drinkName = cheeses;
						pay = cheese;
						break;
					case 8:
						drinkName = pears;
						pay = pear;
						break;
					case 9:
						drinkName = milks;
						pay = milk;
						break;
					case 10:
						drinkName = podos;
						pay = podo;
						break;
					default:
						System.out.println("\t 잘못 입력하셨습니다");
						break;
					}
					System.out.println("\t 선택한 물건은 : " + drinkName);
					System.out.println("\t 선택한 물건의 값은 : " + pay);
					System.out.println("\t 1.구매 | 2.취소");
					ch = input.nextInt();

					if (ch == 1) {
						if (total >= pay) {
							total -= pay; // 총금액 = 총금액 - 물건 값
							System.out.println("\n\t " + drinkName);
							System.out.println("\n\t 남은 금액 : " + total + "원");
						} else if (total < pay) {
							System.out.println("\t 금액이 부족합니다.");
						}
					} else if (ch == 2) {
						System.out.println("\t 취소했습니다.");
					} else {
						System.out.println("\t 잘못 입력했습니다.");
					}
				} else {
					System.out.println("\t 투입금이 상품의 최저 금액보다 적습니다.");
				}
				break;
			default:
				System.out.println("\t 잘못 입력했습니다.");
				break;
			}
		}
		input.close();
	}
}
