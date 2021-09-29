package exam;

public class PuppyOut extends Thread {

	private AppleBox applebox;
	private String name;
	
	public PuppyOut(AppleBox applebox, String name) {
		this.applebox = applebox;
		this.name = name;
	}
	
	public void run() {
		int value = 0;
		for(int i = 0; i < 5; i++) {
			value = applebox.get((int) (Math.random() * 5 + 1));
			System.out.println("----" + this.name + ", 가지려는 수량 : " + value);
		}
	}
	
}
