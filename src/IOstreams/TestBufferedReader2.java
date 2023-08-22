package IOstreams;




import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TestBufferedReader2 {

	public static void main(String[] args) {

		try (BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

		) {

			System.out.print("ENTER Data:");
			String data = bufferReader.readLine();
			System.out.print(" ENETER THE DATA AGIAN:");

			int value = bufferReader.read();

			System.out.println("ReadLine():" + data);
			System.out.println("read():" + value + "[+"  ((char) value) + "]");

		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}

	}

}
