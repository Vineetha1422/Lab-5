package day8.lab5;

import java.util.Scanner;

public class NameInvalidityMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the employee : ");
		String name=sc.nextLine();
		String fullName[]=name.split(" ");
		try {
			if(fullName[0].equals("_") && fullName[1].equals("_"))throw new InvalidNameException("Blank First name and Last name");
			else if(fullName[0].equals("_")) throw new InvalidNameException("Blank First name");
			else if(fullName[1].equals("_")) throw new InvalidNameException("Blank Last name");
			else System.out.println("The employee name is valid.");
		}
		catch(Exception e) {
			System.out.println(e);
		}		
}
}
