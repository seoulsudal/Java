
public class HRSTest {

	public static void main(String[] args) {
		Salesman s1 = new Salesman();
		Employee s2 = new Salesman();
		Object s3 = new Salesman();
		
		Object m1 = new Manager();
		Employee m2 = new Manager();
		Manager m3 = new Manager();
		//director m4 = new Manager();	// 에러
		
		//s.calcBonus();
		//c.calcBonus();
		//d.calcBonus();

		//calcTax(s);
		//calcTax(c);
		//calcTax(d);
		
		//System.out.println(s.toString());
		//System.out.println(c.toString());
		//System.out.println(d.toString());
		
		//Salesman s2 = s;
		//System.out.println(s2.toString());
		
		//if(s.equals(s2)) {
		//	System.out.println("동일한 객체 입니다.");
		//}
		//else {
		//	System.out.println("서로 다른 객체 입니다.");
		//}
	}

	public static void calcTax(Employee e) {
		System.out.println("소득세 계산합니다.");
		
	}
}
