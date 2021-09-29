
public class ComputeSalary {

	public static void main(String[] args) {
		
		SalariedEmployee s = new SalariedEmployee("현용주", 11760605, 3000000);
		HourlyEmployee h = new HourlyEmployee();
		
		h.setName("홍길동");
		h.setEmployeeNumber(21760605);
		h.setHourlySalary(9500);
		h.setWorkingHours(208);
		
		System.out.println(s);
		System.out.println(h);
		
		s.computeSalary();
		h.computeSalary();
	}

}
