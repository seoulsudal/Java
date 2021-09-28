
public class Student extends Human {

	// 필드 생성
	private String major;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Student(String major) {
		super();
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [getMajor()=" + getMajor() + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}



}
