package IOstreams;

import java.io.IOException;
import java.io.FileOutputStream;

public class TestFileOutputStream3 {
	public static void main(String[] args) {

		try (FileOutputStream fileOutputStream = new FileOutputStream("E:/testfos3.txt,true");) {

			String data = "pottodu";
			byte[] byteArray = data.getBytes();
			fileOutputStream.write(byteArray);
			System.out.println("data will sent to E:/testfos3");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
