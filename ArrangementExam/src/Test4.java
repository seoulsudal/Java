import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] kor = {80, 95, 90, 85, 100};
		int[] eng = new int[5];
				
		for(int i = 0; i < eng.length; i++) {
			System.out.println("영어 점수를 입력해 주세요.");
			eng[i] = input.nextInt();
		}
		
		for(int j = 0; j < kor.length; j++) {
			System.out.println("국어 : "+kor[j]+" 영어 : "+eng[j]);
		}
		

	}

}
