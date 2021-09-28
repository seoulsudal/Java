
public class Person {

	// 필드 생성
	private String name;	// 이름
	private int age;		// 나이

	// 메소드 생성
	// 기본 생성자
	public Person() {
		super();
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
	
	// 이름 변경
	public void setName(String name) {
		this.name = name;
	}

	// 나이 반환
	public int getAge() {
		return age;
	}

	// 나이 변경
	public void setAge(int age) {
		this.age = age;
	}

	// 출력
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
