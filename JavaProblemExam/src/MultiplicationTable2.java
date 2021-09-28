
public class MultiplicationTable2 {

	public static void main(String[] args) {
		
		int i;
		int j;
		int k;
				
		System.out.println("\t\t\t\t\t\t\t 구구단");
		
		// 단 작성
		for(k = 2; k <= 9; k++) {
			System.out.print(k+"단\t\t");
		}
		System.out.println();
		
		// 구구단 계산
		for(i = 1; i <= 9; i++) {
			for( j=2; j <=9; j++) {
				System.out.print(j+" * "+i+" = "+(j*i)+"\t");
			}
			System.out.println();
		}

	}
	
}
