
public class LoopTest12 {

	public static void main(String[] args) {
		
		// 변수 생성
		char c = 'a';
		
		do {
			System.out.print(c+" ");
			c = (char)(c + 1);
		}while(c <= 'z');

	}

}
