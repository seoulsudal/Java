
public class PersonTest {

	public static void main(String[] args) {
		
		// 인스턴스
		Employee em = new Employee();		// 직원
		Professor pro = new Professor();	// 교수
		Student stu = new Student();		// 학생
		Student stu1 = new Student("강감찬", 45, "무력");
		
		em.setName("홍길동");
		em.setAge(34);
		em.setDept(3);
		
		stu.setName("이순신");
		stu.setAge(50);
		stu.setMajor("호신");
		
		System.out.println(stu);
		System.out.println(stu1);
		
	}

}
