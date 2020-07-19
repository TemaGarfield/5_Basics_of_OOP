package by.epam.task02.main;

/*
 * 2.Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
 * */

import by.epam.task02.logic.*;

public class Main {

	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.showProducts();
		payment.addProduct("Coca-cola", 1.05);
		payment.addProduct("Fanta", 2.5);
		payment.addProduct("Sprite", 3.47);
		payment.calculatePrice();
		payment.showProducts();
		payment.showPrice();

	}

}
