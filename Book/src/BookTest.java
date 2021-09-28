
public class BookTest {

	public static void main(String[] args) {
		
		Book n = new Novel();
		Book p = new Poet();
		Book s = new ScienceFiction();
		
		n.setNumber(1);
		n.setTitle("구해줘");
		n.setAuthor("기욤뮈소");
		((Novel) n).setSpecificField("로멘스 소설");
		
		p.setNumber(24);
		p.setTitle("이동주의 시집");
		p.setAuthor("이동주");
		((Poet) p).setEra(19);
		
		s.setNumber(66);
		s.setTitle("그것 IT");
		s.setAuthor("스티븐 킹");
		((ScienceFiction) s).setSubject("IT");
		
		System.out.println(n);
		System.out.println(n.getTitle()+" 소설의 5일치 연체료는 " +((Novel) n).getLateFees(5)+" 원 입니다.");
		System.out.println(p);
		System.out.println(p.getTitle()+" 소설의 5일치 연체료는 " +((Poet) p).getLateFees(5)+" 원 입니다.");
		System.out.println(s);
		System.out.println(s.getTitle()+" 소설의 5일치 연체료는 " +((ScienceFiction) s).getLateFees(5)+" 원 입니다.");
		
	}

}
