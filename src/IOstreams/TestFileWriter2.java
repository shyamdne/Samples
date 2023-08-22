package IOstreams;

import java.io.FileWriter;

public class TestFileWriter2 {
	public static void main(String[] args) {

		try (FileWriter fileWriter = new FileWriter("E:/dhane4.csv");

		) {

			String data = "ram,30,dhane";
			String data1 = "shyam,30,dhane";
			String data2 = "ram,30,dhane";
			String data3 = "ram,30,dhane";

			char[] charArray = data.toCharArray();
			char[] charArray1 = data1.toCharArray();
			char[] charArray2 = data2.toCharArray();
			char[] charArray3 = data3.toCharArray();



			fileWriter.write(charArray);
			fileWriter.write(charArray1);
			fileWriter.write(charArray2);
			fileWriter.write(charArray3);

			System.out.println("data sent from result to csv file");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
