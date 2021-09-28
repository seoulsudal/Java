
public interface SerialCommunication {

	void send(byte[] data);	// 데이터를 보내다.
	byte[] receive();		// 데이터를 받는다.
	
}
