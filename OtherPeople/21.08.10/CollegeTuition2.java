import java.util.Scanner;

public class CollegeTuition {

	public static void main(String[] args) {
		//Scanner 클래스 생성
		Scanner input=new Scanner(System.in);
					
		double universityTuitionFee;      //1학년 대학 등록금
		double secondYearTuition;         //2학년 등록금
		double thirdYearTuition;          //3학년 등록금
		double fourthYearTuition;         //4학년 등록금
		double totalTuition;                       //총 등록금
			
		//1학년 대학 등록금을 입력
		System.out.print("1학년 대학 등록금(예: 1000만원) : ");
		universityTuitionFee=input.nextDouble();
		System.out.println("매년 인상률 : 4.5%");
		
		//2학년 등록금=(대학 등록금*4.5%)+대학 등록금
		secondYearTuition=(int)((universityTuitionFee*4.5)/100.0)+universityTuitionFee;
		
		//3학년 등록금=(2학년 등록금*4.5%)+2학년 등록금
		thirdYearTuition=(int)((secondYearTuition*4.5)/100.0)+secondYearTuition;
		
		//4학년 등록금=(3학년 등록금*4.5%)+3학년 등록금
		fourthYearTuition=(int)((thirdYearTuition*4.5)/100.0)+thirdYearTuition;
		
		//총 등록금=1학년 대학 등록금+2학년 등록금+3학년 등록금+4학년 등록금
		totalTuition=universityTuitionFee+secondYearTuition+thirdYearTuition+fourthYearTuition;
		
		//4년동안의 등록금 결과
		System.out.println("1학년 대학 등록금 : "+(int)universityTuitionFee+"만원");
		System.out.println("2학년 대학 등록금 : "+(int)secondYearTuition+"만원");
		System.out.println("3학년 대학 등록금 : "+(int)thirdYearTuition+"만원");
		System.out.println("4학년 대학 등록금 : "+(int)fourthYearTuition+"만원");
		System.out.println("총 등록금은 : "+ (int)totalTuition+"만원");
		
	}

}
