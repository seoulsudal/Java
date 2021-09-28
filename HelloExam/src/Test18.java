import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String graduation;			//졸업여부 변수 선언
		boolean graduationCondition;//졸업조건 변수 선언
		boolean a;					//조건1 변수 선언
		boolean b;					//조건2 변수 선언
		boolean c;					//조건3 변수 선언
		int total;					//총학점 변수 선언
		int major;					//전공 변수 선언
		int liberal;				//교양 변수 선언
		int general;				//일반 변수 선언
		
		System.out.println("전공 점수를 입력하세요.");
		major = input.nextInt();	//전공 점수 받기
		
		System.out.println("교양 점수를 입력하세요.");
		liberal = input.nextInt();	//교양 점수 받기
		
		System.out.println("일반 점수를 입력하세요.");
		general = input.nextInt();	//일반 점수 받기
						
		total = major + liberal + general; //총학점 계산
		
		//graduation = ( total >= 140 && major >= 70 && ((liberal >=30 && general >= 30) || liberal + general >= 80))  ? "졸업" : "재수강";

		a = ( total >= 140 );	//총점 140점 이상인가?
		b = ( major >= 70 );	//전공이 70점 이상인가?
		c = ((liberal >= 30 && general >= 30) || liberal + general >= 80); //교양 및 일반이 각각 30점 이상인가? 또는 합해서 80점 이상인가?
		
		graduationCondition = ( a == b == c);
		
		graduation = ( graduationCondition == true ) ? "졸업" : "재수강";
		
		System.out.println(graduation);
		
		
		

	}

}
