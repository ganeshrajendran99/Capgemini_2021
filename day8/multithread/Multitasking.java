package day8.multithread;
class Megha extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Megha "+i);
		}
	}
}
class Pranav extends Thread{
	public void run() {
		for(int i=20;i<=30;i++) {
			System.out.println("Pranav "+i);
		}
	}
}
class Shena extends Thread{
	public void run() {
		for(int i=40;i<=50;i++) {
			System.out.println("Shena "+i);
		}
	}
}

public class Multitasking {

	public static void main(String[] args) {
		Megha megha = new Megha();
		Pranav pranav = new Pranav();
		Shena shena= new Shena();
		
		//megha.run();
		//pranav.run();
		//shena.run();
		
		megha.start();
		pranav.start();
		shena.start();
		
	}

}
