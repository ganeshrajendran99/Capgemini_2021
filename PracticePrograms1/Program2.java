package PracticePrograms1;
class Shape{
	public void draw() {
		System.out.println("Drawing shape");
	}
	public void erase() {
		System.out.println("Erasing shape");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
	public void erase() {
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	public void erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
	public void erase() {
		System.out.println("Erasing Square");
	}
}
public class Program2 {

	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();
		circle.erase();
		Shape triangle = new Triangle();
		triangle.draw();
		triangle.erase();
		Shape square = new Square();
		square.draw();
		square.erase();
	}
}
