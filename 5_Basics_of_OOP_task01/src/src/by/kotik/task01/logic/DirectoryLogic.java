package by.kotik.task01.logic;

import by.kotik.task01.entity.Directory;
import by.kotik.task01.entity.File;
import by.kotik.task01.entity.TextFile;

public class DirectoryLogic {
	
	public static File getFile(Directory dir, int index) {
		return dir.getFiles().get(index);
	}
	
	public static void addFile(Directory dir, File file) {
		dir.getFiles().add(file);
	}
	
	public static void deleteFile(Directory dir, String fileName) {
		for (File file:dir.getFiles()) {
			if (file.getName().equals(fileName)) {
				dir.getFiles().remove(file);
				break;
			}
		}
	}
	
	public static void showFiles(Directory dir) {
		for (File file:dir.getFiles()) {
			System.out.println(file.getName() + " " + file.getType() + " " + ((TextFile)file).getData());
		}
	}
}
