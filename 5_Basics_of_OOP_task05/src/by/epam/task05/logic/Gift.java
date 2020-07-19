package by.epam.task05.logic;

import java.util.ArrayList;
import java.util.Scanner;

public class Gift {
	private String name;
	private ArrayList<Sweet> sweets = new ArrayList<Sweet>();
	private Package pack;
	
	Scanner in = new Scanner(System.in);
	
	public Gift(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void generateGift() {
		System.out.print("Enter number of sweets: ");
		addSweets(in.nextInt());
		generatePackage();
	}
	
	private void addSweets(int numberOfSweets) {
		for (int i = 0; i < numberOfSweets; i++) {
			Sweet sweet = new Sweet();
			System.out.print("Enter " + (i + 1) + " sweet name: ");
			sweet.setName(in.next());
			System.out.print("Enter " + (i + 1) + " sweet type: ");
			sweet.setType(in.next());
			sweets.add(sweet);
		}
	}
	
	private void generatePackage() {
		pack = new Package();
//		System.out.print("Enter size: ");
//		String name = in.next();
//		System.out.print("Enter color: ");
//		String color = in.next();
//		pack = new Package(name, color);
	}
	
	public void showGift() {
		System.out.println("\nGift name: " + name + "\n");
		
		System.out.println("Sweets: ");
		for (Sweet sweet:sweets) {
			System.out.println(sweet.getName() + " " + sweet.getType());
		}
		
		System.out.print("\nPackage: ");
		System.out.println(pack.getSize() + " " + pack.getColor());
	}
}
