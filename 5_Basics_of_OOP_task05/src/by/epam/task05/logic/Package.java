package by.epam.task05.logic;

import java.util.Scanner;

public class Package {
	Scanner in = new Scanner(System.in);
	
	private String size;
	private String color;
	
	private String[] sizes = {"Big", "Medium", "Small"};
	private String[] colors = {"Red", "Green", "Blue", "Yellow", "Black"};
	
	Package() {
		this.size = sizes[chooseSize() - 1];
		this.color = colors[chooseColor() - 1];
	}
	
	Package(String size, String color) {
		this.size = size;
		this.color = color;
	}
	
	public String getSize() {
		return size;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSize(String size) {
		this.size = sizes[chooseSize() - 1];
	}
	
	public void setColor(String color) {
		this.color = colors[chooseColor() - 1];
	}
	
	private int chooseSize() {
		
		int choice;
		do {
			System.out.println("Choose size: ");
			
			for (int i = 0; i < sizes.length; i++) {
				System.out.println((i + 1) + ". " + sizes[i]);
			}
			System.out.print("Enter: ");
			choice = in.nextInt();
		
		} while (choice <= 0 || choice > sizes.length);
		
		return choice;
	}
	
	private int chooseColor() {
		int choice;
		do {
			System.out.println("Choose color: ");
			
			for (int i = 0; i < colors.length; i++) {
				System.out.println((i + 1) + ". " + colors[i]);
			}
			
			System.out.print("Enter: ");
			choice = in.nextInt();
			
		} while(choice <= 0 || choice > colors.length);
		
		return choice;
	}
}
