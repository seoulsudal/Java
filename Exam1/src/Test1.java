import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int random;				// 컴퓨터
		int player;				// 플레이어
		int computerWin;		// 컴퓨터 승
		int playerWin;			// 플레이어 승
		
		String randomStr;		// 컴퓨터
		String playerStr;		// 플레이어

		// 승리 초기값 입력
		computerWin = 0;
		playerWin = 0;

		// 문자열 초기화 입력
		randomStr = "";
		playerStr = "";
		
		// 임의의 수 생성
		random = (int) (Math.random() * 3);
		
		// 가위바위보 입력
		System.out.println("가위 바위 보 중에 입력하세요.(0~2)");
		player = input.nextInt();
		
		switch(random) {
		case 0:
			randomStr = "가위";
			break;
		case 1:
			randomStr = "바위";
			break;
		case 2:
			randomStr = "보";
			break;
		}
		
		switch(player) {
		case 0:
			playerStr = "가위";
			break;
		case 1:
			playerStr = "바위";
			break;
		case 2:
			playerStr = "보";
			break;
		default :
			System.out.println("숫자를 잘못 입력하셨습니다.");
			System.out.println("재실행하여 다시 입력해주세요.");
		}
		
		if (player >= 0 && player < 3 ) {
			switch(random - player) {
			case -2:
				++computerWin;
				System.out.println("컴퓨터가 "+randomStr+"를 냈습니다.");
				System.out.println("플레이어가 "+playerStr+"를 냈습니다.");
				System.out.println("플레이어가 졌습니다.");
				break;
			case -1:
				++playerWin;
				System.out.println("컴퓨터가 "+randomStr+"를 냈습니다.");
				System.out.println("플레이어가 "+playerStr+"를 냈습니다.");
				System.out.println("플레이어가 이겼습니다.");
				break;
			case 0:
				System.out.println("컴퓨터가 "+randomStr+"를 냈습니다.");
				System.out.println("플레이어가 "+playerStr+"를 냈습니다.");
				System.out.println("플레이어가 비겼습니다.");
				break;
			case 1:
				++computerWin;
				System.out.println("컴퓨터가 "+randomStr+"를 냈습니다.");
				System.out.println("플레이어가 "+playerStr+"를 냈습니다.");
				System.out.println("플레이어가 졌습니다.");
				break;
			case 2:
				++playerWin;
				System.out.println("컴퓨터가 "+randomStr+"를 냈습니다.");
				System.out.println("플레이어가 "+playerStr+"를 냈습니다.");
				System.out.println("플레이어가 이겼습니다.");
				break;
			}
		}

	}

}