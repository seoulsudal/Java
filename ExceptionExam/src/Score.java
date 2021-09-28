
public class Score {

	private int korean;
	private int english;
	private int math;
	private double average;

	public Score() {
		super();
	}

	public Score(int korean, int english, int math) {
		super();
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		if (korean < 0) {
			try {
				throw new NegativeNumberException();
			} catch (NegativeNumberException e) {
				e.printStackTrace();
			}
		} else {
			this.korean = korean;
		}
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		if (english < 0) {
			try {
				throw new NegativeNumberException();
			} catch (NegativeNumberException e) {
				e.printStackTrace();
			}
		} else {
			this.english = english;
		}
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if (math < 0) {
			try {
				throw new NegativeNumberException();
			} catch (NegativeNumberException e) {
				e.printStackTrace();
			}
		} else {
			this.math = math;
		}
		average = (korean + english + math) / 3.0;
		average = (int) (average * 100) / 100.0;
	}

	public double getAverage() {
		return average;
	}

	@Override
	public String toString() {
		return "Score [korean = " + korean + ", english = " + english + ", math = " + math + ", average = " + average + "]";
	}

}
