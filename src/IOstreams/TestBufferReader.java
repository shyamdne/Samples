package IOstreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestBufferReader {

	public static void main(String[] args) {

		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		) {

			System.out.print("ENTER DATA  :  ");
			String data = bufferedReader.readLine();
			System.out.print(" ENTER THE SAME DATA AGAIN");

			int val = bufferedReader.read();
			System.out.println(" readLine():" + data);
			System.out.println(" read():" + val + "[" + (char) val + "]");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}