import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputOutputStreamExample2 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("C:/Temp/intest.txt");
			FileOutputStream fos = new FileOutputStream("C:/Temp/outtest.txt")){
			int data = -1;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
