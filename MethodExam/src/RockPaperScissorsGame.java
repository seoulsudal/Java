import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int random;				// 임의의 수
		int rockPaperScissors;	// 가위바위보
		int scissors;			// 가위
		int paper;				// 보
		int rock;				// 바위
		int computerWin;		// 컴퓨터 승
		int playerWin;			// 플레이어 승
		
		// 승리 초기값 입력
		computerWin = 0;
		playerWin = 0;
		
		System.out.println("3승을 먼저 하는 사람이 이기는 가위바위보 게임 입니다.");
		
		// 가위바위보 입력
		do{
			while(true) {
				System.out.println("가위 바위 보 중에 입력하세요.(0~2)");
				rockPaperScissors = input.nextInt();
				if(rockPaperScissors < 0 || rockPaperScissors >= 3) {
					System.out.println("0 ~ 2 사이의 숫자를 입력해주세요.");
				}
				else {
					break;
				}
			}
			// 임의의 수 생성
			random = (int) (Math.random() * 3);
		
			switch (random) {
			case 0:

				if (rockPaperScissors == 0) {
					System.out.println("컴퓨터가 가위를 냈습니다.");
					System.out.println("플레이어가 가위를 냈습니다.");
					System.out.println("비겼습니다.");
				}
				else if (rockPaperScissors == 1) {
					System.out.println("컴퓨터가 가위를 냈습니다.");
					System.out.println("플레이어가 바위를 냈습니다.");
					System.out.println("이겼습니다.");
					playerWin++;
				}
				else if (rockPaperScissors == 2) {
					System.out.println("컴퓨터가 가위를 냈습니다.");
					System.out.println("플레이어가 보를 냈습니다.");
					System.out.println("졌습니다.");
					computerWin++;
				}
				break;
			case 1:
				if (rockPaperScissors == 0) {
					System.out.println("컴퓨터가 바위를 냈습니다.");
					System.out.println("플레이어가 가위를 냈습니다.");
					System.out.println("졌습니다.");
					computerWin++;
				}
				else if (rockPaperScissors == 1) {
					System.out.println("컴퓨터가 바위를 냈습니다.");
					System.out.println("플레이어가 바위를 냈습니다.");
					System.out.println("비겼습니다.");
				}
				else if (rockPaperScissors == 2) {
					System.out.println("컴퓨터가 바위를 냈습니다.");
					System.out.println("플레이어가 보를 냈습니다.");
					System.out.println("이겼습니다.");
					playerWin++;
				}
				break;
			case 2:
				if (rockPaperScissors == 0) {
					System.out.println("컴퓨터가 보를 냈습니다.");
					System.out.println("플레이어가 가위를 냈습니다.");
					System.out.println("이겼습니다.");
					playerWin++;
				}
				else if (rockPaperScissors == 1) {
					System.out.println("컴퓨터가 보를 냈습니다.");
					System.out.println("플레이어가 바위를 냈습니다.");
					System.out.println("졌습니다.");
					computerWin++;
				}
				else if (rockPaperScissors == 2) {
					System.out.println("컴퓨터가 보를 냈습니다.");
					System.out.println("플레이어가 보를 냈습니다.");
					System.out.println("비겼습니다.");
				}
				else {
			}
				
			if((playerWin >= 3) || (computerWin >= 3)) {
				System.out.println("\n게임이 종료됩니다.");
				if(playerWin > computerWin) {
					System.out.println("플레이어가 승리했습니다.");
				}
				else {
					System.out.println("컴퓨터가 승리했습니다.");
				}
				break;
			}
			}	
		}while(true);
		
	}

}
