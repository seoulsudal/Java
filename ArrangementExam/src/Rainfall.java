import java.util.Scanner;

public class Rainfall {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		// 배열 생성
		double[][] rainfall = new double[3][4];	// 강수량
		double total;							// 총 강수량
		// 변수 초기화
		total = 0.0;
		// 강수량 입력
		for(int j = 0; j < rainfall.length; j++) {
			for(int i = 0; i < rainfall[0].length; i++) {
				System.out.println((j+1)+"차년도 "+(i+1)+"분기 강수량을 입력하세요.");
				rainfall[j][i] = input.nextDouble();							
			}
		}
		// 강수량 계산
		for(int j = 0; j < rainfall.length; j++) {
			for(int i = 0; i < rainfall[0].length; i++) {
				total += rainfall[j][i];
			}
			System.out.println((j+1)+"년차 강수량의 합 : "+total);
		}

	}

}
