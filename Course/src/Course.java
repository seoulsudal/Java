
public class Course {

	// 필드 생성
	private String courseName;					// 과목명
	private String[] students = new String[100];// 수강생 배열
	private int numberOfStudents;				// 학생 수
	
	// 메소드 생성
	// 생성자
	public Course(String courseName) {
		this.courseName = courseName;
	}

	// 과목명 반환
	public String getCourseName() {
		return courseName;
	}
	
	// 학생 추가
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	// 수강 취소
	public void dropStudent(String student) {
		boolean search;	// 변수 선언
		search = false;	// 변수 초기화
		
		// 학생 수 만큼중에서 참 거짓 판단
		for(int i = 0; i < numberOfStudents; i++) {
			if(students[i].equals(student)) {
				search = true;
				// 참일 경우 출력
				System.out.println(courseName + " 수강생에서 " + student + " 학생을 삭제한다.");
				students[i] = "";
				break;
			}		
		}
		if(search == false) {
				// 거짓일 경우 출력
				System.out.println(courseName + " 수강생에 " + student + " 학생 이름이 없다.");
			}
	}

	// 수강생 명단 반환
	public String[] getStudents() {
		return students;
	}

	// 학생 수 반환
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
		
}
