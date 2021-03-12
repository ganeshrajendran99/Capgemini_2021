package PracticePrograms1;
import java.util.Scanner;
public class Program6 {
	public String repeatFront(String str,int n)
	{
		String s ="";
		while(n>0) {
			s+=str.substring(0,n--);
		}
		return s;
	}
	public static void main(String[] args) {
		Program6 obj = new Program6();
		Scanner sc = new Scanner(System.in);
		String str;
		int n;
		System.out.println("Enter the string and value of n :");
		str=sc.nextLine();
		n=sc.nextInt();
		String s = obj.repeatFront(str, n);
		System.out.println("Output: "+s);
		sc.close();
	}
}
