import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int candy; //총 사탕 수
		int student;	//학생 수
		int give;		//지급 수
		int over;		//남은 수
		
		System.out.println("학생 수를 입력하세요.");
		student = input.nextInt();	//학생 수 입력
		
		System.out.println("사탕 수를 입력하세요.");
		candy = input.nextInt();	//사탕 수 입력
		
		give = candy / student;		//지급 수 계산
		
		over = candy % student;		//남은 수 계산
		
		System.out.println("각 학생들이 받을 수 있는 사탕은 "+give+"개 이고, 남은 사탕은 "+over+"개 이다.");
		
		
		

	}

}
