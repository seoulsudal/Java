
public class AlarmClock {

	// 필드 생성
	private Time currentTime;	// Time 객체 참조 변수
	private Time alarmTime;		// Time 객체 참조 변수
	
	// 메소드 생성
	// 생성자
	public AlarmClock() {
		super();
	}

	// 생성자
	public AlarmClock(Time currentTime, Time alarmTime) {
		super();
		this.currentTime = currentTime;
		this.alarmTime = alarmTime;
	}

	public Time getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Time currentTime) {
		this.currentTime = currentTime;
	}

	public Time getAlarmTime() {
		return alarmTime;
	}

	public void setAlarmTime(Time alarmTime) {
		this.alarmTime = alarmTime;
	}

	@Override
	public String toString() {
		return "AlarmClock [currentTime=" + currentTime + ", alarmTime=" + alarmTime + "]";
	}

}
