import java.util.Scanner;

public class KeyboardInput2 {

	public static void main(String[] args) {

		Scanner stdIn=new Scanner(System.in);
		
		String name; //이름 변수 선언
		int i; //나이 변수 선언
		double d; //몸무게 변수 선언
		
		System.out.println("이름과 나이, 몸무게를 입력하세요.");
		
		name = stdIn.nextLine(); //이름 입력
		i = stdIn.nextInt(); //나이 입력
		d = stdIn.nextDouble(); //몸무게 입력
		
		System.out.println(name+"씨의 나이는 "+i+"세이고, ");
		System.out.println("몸무게는 "+d+"Kg 입니다.");

	}

}
