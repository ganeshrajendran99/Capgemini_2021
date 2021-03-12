package day5.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		String text =" hello welcome"
		+"java"
		+"python"
		+"sql"
		+"abc";
		 
		System.out.println(text);
		
		StringBuffer sb = new StringBuffer("hello");//default 16 new capacity = old capacity * 2+2
		System.out.println("Length :"+sb.length());
		System.out.println("capacity :"+sb.capacity());
		
		sb.append("hello welcome ");
		
		System.out.println("Length :"+sb.length());
		System.out.println("capacity :"+sb.capacity());
		
		sb.append(" to java");
		System.out.println("Length :"+sb.length());
		
	}

}
