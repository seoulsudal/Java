
public class MyScore {
	private int score;

	public void setScore(int score) 
		throws MyException{
			if(score < 0) {
				throw new MyException("점수는 음수가 될 수 없습니다.");
			}
			else {
				this.score = score;
			}
		
	}
}
