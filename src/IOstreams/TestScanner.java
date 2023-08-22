package IOstreams;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in);
		){
			
			System.out.print("eneter the data       :");
			String data1 =scanner.nextLine();			
			System.out.print("eneter the data again      :");
			String data2 =scanner.next();
			System.out.println("nextline()     :"+data1);
			System.out.println("next()     :"+data2);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

}
