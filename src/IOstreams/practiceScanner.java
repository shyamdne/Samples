package IOstreams;

import java.util.Scanner;
import java.io.*;

public class practiceScanner {

	public static void main(String[] args) {

		try (Scanner scaner = new Scanner(System.in);

		) {
			System.out.print("enter data   :");
			String data1 = scaner.nextLine();

			System.out.print("enter same sata again        :");
			String data2 = scaner.next();
			System.out.println("nextline()  :" + data1);
			System.out.println("next()  :" + data2);

			System.out.println("-----------------------------");

			System.out.print("Employee name :");
			String enm = scaner.next();
			System.out.print("Employee address :");
			String addr = scaner.next();

			System.out.print("Employee number  :");
			int eno = scaner.nextInt();

			System.out.print("Employee salary  :");
			float esl = scaner.nextFloat();

			System.out.println("Employee name  :" + enm);
			System.out.println("Employee adress  :" + addr);

			System.out.println("Employee number  :" + eno);
			System.out.println("Employee salary  :" + esl);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
