import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int time;		//받는 시간 변수 선언
		int hour;		//시 변수 선언
		int minute;		//분 변수 선언
		int second;		//초 변수 선언
		
		System.out.println("시간을 초 단위로 입력하세요.");
		time = input.nextInt();
		
		hour = time / 3600;
		minute = ( time - (hour * 3600) ) / 60;
		second = time - ( hour * 3600 ) - ( minute * 60);
		
		System.out.println(time+"초는 "+hour+"시간 "+minute+"분 "+second+"초 이다.");
		

	}

}
