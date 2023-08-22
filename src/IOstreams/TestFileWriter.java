package IOstreams;

import java.io.FileWriter;
import java.io.FileReader;

public class TestFileWriter {

	public static void main(String[] args) {

		try (FileWriter fileWriter = new FileWriter("E:/images/shyam.txt,true");) {
			String data = "HOW ARE YOU";
			char[] charArray = data.toCharArray();
			fileWriter.write(charArray);
			System.out.println("data will be writed");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
	}

}
