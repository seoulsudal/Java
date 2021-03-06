
public class Test {

	public static void main(String[] args) {

		Person p1 = new Student();
		Person p2 = new Employee();
		Person p3 = new Faculty();
		Person p4 = new Staff();
		
		MyDate myDate = new MyDate(); 
				
		// 학생
		p1.setName("현용주");
		p1.setNumber("010-8765-9618");
		p1.setAddress("송파구");
		p1.setEmail("gusdydwn7@naver.com");
		((Student) p1).setYear(Grader.THIRD_GRADER);
		
		// 교직원
		p2.setName("홍길동");
		p2.setNumber("010-1234-5678");
		p2.setAddress("강서구");
		p2.setEmail("asdir4@naver.com");
		((Employee) p2).setOffice("기술부");
		((Employee) p2).setSalary(3500);
		myDate.setYear(2021);
		myDate.setMonth(9);
		myDate.setDay(5);
		((Employee) p2).setEmploymentDate(myDate);
		
		// 교수
		p3.setName("이순신");
		p3.setNumber("010-9876-5432");
		p3.setAddress("강북구");
		p3.setEmail("aofhnwgoa44@naver.com");
		((Faculty) p3).setConsoltationTime("2021년 09월 06일");
		((Faculty) p3).setSequence(5);
		
		// 직원
		p4.setName("강감찬");
		p4.setNumber("010-7777-8888");
		p4.setAddress("강동구");
		p4.setEmail("fghwuf@naver.com");
		((Staff) p4).setRank("주임");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}
