import java.util.ArrayList;

public class arrayList {
	public static void main( String [] args)
	{
		int [] x = new int[5];
		x[0] = 9;
		
		ArrayList<Integer> y = new ArrayList<Integer>();
		y.add(5);
		y.add(21);
		y.add(34);
		
		System.out.println( y.size());
		System.out.println(y.get(0));
		
		y.set(1, 23);
		y.remove(1);
		
		y.add(2, 23);
		for(int i = 0; i<y.size(); i++)
		{
			System.out.println( y.get(i) );
		}
		
	}
}
