package day5.string;

public class ImmutableDemo {

	public static void main(String[] args) {
    String s1 ="hello";
    System.out.println("s1 ="+s1);
    
    s1.concat("welcome to java");
    System.out.println("s1 ="+ s1);
    s1=s1.concat("thank you");
    System.out.println("s1 "+ s1);

	}

}
