
public class HRSTest2 {

	public static void calcTax(Employee e) {
		if(e instanceof Salesman) {
			System.out.println("Salesman 입니다.");
		}
		else if(e instanceof Manager) {
			System.out.println("Manager 입니다.");
		}
		else if(e instanceof Consultant) {
			System.out.println("Consultant 입니다.");
		}
		else {
			System.out.println("Employee 입니다.");
		}
		
	}
}
