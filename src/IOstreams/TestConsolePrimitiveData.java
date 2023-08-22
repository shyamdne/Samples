package IOstreams;

import java.io.*;
import java.util.Scanner;

public class TestConsolePrimitiveData {
	public static void main(String[] args) throws Exception {

		Console console = System.console();
		int eno = Integer.parseInt(console.readLine("ENO"));
		String ename = console.readLine("ENAME");
		float esal = Float.parseFloat(console.readLine("ESAL"));
		String eaddr = console.readLine("EADDR");
		System.out.println("employee Details");
		System.out.println("------------------------------");
		System.out.println("Employee Number   :" + eno);
		System.out.println("Employee Name   :" + ename);
		System.out.println("Employee salary   :" + esal);
		System.out.println("Employee Adress   :" + eaddr);

	}

}
