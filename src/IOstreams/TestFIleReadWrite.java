package IOstreams;

import java.io.FileReader;
import java.io.FileWriter;

public class TestFIleReadWrite {
	public static void main(String[] args) {

		try (FileReader fr = new FileReader("E:/aaa.docx"); FileWriter fw = new FileWriter("E:/amma2.docx");) {
			String data = " ";
			int val = fr.read();
			while (val != -1) {

				data = data + (char) val;
				val = fr.read();
			}
			char[] charArray = data.toCharArray();
			fw.write(charArray);
			System.out.println("read aand write");

		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}

	}

}
