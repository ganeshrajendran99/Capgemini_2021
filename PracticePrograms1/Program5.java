package PracticePrograms1;
public class Program5 {
	public static String repeatEnd(String str,int n)
	{
		String s=str.substring(str.length()-n);
		str="";
		while(n>0)
		{
			str+=s;
			n--;
		}
		return str;
	}	
	public static void main(String[] args) {
		System.out.println(repeatEnd("Hello",3));
}
}
