package by.epam.task04.logic;

public class Treasure {
	private String name;
	private double price;
	
	public Treasure(String name) {
		this.name = name;
	}
	
	public Treasure(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
