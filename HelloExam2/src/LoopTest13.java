import java.util.Scanner;

public class LoopTest13 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		String text;
		
		System.out.println("exit을 입력하면 종료하는 프로그램");
		
		while(true) {
			System.out.println(">>");
			text = input.nextLine();
			if(text.equals("exit")) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
