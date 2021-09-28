
/*
개발자 : 최성호
개발일 : 2021.08.10
프로젝트명 : 등록금 출력 프로그램(13번문제)
*/
import java.util.Scanner;

public class Tuition {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		double tuition;			// 1학년 등록금
		double twotuition;		// 2학년 등록금
		double threetuition;	// 3학년 등록금
		double fourtuition;		// 4학년 등록금
		double increase;		// 인상률
		double oneincrease;    	// 1년후 인상률
		double twoincrease;		// 2년후 인상률
		double threeincrease;	// 3년후 인상률
	
		System.out.println("등록금 출력 프로그램");
		
		System.out.print("연간 등록금을 입력하세요 : ");
		tuition=input.nextDouble();
		
		// 인상률=4.5%(4.5/100)
		increase=4.5/100;
		
		// 1년후 인상률=1학년등록금*인상률
		oneincrease=tuition*increase;
		
		// 2학년 등록금=1학년등록금+1년후인상률
		twotuition=tuition+oneincrease;
		
		// 2년후 인상률=2학년등록금*인상률
		twoincrease=twotuition*increase;
		
		// 3학년 등록금=2학년등록금+2년후인상률
		threetuition=twotuition+twoincrease;
		
		// 3년후 인상률=3학년등록금*인상률
		threeincrease=threetuition*increase;
		
		// 4학년 등록금=3학년등록금+3년후인상률
		fourtuition=threetuition+threeincrease;
		
		// 소수점 2자리까지
		oneincrease=(int)(oneincrease*100)/100;
		twotuition=(int)(twotuition*100)/100;
		twoincrease=(int)(twoincrease*100)/100;			
		threetuition=(int)(threetuition*100)/100;	
		threeincrease=(int)(threeincrease*100)/100;		
		fourtuition=(int)(fourtuition*100)/100;
		
		// 결과출력
		System.out.println("1학년 등록금 : " + tuition + "만원");
		System.out.println("2학년 등록금 : " + twotuition +  "만원\t" + "인상액 : " + oneincrease + "만원");
		System.out.println("3학년 등록금 : " + threetuition + "만원\t" + "인상액 : " + twoincrease + "만원");
		System.out.println("4학년 등록금 : " + fourtuition + "만원\t" + "인상액 : " + threeincrease + "만원");
		
	}

}
