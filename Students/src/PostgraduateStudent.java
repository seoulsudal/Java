
public class PostgraduateStudent extends Student {

	// 필드 생성
	private String assistant; // 조교유형
	private double scholarship; // 장학금

	// 메소드 생성
	// 기본 생성자
	public PostgraduateStudent() {
		super();
	}

	// 중복 생성자
	public PostgraduateStudent(String name, int studentNumber, String affiliationDepartment, int schoolYear,
			int gradescomplete, String assistant, double scholarship) {
		super(name, studentNumber, affiliationDepartment, schoolYear, gradescomplete);
		this.assistant = assistant;
		this.scholarship = scholarship;
	}

	// 조교유형 반환
	public String getAssistant() {
		return assistant;
	}

	// 조교유형 설정
	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}

	// 장학금 반환
	public double getScholarship() {
		return scholarship;
	}

	// 장학금 설정
	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
	}

	// 출력
	@Override
	public String toString() {
		return "PostgraduateStudent [getAssistant()=" + getAssistant() + ", getScholarship()=" + getScholarship()
				+ ", getName()=" + getName() + ", getStudentNumber()=" + getStudentNumber()
				+ ", getAffiliationDepartment()=" + getAffiliationDepartment() + ", getSchoolYear()=" + getSchoolYear()
				+ ", getGradescomplete()=" + getGradescomplete() + "]";
	}

}
