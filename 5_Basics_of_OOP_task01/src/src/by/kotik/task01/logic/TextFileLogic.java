package by.kotik.task01.logic;

import by.kotik.task01.entity.Directory;
import by.kotik.task01.entity.File;
import by.kotik.task01.entity.TextFile;

public class TextFileLogic extends FileLogic {
	
	
	
	public File createTextFile(String name, Directory dir, String data) {
		System.out.println("Creating file...");
		TextFile textFile = new TextFile(name, data);
		DirectoryLogic.addFile(dir, textFile);
		return textFile;
	}
	
	@Override
	public void renameFile(File file, String newName) {
		file.setName(newName);
	}

	@Override
	public void showData(File file) {
		System.out.println(((TextFile) file).getData());
	}
	
	@SuppressWarnings("hiding")
	@Override
	public <String> void addData(File file, String addedData) {
		((TextFile) file).setData(((TextFile) file).getData() + "\n" + addedData);
	}
	
}
