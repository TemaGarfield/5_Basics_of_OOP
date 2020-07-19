package by.epam.task01.logic;

public abstract class File {
	private String name;
	private String expansion;
	
	protected abstract void create();
	protected abstract void rename(String newName);
	protected abstract void show();
	
	protected File(String name, String expansion) {
		this.name = name;
		this.expansion = expansion;
	}
	

	protected void setName(String name) {
		this.name = name;
	}
	
	protected void setExpansion(String expansion) {
		this.expansion = expansion;
	}
	
	protected String getName() {
		return name;
	}
	
	protected String getExpansion() {
		return expansion;
	}
	
	public String toString() {
		return name + "." + expansion;
	}

}
