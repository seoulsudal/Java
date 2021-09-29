
public class Television implements RemoteControl, SerialCommunication, AdvanceRemoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켰습니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 종료했습니다.");
		
	}

	@Override
	public void send(byte[] data) {
		System.out.println("데이터를 전송합니다.");
		
	}

	@Override
	public byte[] receive() {
		System.out.println("데이터를 받습니다.");
		return null;
	}

	@Override
	public void volumeUp() {
		System.out.println("볼륨을 올립니다.");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("볼륨을 낮춥니다.");
		
	}



}
