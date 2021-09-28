
public class Staff extends Person {

	// 필드 생성
	private String rank; // 직위

	// 메소드 생성
	// 기본 생성자
	public Staff() {
		super();
	}

	// 중복 생성자
	public Staff(String name, String address, String number, String email, String rank) {
		super(name, address, number, email);
		this.rank = rank;
	}

	// 직급 반환
	public String getRank() {
		return rank;
	}

	// 직급 설정
	public void setRank(String rank) {
		this.rank = rank;
	}

	// 출력
	@Override
	public String toString() {
		return "Staff [getRank()=" + getRank() + ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ ", getNumber()=" + getNumber() + ", getEmail()=" + getEmail() + "]";
	}

}
