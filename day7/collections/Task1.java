package day7.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Product{
	int pid;
	String pname;
	int price;
	public Product(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
}

public class Task1 {

	public static void main(String[] args) {
	ArrayList<Product> productList= new ArrayList<Product>();
	productList.add(new Product(1,"chocolate",50));
	productList.add(new Product(2,"shampoo",100));
	productList.add(new Product(3,"boost",150));
	productList.add(new Product(4,"washing powder",250));
	productList.add(new Product(5,"hair oli",500));
	
	System.out.println("product list:"+productList);
	
	//Iterator<Product> iter = new ArrayList<Product>();
	
	}

}
