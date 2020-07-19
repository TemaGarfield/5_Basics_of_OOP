package by.epam.task02.logic;

import java.util.ArrayList;

public class Payment {
	private double price;
	private ArrayList<Product> products = new ArrayList<Product>();
	
	public class Product {
		private String name;
		private double price;
		
		
		Product(String name, double price) {
			this.name = name;
			this.price = price;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		public String getName() {
			return name;
		}
		
		public double getPrice() {
			return price;
		}
	}
	
	public void addProduct(String name, double price) {
		if (price < 0) {
			System.out.println("Sorry. I can't add this product.");
		} else {
			Product prod = new Product(name, price);
			products.add(prod);
		}
	}
	
	public void calculatePrice() {
		for (Product prod:products) {
			price += prod.getPrice();
		}
	}
	
	public void showProducts() {
		if (products.isEmpty()) {
			System.out.println("Sorry. I can't find any product.");
		} else {
			for (Product prod:products) {
				System.out.println("Product: " + prod.getName() + " Price: " + prod.getPrice());
			}
		}
	}
	
	public void showPrice() {
		System.out.println("All price " + price);
	}

}

