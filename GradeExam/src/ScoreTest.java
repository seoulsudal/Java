
public class ScoreTest {

	public static void main(String[] args) {
		
		Score oneClass = new Score();
		oneClass.name = "홍길동";
		oneClass.kor = 90;
		oneClass.eng = 100;
		oneClass.math = 95;
		oneClass.printData();
		
		Score twoClass = new Score();
		twoClass.name = "김철수";
		twoClass.kor = 90;
		twoClass.eng = 80;
		twoClass.math = 95;
		twoClass.printData();
	}

}
