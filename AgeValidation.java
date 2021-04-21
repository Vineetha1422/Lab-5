package day8.lab5;

public class AgeValidation {
	public void isValidAge(int age) throws InvalidAgeException {
		if(age>15)System.out.println("Age of the person is valid and age is : " + age + " years");
		else throw new InvalidAgeException("Age is below 15 years");
	}
}
