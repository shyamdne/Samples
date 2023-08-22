package IOstreams;
import java.io.*;
public class Excersise {
	public static void main(String[] args) {
		try(BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
				){
			
			System.out.print("enter data");
			 String data= bufferedReader.readLine();
			 System.out.println("same data");
			 String data1= bufferedReader.readLine();
			 System.out.println("rl :data "+data);
			 System.out.println("R :"+data1);
System.out.println(data+data1);

int v1=Integer.parseInt(data);
int v2=Integer.parseInt(data1);
System.out.println(v1+v2);



		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
