package day2.array;
import java.util.Scanner;
public class ArrayUserInput {

	public static void main(String[] args) {
		int children=0;
		int adult=0;
		int seniorcitizen=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total no of passengers");
		int size = scanner.nextInt();
		int passengerAge[]=new int[size];
		
		for(int i=0;i<passengerAge.length;i++) {
			System.out.println("enter the age of the passenger :"+ (i+1));
			passengerAge[i]=scanner.nextInt();
		}
		for(int i=0;i<passengerAge.length;i++) {
			System.out.print(passengerAge[i] +"\t");
		}
		System.out.println();
		for(int i=0;i<passengerAge.length;i++) {
			if(passengerAge[i]<18)
			{
				++children;
			}
			else if(passengerAge[i]>18 & passengerAge[i]<55)
			{
				++adult;
			}
			else
			{
				++seniorcitizen;
			}
		}
		System.out.println();
		
		System.out.println("children count "+ children);
		System.out.println("Adult count "+ adult);
		System.out.println("Senior count "+ seniorcitizen);
	}

}
