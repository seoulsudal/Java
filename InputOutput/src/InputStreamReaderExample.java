import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		String data;
		char[] cbuf = new char[100];
		while((readCharNo = reader.read(cbuf)) != -1) {
			data = new String(cbuf, 0, readCharNo - 2);
			System.out.println(data);
		}
		reader.close();
	}

}
