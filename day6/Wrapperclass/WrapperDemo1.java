package day6.Wrapperclass;

public class WrapperDemo1 {

	public static void main(String[] args) {
		int  a=10;
		Integer b = a;// autoboxing 1.5
		Integer c = Integer.valueOf(a);
		
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}

}
