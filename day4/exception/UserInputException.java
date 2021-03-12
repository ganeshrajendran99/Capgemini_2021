package day4.exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputException {

	public static void main(String[] args) {
		int result=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int a=scanner.nextInt();
        System.out.println("enter the second number");
        int b=scanner.nextInt();
        
        try {
        	result=a/b;
        }
        catch(ArithmeticException e){
        	System.out.println("do not enter zero");
        }
        catch(InputMismatchException e){
        	System.out.println("enter only the number and no character");
        }
        catch(Exception e) {
        	
        }
        System.out.println("result = "+ result);
	}

}
