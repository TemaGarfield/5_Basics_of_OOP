package by.epam.task05.logic;

public class Sweet {
	private String name;
	private String type;
	
	Sweet() {
		
	}
	
	Sweet(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
