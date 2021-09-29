
public class ArrayClassTest {

	public static void main(String[] args) {
		
		// s 배열에 2차원 배열 생성
		double[][] s = new double[3][5];
		
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 5; i++) {
				System.out.printf("s[%d][%d]=%.1f \t",j,i,s[j][i]);
			}		
			System.out.println("");
		}
	}

}
