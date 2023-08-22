package IOstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestInputOutputfile {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("E:/123.jpg");

				FileOutputStream fos = new FileOutputStream("E:images/123.jpg")

		) {

			byte[] byteArray = new byte[fis.available()];
			fis.read(byteArray);
			fos.write(byteArray);

			System.out.println("E:/123.jpg to E:images/123.jpg");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
