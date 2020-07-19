package by.epam.task01.logic;


public class TextFile extends File {
	
	private StringBuilder content = new StringBuilder();
	
	TextFile (String name, String expansion) {
		super(name, expansion);
		create();
	}
	
	TextFile(String name, String expansion, String str) {
		super(name, expansion);
		content.append(str + "\n");
		create();
	}
	
	protected void create() {
		System.out.println("Text file was created!");
	}
	
	protected void rename(String newName) {
		System.out.print("\nFile was renamed from \"" + super.toString() + "\"");
		super.setName(newName);
		System.out.println(" to \"" + super.toString() + "\"");
	}
	
	protected void edit(String str) {
		content.append(str + "\n");
	}
	
	protected void show() {
		System.out.println("\"" + super.toString() + "\"" + " content:");
		System.out.println(content.toString());
	}
	
}
