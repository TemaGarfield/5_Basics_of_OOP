package by.kotik.task01.logic;

import by.kotik.task01.entity.File;

public abstract class FileLogic {
	public abstract void renameFile(File file, String newName);
	public abstract void showData(File file);
	public abstract <T> void addData(File file, T addedData);
}
