
public class AlarmTest {

	public static void main(String[] args) {
		Time alarm = new Time(11, 50, 0);		// Time 객체 참조 변수
		Time current = new Time(10, 23, 35);	// Time 객체 참조 변수
		
		System.out.println(alarm);
		System.out.println(current);
		
		AlarmClock ac = new AlarmClock(current, alarm);	// AlarmClock 객체 참조 변수
		System.out.println(ac);
		
	}

}
