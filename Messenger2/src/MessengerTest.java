
public class MessengerTest {

	public static void main(String[] args) {

		GalaxyMessenger galaxy = new GalaxyMessenger();
		System.out.println(galaxy.getMessage());
		galaxy.SetMessage("Hi");
		galaxy.ChangeKeyboard();

		Messenger test = new Messenger() {
			
			@Override
			public String getMessage() {
				return "test";
			}
			
			@Override
			public void SetMessage(String msg) {
				System.out.println("test에서 메시지를 설정합니다. : "+msg);				
			}
		};
		
		System.out.println(test.getMessage());
		test.SetMessage("have a nice day!");
	}

}
