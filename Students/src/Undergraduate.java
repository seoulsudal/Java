
public class Undergraduate extends Student {

	// 필드 생성
	private String club;	// 동아리

	// 메소드 생성
	// 기본 생성자 
	public Undergraduate() {
		super();
	}

	// 중복 생성자
	public Undergraduate(String name, int studentNumber, String affiliationDepartment, int schoolYear,
			int gradescomplete, String club) {
		super(name, studentNumber, affiliationDepartment, schoolYear, gradescomplete);
		this.club = club;
	}
	
	// 동아리 반환
	public String getClub() {
		return club;
	}

	// 동아리 설정
	public void setClub(String club) {
		this.club = club;
	}

	// 출력
	@Override
	public String toString() {
		return "undergraduate [getClub()=" + getClub() + ", getName()=" + getName() + ", getStudentNumber()="
				+ getStudentNumber() + ", getAffiliationDepartment()=" + getAffiliationDepartment()
				+ ", getSchoolYear()=" + getSchoolYear() + ", getGradescomplete()=" + getGradescomplete() + "]";
	}

}
