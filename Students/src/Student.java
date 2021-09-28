
public class Student {

	// 필드 생성
	private String name;					// 이름
	private int studentNumber;				// 학번
	private String affiliationDepartment;	// 소속학과
	private int schoolYear;					// 학년
	private int gradescomplete;				// 이수학점

	// 메소드 생성
	// 기본 생성자
	public Student() {
		super();
	}

	// 중복 생성자
	public Student(String name, int studentNumber, String affiliationDepartment, int schoolYear, int gradescomplete) {
		super();
		this.name = name;
		this.studentNumber = studentNumber;
		this.affiliationDepartment = affiliationDepartment;
		this.schoolYear = schoolYear;
		this.gradescomplete = gradescomplete;
	}

	// 이름 반환
	public String getName() {
		return name;
	}

	// 이름 설정
	public void setName(String name) {
		this.name = name;
	}

	// 학번 반환
	public int getStudentNumber() {
		return studentNumber;
	}

	// 학번 설정
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	// 소속학과 반환
	public String getAffiliationDepartment() {
		return affiliationDepartment;
	}

	// 소속학과 설정
	public void setAffiliationDepartment(String affiliationDepartment) {
		this.affiliationDepartment = affiliationDepartment;
	}

	// 학년 반환
	public int getSchoolYear() {
		return schoolYear;
	}

	// 학년 설정
	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}

	// 이수학점 반환
	public int getGradescomplete() {
		return gradescomplete;
	}

	// 이수학점 설정
	public void setGradescomplete(int gradescomplete) {
		this.gradescomplete = gradescomplete;
	}

	// 출력
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentNumber=" + studentNumber + ", affiliationDepartment="
				+ affiliationDepartment + ", schoolYear=" + schoolYear + ", gradescomplete=" + gradescomplete + "]";
	}

}
