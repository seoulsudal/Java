
public class Person {

	// 필드 생성
	private String name;
	private int age;

	// 메소드 생성
	// 기본 생성자
	public Person() {
		System.out.println("Person 생성자 실행!");
	}

	// 중복 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}

	// 이름 반환
	public String getName() {
		return name;
	}

	// 이름 설정
	public void setName(String name) {
		this.name = name;
	}

	// 나이 반환
	public int getAge() {
		return age;
	}

	// 나이 설정
	public void setAge(int age) {
		this.age = age;
	}

	// 출력
	@Override
	public String toString() {
		return name + ":" + age;
	}

}
