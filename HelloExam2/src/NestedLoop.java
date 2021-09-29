
public class NestedLoop {

	public static void main(String[] args) {
		
		int i;
		int j;
		
		for(j = 2; j <= 9; j++) {
			System.out.println(j+"단의 구구단");
			for(i = 1; i <= 9; i++) {
				System.out.println(j+" * "+i+" = "+(j*i));
			}
			System.out.println();
		}

	}

}
