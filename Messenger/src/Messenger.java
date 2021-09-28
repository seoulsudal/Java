
public interface Messenger {

	final int MIN_SIZE = 1;			// 상수 입력
	final int MAX_SIZE = 104857600;	// 상수 입력

	String getMessage();			// 메세지 반환

	void setMessage(String msg);	// 메세지 설정

	default void setLogin(boolean login) {
		log();
		if (login) {
			System.out.println("로그인 처리 합니다.");
		} else {
			System.out.println("로그아웃 처리 합니다.");
		}
	}

	static void getConnection() {
		System.out.println("Network에 연결 합니다.");
	}

	private void log() {
		System.out.println("start job!");
	}

}
