package IOstreams;
import java.io.FileWriter;
public class TestFileWriter1 {
public static void main(String[] args) {
	try(FileWriter fileWriter= new FileWriter("E:/dhane1.csv");
			){
		String data = "shyam,30,dhane";
		char [] charArray=data.toCharArray();
		fileWriter.write(charArray);
		System.out.println("data sent to E:/dhane1.csv");
		
	}catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	
	
	
}
}
