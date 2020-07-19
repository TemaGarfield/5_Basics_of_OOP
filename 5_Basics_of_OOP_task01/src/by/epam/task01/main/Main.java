package by.epam.task01.main;

import by.epam.task01.logic.Directory;

/*
 * 1.Создать объект класса текстовый файл, используя классы Файл, Дирректория. Методы: создать, переименовать,
 * 	 вывести на консоль содержимое, дополнить, удалить. 
 * */

public class Main {

	public static void main(String[] args) {
		Directory dir = new Directory("C:\\\\TestFolder\\");
		dir.createTextFile("name1", "txt", "asdasdasdasdsa");
		dir.createTextFile("name2", "txt");
		dir.showFiles();
		dir.deleteFile(1);
		dir.showFiles();
		dir.deleteFile(1);
		dir.renameFile(0, "Test");
		dir.showFileContent(0);
		dir.editFileContent(0, "Hello!");
		dir.editFileContent(0, "My name is...");
		dir.showFileContent(0);
		
	}

}


