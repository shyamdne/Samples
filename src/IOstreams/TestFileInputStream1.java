package IOstreams;

import java.io.FileInputStream;

public class TestFileInputStream1 {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("E:/iofile.txt");) {

			int size = fis.available();
			byte[] byteArray = new byte[size];
			fis.read(byteArray);
			String data = new String(byteArray);
			System.out.println(data);

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}

	}

}
