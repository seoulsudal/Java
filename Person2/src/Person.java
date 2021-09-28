
public class Person {

	// 필드 생성
	private String name;
	private String address;
	private String number;
	private String email;

	// 메소드 생성
	// 기본 생성자
	public Person() {
		super();
	}

	// 중복 생성자
	public Person(String name, String address, String number, String email) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
		this.email = email;
	}

	// 이름 반환
	public String getName() {
		return name;
	}

	// 이름 설정
	public void setName(String name) {
		this.name = name;
	}

	// 주소 반환
	public String getAddress() {
		return address;
	}

	// 주소 설정
	public void setAddress(String address) {
		this.address = address;
	}

	// 번호 반환
	public String getNumber() {
		return number;
	}

	// 번호 설정
	public void setNumber(String number) {
		this.number = number;
	}

	// 메일 반환
	public String getEmail() {
		return email;
	}

	// 메일 설정
	public void setEmail(String email) {
		this.email = email;
	}

	// 출력
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", number=" + number + ", email=" + email + "]";
	}

}
