package IOstreams;

import java.io.FileReader;
import java.io.FileWriter;

public class FilereaderFilewriter {
	public static void main(String[] args) {

		try (FileReader fr = new FileReader("D:/test1.txt"); FileWriter fw = new FileWriter("E:/test1.txt");) {

			String data = "";

			int val = fr.read();
			while (val != -1) {

				data = data + (char) val;
				val = fr.read();

			}

			fw.write(data.toCharArray());

			System.out.println("d:/abc.txt   to   e:/abc.txt");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
