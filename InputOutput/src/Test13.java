import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test13 {

	public static void main(String[] args) {
		
		try(ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("a.zip"))){
			ZipEntry entry = new ZipEntry("a.txt");
			zos.putNextEntry(entry);
			byte[] data = Files.readAllBytes(Paths.get("a.txt"));
			zos.write(data);
			
			entry = new ZipEntry("b.txt");
			zos.putNextEntry(entry);
			zos.write(Files.readAllBytes(Paths.get("b.txt")));
			
			entry = new ZipEntry("c.txt");
			zos.putNextEntry(entry);
			zos.write(Files.readAllBytes(Paths.get("c.txt")));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
