package day5.string;

public class StringDemo1 {

	public static void main(String[] args) {
	String s1 ="hello";
	String s2 ="hello";
	String s3 ="hi";
	String s4 =new String("hello");
	String s5 =new String("hello");

	System.out.println("s1==s2 =>"+ (s1==s2));
	System.out.println("s1==s3 =>"+ (s1==s3));
	System.out.println("s4==s5 =>"+ (s4==s5));
	
	System.out.println("s5.equals(s5) =>"+ (s4.equals(s5)));
	}

}
