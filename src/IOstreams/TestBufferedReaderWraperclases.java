package IOstreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestBufferedReaderWraperclases {

	public static void main(String[] args) {

		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) {

			System.out.print("ENTER FIRST VLUE:");
			String val1 = bufferedReader.readLine();
			System.out.print(" ENTER SECOND VALUE");

			String val2 = bufferedReader.readLine();
			System.out.println("Add   :" + (val1 + val2));

			// paresing values

			int fval = Integer.parseInt(val1);

			int sval = Integer.parseInt(val2);
			System.out.println("add   :" + (fval + sval));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
