package day5.string;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println("s1 = "+s1);
		System.out.println("Length :"+s1.length());
		System.out.println("char At :"+s1.charAt(1));
		System.out.println("char At :"+s1.charAt(4));
		System.out.println("index of e :"+s1.indexOf('e'));
		System.out.println("equals "+ s1.equals("hello"));
		System.out.println("equals "+ s1.equals("Hello"));
		System.out.println("equals ignore case "+ s1.equalsIgnoreCase("hellO"));
		System.out.println("replace "+ s1.replace('h','H'));
		System.out.println("sub string "+ s1.substring(1));
		System.out.println("sub string "+ s1.substring(1,4));
		
		String s2="welcome";
		System.out.println("s2 "+ s2+"hi");
		System.out.println("s2 "+ s2.trim()+"hi");
		System.out.println("s1 "+ s1.toUpperCase());
		System.out.println("s1 "+ s1.toLowerCase());
		
		char ch[]=s1.toCharArray();
		String s3="hello welcome java";
		String arr[]=s3.split("a");
		for(String s:arr)
		{
			System.out.println(s);
		}
	}

}
