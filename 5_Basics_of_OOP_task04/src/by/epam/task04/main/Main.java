package by.epam.task04.main;

import java.util.ArrayList;
import java.util.Scanner;

import by.epam.task04.logic.Cave;

/*
 * 4. Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона. Реализовать возможность 
 * просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.*/

public class Main {
	
	private static void showMessage() {
		System.out.println("What do you want?");
		System.out.println("1. Watch all treasures");
		System.out.println("2. Choosing the most expensive treasure");
		System.out.println("3. Choosing treasures for given amount");
		System.out.print("Enter: ");
	}

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		Cave cave = new Cave("Cave");
		
		
		int choice;
		do {
			showMessage();
			choice = in.nextInt();
		} while (choice < 1 || choice > 3);
		
		cave.generateCave();
		switch (choice) {
		case 1: 
			cave.showTreasures();
			break;
		case 2:
			double max = cave.findMax();
			System.out.println(max);
			break;
		case 3:
			System.out.print("Enter value: ");
			double price = in.nextDouble();
			cave.findByPrice(price);
			break;
		default:
			break;
		}

	}
	

}
