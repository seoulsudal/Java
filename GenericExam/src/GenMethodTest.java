
public class GenMethodTest {

	public static void main(String[] args) {
/*
		Integer[] inum = {1, 2, 3, 4, 5};
		Double[] dnum = {1.0, 2.0, 3.0, 4.0, 5.0};
		String[] snum = {"one", "two", "three", "four", "five"};
		
		boolean b1 = isInclude(3, inum);
		System.out.println("결과 : " + b1);
		
		boolean b2 = isInclude(5.0, dnum);
		System.out.println("결과 : " + b2);
		
		// g.isInclude("one", snum);
		
		GenMethodTest.<Integer, Integer>isInclude(3, inum);
		GenMethodTest.<Double, Double>isInclude(5.0, dnum);
	}
*/
		String s = new String("서울");
		StringBuffer sbuf = new StringBuffer("대전");
		
		
	}
	static <T extends Number, V extends T> boolean isInclude(T num, V[] array) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	class StringUtil {
		private String value;
		
		<T extends CharSequence> StringUtil(T value){
			this.value = value.toString();
		}
		
		void printval() {
			System.out.println("value : " + value);
		}
	}
}
