
public class Greeting { 							//1

	public static void main(String[] args) {		//2
		// 첫번째 방법
		 //String name;								//3
		//name = StringPrint("홍길동");				//4-6 = 4-1
		// System.out.println(name);				//5
		// 두번째 방법
		 StringPrint("홍길동");
	}
	
	// 하나의 문자열 출력 메소드
	public static void StringPrint(String str) {	//4-2
		 //첫번째 방법
		// String hi;								//4-3
		// hi = " 안녕!";								//4-4
		 //return (str + hi);						//4-5
		 //두번째 방법
		 System.out.println(str+" 안녕!");
		}
	
}
