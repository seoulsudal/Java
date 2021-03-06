
public class Faculty extends Person {

	// 필드 생성
	private String consoltationTime;	// 상담 시간
	private int sequence; 			// 순서

	// 메소드 생성
	// 기본 생성자
	public Faculty() {
		super();
	}

	// 중복 생성자
	public Faculty(String name, String address, String number, String email, String consoltationTime, int sequence) {
		super(name, address, number, email);
		this.consoltationTime = consoltationTime;
		this.sequence = sequence;
	}

	// 상담시간 반환
	public String getConsoltationTime() {
		return consoltationTime;
	}

	// 상담시간 설정
	public void setConsoltationTime(String consoltationTime) {
		this.consoltationTime = consoltationTime;
	}

	// 순서 반환
	public int getSequence() {
		return sequence;
	}

	// 순서 설정
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	// 출력
	@Override
	public String toString() {
		return "Faculty [getConsoltationTime()=" + getConsoltationTime() + ", getSequence()=" + getSequence()
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getNumber()=" + getNumber()
				+ ", getEmail()=" + getEmail() + "]";
	}

}
