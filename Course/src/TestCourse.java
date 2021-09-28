
public class TestCourse {

	public static void main(String[] args) {
		
		// 인스턴스
		Course course1 = new Course("자료 구조");
		Course course2 = new Course("데이터 베이스");

		// 학생 추가
		course1.addStudent("홍길동");
		course1.addStudent("이순신");
		course1.addStudent("강감찬");
		course2.addStudent("홍길동");
		course2.addStudent("김유신");
		
		System.out.println("course1의 학생 수 : "+course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.print(students[i] + ", ");
		}
		System.out.println();
		System.out.println("course2의 학생 수 : "+course2.getNumberOfStudents());
		
		course1.dropStudent("김유신");
		course1.dropStudent("강감찬");
	}

}
