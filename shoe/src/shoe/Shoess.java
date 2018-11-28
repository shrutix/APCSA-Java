//objects and classes basics

package shoe;

public class Shoess {
	
	//object variables
	private int size;
	private String color;
	
	//default constructor
	public Shoess()
	{
		size = 0;
		color = " ";
	}
	
	//custom constructor
	public Shoess( int a, String b )
	{
		size = a;
		color = b;
	}
	
	//getters
	public int getSize()
	{
		return size;
	}
	
	public String getColor()
	{
		return color;
	}
	
	//setters
	public void setSize( int a)
	{
		size = a;
	}
	
	public void setColor( String b)
	{
		color = b;
	}
	
	/*public void display()
	{
		System.out.println("Your Shoes is size " + size);
		System.out.println("");
		
	}*/
	public String toString()
	{
		return("Your shoe size is " + size + " and your shoe color is " + color + ".");
		
	}

}
