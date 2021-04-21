package day8.lab5;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary of the employee : ");
		int salary=sc.nextInt();
		CheckEmployeeSalary checkSalary=new CheckEmployeeSalary();
		try {
			checkSalary.checkingSalary(salary);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
