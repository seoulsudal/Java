

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import student.Student;

public class StudentMain {

	static Scanner input = new Scanner(System.in);
	
	static ArrayList<Student> infoStudent = new ArrayList<Student>();
	static Student[] info = new Student[30];
	
	public static void main(String[] args) {

		int choice;
		Student inputData = null;
		boolean isAdded = false;
		
		for(int i = 0; i < info.length; i++) {
			info[i] = new Student();
		}
		
		do {
			showMenu();
			choice = input.nextInt();
			input.nextLine();
			
			switch(choice) {
			case 1:
				inputData = inputStudentInfo();
				isAdded = infoStudent.add(inputData);
				if(isAdded == true) {
					System.out.println("데이터 입력이 완료되었습니다.\n");
				}
				else {
					System.out.println("데이터가 저장되지 않았습니다.\n");
				}
				break;
			case 2:
				searchData();
				break;
			case 3:
				deleteData();
				break;
			case 4:
				System.out.println("학생 전체 목록");
				for(Student outData: infoStudent) {
					System.out.println(outData);
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하여 프로그램을 종료합니다.");
				return;
			}
		}while(true);
	}
	
	// 메뉴
	public static void showMenu() {
		System.out.println("학생 정보 등록 프로그램");
		System.out.println("선택하세요...");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 이름으로 검색");
		System.out.println("3. 학생 이름으로 삭제");
		System.out.println("4. 전체 학생 목록");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택 : ");
	}
	
	// 학생정보 입력
	public static Student inputStudentInfo() {
		String name;
		String addr;
		String tel;
		String grade;
		
		System.out.println("이름 : ");
		name = input.nextLine();
		System.out.println("주소 : ");
		addr = input.nextLine();
		System.out.println("번호 : ");
		tel = input.nextLine();
		System.out.println("학년 : ");
		grade = input.nextLine();
		
		return new Student(name, addr, tel, grade);	
	}
	
	public static void searchData() {
		System.out.println("데이터 검색을 시작합니다.");
		
		System.out.print("이름");
		String name = input.nextLine();
		
		// 학생 이름으로 검색
		Student info = search(name);
		if(info == null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
		}
		else {
			System.out.println("검색된 학생 정보");
			info.showStudentinfo();
			System.out.println("데이터 검색이 완료되었습니다.\n");
		}
	}
	
	// 학생 이름으로 검색
	public static Student search(String name) {
		Iterator<Student> itr = infoStudent.iterator();
		while(itr.hasNext()) {
			Student curInfo = itr.next();
			if(name.compareTo(curInfo.getName()) == 0) {
				return curInfo;
			}
		}
		return null;
	}
	
	// 학생 이름으로 삭제
	public static void deleteData() {
		System.out.println("데이터 삭제를 시작합니다.");
		
		System.out.print("이름 : ");
		String name = input.nextLine();
		
		Iterator<Student> itr = infoStudent.iterator();
		while(itr.hasNext()) {
			Student curInfo = itr.next();
			if(name.compareTo(curInfo.getName()) == 0) {
				itr.remove();
				System.out.println("데이터 삭제가 완료되었습니다.\n");
				return;
			}
		}
		System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
	}
}
