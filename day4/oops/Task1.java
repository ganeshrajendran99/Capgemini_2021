package day4.oops;

class Car1{
	private int yearModel;
	private String make;
	private int speed;
	public Car1(int yearModel, String make) {
		super();
		this.yearModel = yearModel;
		this.make = make;
		this.speed = 0;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	void accelearte() {
		speed+=5;
	}
	void brake() {
		speed-=5;
		if(speed<0)
			speed=0;
	}
		
}

public class Task1 {

	public static void main(String[] args) {
		Car1 car = new Car1(1965, "Bat Mobile");
		car.accelearte();
		System.out.println(car.getSpeed());
		car.accelearte();
		System.out.println(car.getSpeed());
		car.accelearte();
		System.out.println(car.getSpeed());
		car.accelearte();
		System.out.println(car.getSpeed());
		car.accelearte();
		System.out.println(car.getSpeed());
        
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());


	}

}

