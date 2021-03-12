package day4.oops;
interface College{
	void dept();
	default void lab() {
		System.out.println(" you have to do lab");
	}
}
class Mech implements College{

	@Override
	public void dept() {
		System.out.println(" this is mech dept");
	}
	//public void lab() {
		//System.out.println("you have to do lab 1 exercise...");
	//}
}
public class InterfaceNewFeature {

	public static void main(String[] args) {
    Mech m = new Mech();
    m.dept();
    m.lab();

	}

}
