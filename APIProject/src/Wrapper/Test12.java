package Wrapper;

public class Test12 {

	public static void main(String[] args) {

		int n1 = 10;
		Integer obj1 = n1;
		
		Integer obj2 = Integer.valueOf(20);
		int n2 = obj2;
		
		Integer obj3 = 30;
		
		int n3 = obj3 + 40;
		
		System.out.println(n1 + " : " + obj1);
		System.out.println(obj2 + " : " + n2);
		System.out.println(n3);
	}

}
