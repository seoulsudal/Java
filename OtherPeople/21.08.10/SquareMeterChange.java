import java.util.Scanner;

public class SquareMeterChange {

	public static void main(String[] args) {
		
		System.out.println("평을 입력받아 평방미터로 환산하는 프로그램");
		
		int flat;//평
		double squareMeter;//평방미터
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("평을 입력하시오 : ");
		flat = input.nextInt();
		
		//평을 평방미터로 환산하는 변환식
		squareMeter = flat*3.3058; // 평방미터 = 평*3.3058
		
		System.out.println("입력한 평은 : " + flat);
		System.out.println("환산한 평방미터는 : " + squareMeter + "㎡");
	}

}
