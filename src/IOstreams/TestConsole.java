package IOstreams;

import java.io.*;
import java.util.Scanner;
// some IDEs show null pointer exception
public class TestConsole {
	public static void main(String[] args)throws Exception  {

		Console console = System.console();
				
		String uname1 = console.readLine("user namew   :");
		char[] pwd = console.readPassword("user password");
		String upwd = new String(pwd);

		if (uname1.equals("shyam") && upwd.equals("shyam")) {

			System.out.println("user login sucess");
		} else {

			System.out.println("login failure");

		}

	}

}
