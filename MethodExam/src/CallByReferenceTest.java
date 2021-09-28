
public class CallByReferenceTest {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5};
		
		System.out.println("배열 a의 변경 전");
		for(int i : a) {
			System.out.print(i+"  ");
		}
		
		System.out.println();
		modify(a);

		System.out.println("\n배열 a의 변경 후");
		for(int i : a) {
			System.out.print(i+"  ");
		}
		
	}

	private static void modify(int[] b) {
		
		for(int i = 0; i < b.length; i++) {
			b[i] *= 2;
		}
	}
	
}
