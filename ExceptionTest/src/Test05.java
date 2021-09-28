
public class Test05 {

	int battery = 0;

	public void charge(int time) {

		if (time < 0) {
			time = 0;
			try {
				throw new NagativeNumberException();
			} catch (NagativeNumberException e) {
				e.printStackTrace();
			}
		}
		battery += time;
		System.out.println("현재 배터리 : "+ battery);
	}
}
