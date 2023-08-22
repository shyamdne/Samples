package IOstreams;

import java.io.FileInputStream;

public class TestFileInputStream2 {

	public static void main(String[] args) {

		String fileName = args[0];

		try (FileInputStream fileInputStream = new FileInputStream(fileName);) {
			int size = fileInputStream.available();
			byte[] byteArray = new byte[size];
			fileInputStream.read(byteArray);
			String data = new String(byteArray);
			System.out.println(data);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
