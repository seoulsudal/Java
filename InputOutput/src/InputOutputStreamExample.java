import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamExample {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:/Temp/intest.txt");
			fos = new FileOutputStream("C:/Temp/outtest.txt");
			int data = -1;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
		}catch(Exception e) {
			System.out.println("오류 발생으로 더 이상의 작업을 진행할 수 없습니다.");
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
				if(fos != null) {
					fos.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
