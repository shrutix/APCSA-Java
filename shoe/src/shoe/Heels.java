package shoe;

public class Heels extends Shoess
{
	int height;
	
	public Heels()
	{
		super();
		height = 2;
	}
	
	public Heels(int a, String b, int c)
	{
		super(a, b);
		height = c;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}

}
