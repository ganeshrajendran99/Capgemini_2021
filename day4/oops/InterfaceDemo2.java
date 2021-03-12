package day4.oops;
interface vehicle{
	int speedlimit=180;
	 void noofwheels();
}
interface Engine{
	int speedlimit=200;
	void engine();
}
class TestDrive{
	void drive() {
		System.out.println("you can take test drive");
	}
}
class car extends TestDrive implements vehicle,Engine{
	@Override
	public void noofwheels() {
    System.out.println("it has 4 wheels");
    System.out.println("amazing car");
    System.out.println(vehicle.speedlimit);
    System.out.println(Engine.speedlimit);
	}

	@Override
	public void engine() {
    System.out.println("it has 4 stroke engine");
	}
}
class bike implements vehicle{

	@Override
	public void noofwheels() {
		
	}
	
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
    car c = new car();
    c.engine();
    c.noofwheels();
    c.drive();
    }

}
