
public class Time {

	// 필드 생성
	private int time; 	// 시
	private int minute; // 분
	private int second; // 초

	// 메소드 생성
	// 생성자
	public Time() {
		super();
	}

	// 생성자
	public Time(int time, int minute, int second) {
		super();
		this.time = time;
		this.minute = minute;
		this.second = second;
	}

	// 시 반환
	public int getTime() {
		return time;
	}

	// 시 변경
	public void setTime(int time) {
		this.time = time;
	}

	// 분 반환
	public int getMinute() {
		return minute;
	}

	// 분 변경
	public void setMinute(int minute) {
		this.minute = minute;
	}

	// 초 반환
	public int getSecond() {
		return second;
	}

	// 초 변경
	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "Time [time=" + time + ", minute=" + minute + ", second=" + second + "]";
	}

}
