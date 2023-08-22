package IOstreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TestReadWrite {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("E:/iofile.txt");

				FileWriter fw = new FileWriter("E:/Images/ram.txt")

		) {

			String data = " ";

			int val = fr.read();
			while (val != -1) {
				data = data + (char) val;
				val = fr.read();

			}
			fw.write(data);
System.out.println("read and write"
		);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
