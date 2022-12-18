package org.task;

import java.util.Scanner;

public class SetQues {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Emp ID");
		int a = s.nextInt();

		System.out.println("Emp Name");
		String b = s.next();

		System.out.println("Emp Phone");
		long c = s.nextLong();

		System.out.println("Emp Address");
		String d = s.next();

		System.out.println("Emp DOB");
		String e = s.next();

		System.out.println("Emp DOJ");
		String f = s.next();

		System.out.println("Emp Email");
		String g = s.next();

		System.out.println("Gender");
		char h = s.next().charAt(0);

		System.out.println("Emp Salary");
		double i = s.nextDouble();

		System.out.println("Name of the Emp: " + b);
		System.out.println("emp ID : " + a);
		System.out.println("emp Address : " + d);
		System.out.println("Date of Birth : " + e);
		System.out.println("Date of Joining : " + f);
		System.out.println("emp Phone No : " + c);
		System.out.println("emp Email Id: " + g);
		System.out.println("Gender : " + h);
		System.out.println("Emp Salary: " + i);

	}

}
