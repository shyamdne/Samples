package IOstreams;

import java.util.Scanner;

public class TestScanner2 {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in);) {
			System.out.print("Employee Number   :");

			int eno = scanner.nextInt();
			System.out.print("Employee Name   :");
			String ename = scanner.next
					();
			System.out.print("Employee Salary   :");
			float esal = scanner.nextFloat();

			System.out.print("Employee address   :");
			String eaddr = scanner.next();

			System.out.println("employee details");

			System.out.println("---------------------------------");

			System.out.println("employee Number     :" + eno);
			System.out.println("employee Name     :" + ename);
			System.out.println("employee salary    :" + esal);
			System.out.println("employee adress     :" + eaddr);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
