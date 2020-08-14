package by.kotik.task01.main;

import by.kotik.task01.entity.Directory;
import by.kotik.task01.logic.DirectoryLogic;
import by.kotik.task01.logic.TextFileLogic;
/*
 * 1.Создать объект класса текстовый файл, используя классы Файл, Дирректория. Методы: создать, переименовать,
 * 	 вывести на консоль содержимое, дополнить, удалить.
 * */

public class Main {

	public static void main(String[] args) {
		Directory dir = new Directory("C:");
		TextFileLogic textFileLogic = new TextFileLogic();
		
		System.out.println("Creating files.");
		textFileLogic.createTextFile("Name1", dir, "Name1 content.");
		textFileLogic.createTextFile("Name2", dir, "Name2 content.");
		textFileLogic.createTextFile("Name3", dir, "Name3 content.");
		
		System.out.println("\nRenaming.");
		DirectoryLogic.showFiles(dir);
		textFileLogic.renameFile(DirectoryLogic.getFile(dir, 1), "NewName2");
		System.out.println();
		DirectoryLogic.showFiles(dir);
		
		System.out.println("\nShowing file content.");
		textFileLogic.showData(DirectoryLogic.getFile(dir, 0));
		textFileLogic.showData(DirectoryLogic.getFile(dir, 1));
		textFileLogic.showData(DirectoryLogic.getFile(dir, 2));
		
		System.out.println("\nAddition.");
		textFileLogic.addData(DirectoryLogic.getFile(dir, 0), "Some new content for Name1");
		
		System.out.println("\nShowing file content after edditing.");
		textFileLogic.showData(DirectoryLogic.getFile(dir, 0));
		
		System.out.println("\nDeletion.");
		DirectoryLogic.deleteFile(dir, "Name3");
		
		System.out.println("\nResult: ");
		DirectoryLogic.showFiles(dir);	
		
	}

}
