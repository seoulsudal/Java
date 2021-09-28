
public class GalaxyMessenger implements Messenger {

	@Override
	public String getMessage() {
		return "galaxy";
	}

	@Override
	public void SetMessage(String msg) {
		System.out.println("galaxy에서 메시지를 설정합니다. : "+msg);
	}
	
	public void ChangeKeyboard() {
		System.out.println("키보드아이콘 터치 후 키보드를 변경합니다.");
	}

}
