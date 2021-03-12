package day8.multithread;
class A extends Thread{
	public void run()
	{
		System.out.println("this is my task ");
	}
}
class B implements Runnable{

	@Override
	public void run() {
		System.out.println("this is my task created using runnable interface");
	}
	
}

public class CreateDemo1 {

	public static void main(String[] args) {
		A o = new A();
		o.start();
		B i = new B();
		Thread t1 = new Thread(i);
		t1.start();

	}

}
