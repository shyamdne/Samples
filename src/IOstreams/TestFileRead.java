package IOstreams;

import java.io.FileReader;

public class TestFileRead {

	public static void main(String[] args) {
		try (FileReader fileReader = new FileReader("E:/iofile.txt");) {

			String data = "";
			int val = fileReader.read();
			
			while (val != -1) {

				data = data + (char) val;
				val = fileReader.read();

				
			}
			System.out.println(data);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
