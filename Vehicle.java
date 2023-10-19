//2.1:Create Showroom application for Vehicle management
//2.2:create a class with data members(id,name,color,price)
//2.3 create constructor to initialize data member
//2.4 add disscount as static data member in Vehicle class 
//2.5 use static block to assign.
//2.6 create getter setter and override  toString()(hint:show disccount)
//2.7 create tester class....create array to store 10 vechile...create menu driven program 1:show all 2:add vehicle...3:edit color 4:edit price 5:remove 
//

package Codes;

public class Vehicle {
	private int id;
	private String name;
	private String color;
	private double price;
	private static double discount;

	static {
		discount = 8000;
	}

	public Vehicle(int id, String name, String color, double price) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public void finalprice() {
		System.out.println(price-discount);
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price-discount;
	}

	public double getDiscount() {
		return this.discount;
	}

	public String toString() {
		return this.id+"   "+this.name+"   "+this.price+"   "+this.color;
	}
}
