
public class SalesTest {

	public static void main(String[] args) {
		// 회사 인스턴스 생성
		Sales samsung = new Sales();
		
		samsung.setTakes();
		samsung.printEachDepartmentTotal();
		samsung.printEachSeparateTotal();
		samsung.printAverageSeparateTotal();
		samsung.printYearTotal();
	}

}
