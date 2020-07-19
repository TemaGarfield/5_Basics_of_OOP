package by.epam.task01.logic;

import java.util.ArrayList;

public class Directory {
	private String dirPath;
	private ArrayList<File> files = new ArrayList<File>();
	
	public Directory(String dirPath) {
		this.dirPath = dirPath;
	}
	
	public void setDirPath(String dirPath) {
		this.dirPath = dirPath;
	}
	
	public String getDirPath() {
		return dirPath;
	}
	
	public void createTextFile(String name, String expansion) {
		
		TextFile file = new TextFile(name, expansion);
		
		addFile(file);
	}
	
	public void createTextFile(String name, String expansion, String content) {
		
		TextFile file = new TextFile(name, expansion, content);
		
		addFile(file);
	}
	
	public void addFile(File file) {
		files.add(file);
	}
	
	public void editFileContent(int fileIndex, String str) {
		if (fileIndex >= files.size() || fileIndex < 0) {
			System.out.println("Sorry. I can't find this file.");
		} else if (files.get(fileIndex) instanceof TextFile) {
			TextFile file = (TextFile) files.get(fileIndex);
			file.edit(str);
		} else {
			System.out.println("Sorry. This is not a text file.");
		}
	}
	
	public void showFileContent(int fileIndex) {
		if (fileIndex >= files.size() || fileIndex < 0) {
			System.out.println("Sorry. I can't find this file.");
		} else {
			files.get(fileIndex).show();
		}
	}
	
	public void renameFile(int fileIndex, String newName) {
		if (fileIndex >= files.size() || fileIndex < 0) {
			System.out.println("Sorry. I can't find this file.");
		} else {
			files.get(fileIndex).rename(newName);
		}
	}
	
	public void deleteFile(int fileIndex) {
		if (fileIndex >= files.size() || fileIndex < 0) {
			System.out.println("Sorry. I can't find this file.");
		} else {
			files.remove(fileIndex);
		}
	}
	
	public void showFiles() {
		int counter = 0;
		
		System.out.println("\nFiles in directory " + "\"" + dirPath + "\":" );
		for (File file:files) {
			System.out.println(counter + ". " + file.toString());
			counter++;
		}
	}
	

}
