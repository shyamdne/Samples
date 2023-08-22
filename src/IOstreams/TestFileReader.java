package IOstreams;

import java.io.FileReader;

public class TestFileReader {
	public static void main(String[] args) {

		try (FileReader fileReader = new FileReader("D:/csv1.csv");) {
			String data = " ";
			int val = fileReader.read();
			while (val != -1) {
				data = data + (char) val;
				val = fileReader.read();

			}
			System.out.println(data);

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
