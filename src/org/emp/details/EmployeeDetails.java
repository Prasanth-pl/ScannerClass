package org.emp.details;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		System.out.println(" Your Employee id is:");
		short empid = c.nextShort();
		System.out.println("Employee Id is :"+empid);
		
		System.out.println("Your Employee name:");
		String name = c.next();
		System.out.println("Employee Name is:"+name);
		
		System.out.println("Your Email Id is:");
		String email = c.next();
		System.out.println("Your Email id is;"+email);
		
		System.out.println("Your Phone Number is :");
		long PhoneNum = c.nextLong();
		System.out.println("Your Phone Number is :"+PhoneNum);
		
		System.out.println("Your Salary is :");
		double Salary = c.nextDouble();	
		System.out.println("Your Salary is :"+Salary);
		
		System.out.println("Your Gender is:");
		String gender = c.next();
		System.out.println("Your gender"+gender);
		
		System.out.println("Your city name is:");
		String City = c.next();
		System.out.println("Your City Name is:"+City);
		
		
		System.out.println("Upi Payment");
		
	}
}
