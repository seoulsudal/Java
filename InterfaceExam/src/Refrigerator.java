
public class Refrigerator implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("냉장고 전원을 켰습니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("냉장고 전원을 종료했습니다.");

	}

}
