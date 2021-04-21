package day8.lab5;

public class InvalidAgeException extends Exception {
    String exceptionMessage="";

	public InvalidAgeException() {
		super();
	}

	public InvalidAgeException(String exceptionMessage) {
		super();
		this.exceptionMessage = exceptionMessage;
	}

	@Override
	public String toString() {
		return "Invalid Age Exception : " + exceptionMessage;
	}
}
