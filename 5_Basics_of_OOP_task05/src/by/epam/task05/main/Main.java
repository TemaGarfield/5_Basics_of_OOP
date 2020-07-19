package by.epam.task05.main;

import by.epam.task05.logic.*;

public class Main {

	/*
	 * 5. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок). Составляющими целого подарка 
	 * являются сладости и упаковка.*/
	
	public static void main(String[] args) {
		
		Gift gift = new Gift("1st gift");
		
		gift.generateGift();
		gift.showGift();
	}

}
