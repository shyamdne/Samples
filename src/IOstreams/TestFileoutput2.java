package IOstreams;

import java.io.FileOutputStream;

public class TestFileoutput2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("E:/iotest2", true);
			String data = "hello shyam ";
			byte[] byteArray = data.getBytes();
			fos.write(byteArray);
			System.out.println("sent to the data E:/iotest2");

		} catch (Exception e) {
			e.printStackTrace();

		}finally {
			try {
				
				fos.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
