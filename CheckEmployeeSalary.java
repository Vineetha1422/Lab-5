package day8.lab5;

public class CheckEmployeeSalary {
	public void checkingSalary(int salary) throws EmployeeException{
		if(salary<3000)throw new EmployeeException("Salary of the employee is less than Rs.3000.");
		else System.out.println("The salary of employee is : Rs."+salary);
	}
}
