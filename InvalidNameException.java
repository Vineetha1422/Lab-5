package day8.lab5;

public class InvalidNameException extends Exception{
	String exceptionMessage="";


	public InvalidNameException() {
		super();
	}


	public InvalidNameException(String exceptionMessage) {
		super();
		this.exceptionMessage = exceptionMessage;
	}


	@Override
	public String toString() {
		return "Invalid Name Exception : "+exceptionMessage;
	}
}
