
public class Student extends Person {

	// 필드 생성
	private int year; // 학년

	// 메소드 생성
	// 기본 생성자
	public Student() {
		super();
	}

	// 중복 생성자
	public Student(String name, String address, String number, String email, int year) {
		super(name, address, number, email);
		this.year = year;
	}

	// 년 반환
	public int getYear() {
		return year;
	}

	// 년 설정
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [getYear()=" + getYear() + ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ ", getNumber()=" + getNumber() + ", getEmail()=" + getEmail() + "]";
	}


}
