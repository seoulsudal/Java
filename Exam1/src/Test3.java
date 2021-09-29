import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String text;
		
		System.out.println("입력하세요.");
		text = input.nextLine();
		
		if (text.equals("안녕")) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
		
		

	}

}
