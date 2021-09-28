		/* 개발자 : 박찬영
		 * 수정일 : 2021/08/10
		 */
import java.util.Scanner;

public class CollegeTuition {

	public static void main(String[] args) {

		System.out.println("매년 등록금이 4.5% 증가한다고 가정하고 4년 동안의 등록금을 출력하는 프로그램");
		
		int tuition;//1년 대학 등록금
		double upTuition;// 인상된 폭
		double plusTuition2years;// 증가한 2년째 대학 등록금
		double plusTuition3years;// 증가한 3년째 대학 등록금
		double plusTuition4years;// 증가한 4년째 대학 등록금
		double totalTuition;//총 대학 등록금
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("연 대학 등록금을 입력하시오 : ");
		tuition = input.nextInt();
		
		//총 대학 등록금을 구하는 공식
		upTuition = tuition*0.045; // 인상된 폭 = 등록금*0.045
		plusTuition2years = tuition + upTuition; //2년째 등록금 = 등록금 + 인상된 폭
		upTuition = plusTuition2years*0.045; // 인상된 폭 = 등록금*0.045
		plusTuition3years = plusTuition2years + upTuition;//3년째 등록금 = 2년째 등록금 + 인상된 폭
		upTuition = plusTuition3years*0.045; // 인상된 폭 = 등록금*0.045
		plusTuition4years = plusTuition3years + upTuition;//4년째 등록금 = 3년째 등록금 + 인상된 폭
		totalTuition = tuition + plusTuition2years + plusTuition3years + plusTuition4years; 
		// 4년동안의 대학 등록금 = 처음 입력한 등록금 + 2년째 증가했던 등록금 + 3년째 증가했던 등록금 + 4년째 증가했던 등록금
		
		System.out.println("입력한 등록금 : " + tuition + "만원");
		System.out.println("2년째 등록금 : " + plusTuition2years + "만원");
		System.out.println("3년째 등록금 : " + plusTuition3years + "만원");
		System.out.println("4년째 등록금 : " + plusTuition4years + "만원");
		System.out.printf("4년동안의 등록금은 : %.2f만원",totalTuition);
	}

}
