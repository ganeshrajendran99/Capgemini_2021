package day4.exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
    System.out.println("Bangalore");
    System.out.println("Mid way reached");
    //only risky code should be inside the try block and if
    //exception occurs control goes to the catch block and all
    //remaining code is not executed in try block
    try {
    System.out.println(2/2);
    System.out.println("hello");
    System.out.println("welcome");
    }
    catch(Exception ex)
    {
    	System.out.println("do not divide by zero");
    }
    System.out.println("Close to destination");
    System.out.println("Chennai");

	}

}
