package student;

public class Student {

	private String name;
	private String addr;
	private String tel;
	private String grade;
	
	public Student() {
		this("", "", "", "");
	}

	public Student(String name, String addr, String tel, String grade) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "[이름 : " + name + ", 주소 : " + addr + ", 전화 : " + tel + ", 학년 : " + grade + "]\n";
	}
	
	public void showStudentinfo() {
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + addr);
		System.out.println("전화 : " + tel);
		System.out.println("학년 : " + grade);
	}
	
}
