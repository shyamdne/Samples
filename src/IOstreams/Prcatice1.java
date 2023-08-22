package IOstreams;

import java.io.*;

public class Prcatice1 {

	public static void main(String[] args) throws Exception {

		Console console = System.console();
		String uname = console.readLine("entet name     :");
		char[] psw = console.readPassword("enter password    :");

		String upsw = new String(psw);
		if (uname.equals("shyam") && upsw.equals("shyam")) {

			System.out.println("login sucess");
		} else {

			System.out.println("login fail");
		}

	}

}
