package IOstreams;

import java.util.Scanner;

public class TestScanner3 {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in);) {

			System.out.print("user name");

			String uname = scanner.next();
			System.out.print("uswer password");

			String upwd = scanner.next();

			if (uname.equals("shyam") && upwd.equals("shyam")) {

				System.out.println("Login sucess");
			} else {

				System.out.println("user login failure");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}