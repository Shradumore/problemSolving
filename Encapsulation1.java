package corejava;

public class Encapsulation1 
{
	private int age;

	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;   //this keyword indicates the current class
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
