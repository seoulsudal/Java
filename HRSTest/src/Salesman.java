
public class Salesman extends Employee {

	@Override
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");

	}

	@Override
	public void calcBonus() {
		System.out.println("Saleman 보너스 = 기본급 * 12 * 4");

	}

}
