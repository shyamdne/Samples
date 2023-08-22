package IOstreams;
import java.io.FileOutputStream;
public class TestFIleoutputStream {
	
	public static void main(String[] args) throws Exception{
	   
		FileOutputStream fileOutputStream = new FileOutputStream("E:/iofile.txt", true);
		String data = " shyam";
		byte[] byteArray = data.getBytes();
		fileOutputStream.write(byteArray);
		System.out.println("data sent to E:/iofile.txt");
		fileOutputStream.close();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



