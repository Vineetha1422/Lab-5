package day8.lab5;

import java.util.Scanner;

public class AgeinvalidityMain {
	public static void main(String[] args) {
		AgeValidation checkAge=new AgeValidation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of person : ");
		int age=sc.nextInt();
		try {
			checkAge.isValidAge(age);
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
