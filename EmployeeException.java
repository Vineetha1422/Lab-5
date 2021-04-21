package day8.lab5;

public class EmployeeException extends Exception {
    String exceptionMessage="";

	public EmployeeException() {
		super();
	}

	public EmployeeException(String exceptionMessage) {
		super();
		this.exceptionMessage = exceptionMessage;
	}

	@Override
	public String toString() {
		return "Employee Exception : "+exceptionMessage;
	}
	
}
