//Shruti J period 3
import java.util.*;
public class sauce 
{
	public static void main( String[] args)
	{
		mat a = new mat();
		mat b = new mat();
		mat c = new mat();
		mat d = new mat();		
		mat e = new mat();
		mat f = new mat();
		e.add(f);
		d.add(d);
		c.add(d);
		b.add(c);
		a.add(b);
		
		System.out.println(a.numberOfMats() );
		//Should return 6 and nothing else
	}

}
