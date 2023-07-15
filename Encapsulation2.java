package corejava;

public class Encapsulation2 extends Encapsulation1  
{
	public static void main(String []args)
	{
		Encapsulation2 e=new Encapsulation2();
		
		e.setAge(34);
		e.setName("hello all");
		
		System.out.println(e.getAge());
		
		
		System.out.println(e.getName());
		
	}
	

}
//why we use encapsulation?
//1.we use encapsulation to access private methods of public class in another public class 
//2.using set and get method we can access private methods
