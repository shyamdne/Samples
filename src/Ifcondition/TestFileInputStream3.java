package Ifcondition;

import java.io.FileInputStream;

public class TestFileInputStream3 {

	public static void main(String[] args) {

		String filename = "E:/iofile.txt";
		try (FileInputStream fis = new FileInputStream(filename);
				) {
			byte[] byteArray = new byte[fis.available()];
			fis.read(byteArray);

			String data = new String(byteArray);
			
			System.out.println(data);
			String[] tokens = data.split(" ");
			System.out.println("number of words  :" + tokens.length);
			int count = 0;
			for (String token : tokens) {
				if (token.equals("durga"
						)) {

					count = count + 1;

				}
			}
			System.out.println("'durga' repates:" + count);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
