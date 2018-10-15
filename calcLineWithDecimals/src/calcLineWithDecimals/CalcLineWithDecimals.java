//Shruti Janardhanan
//period 3

package calcLineWithDecimals;

import java.util.Scanner;

public class CalcLineWithDecimals {

	public static void main (String[] args)
	{
	
	//title
	String o;
	o = "Calculate the equation of a line!";
	System.out.println(o);
		
	//getting student info
		String p;
		Scanner pen = new Scanner(System.in);
		
		System.out.println("What is your name?");
		p = pen.next();
		pen.nextLine();
 
		// System.out.println(p);
		
		String c;
		Scanner inp = new Scanner(System.in);
		
		System.out.println("What grade are you in? freshman/sophomore/junior/senior");
		c = inp.next();
		inp.nextLine();
 
		// System.out.println(c);
		
		//inputting coordinates
		System.out.println("This program will help you find the equation of two points.");

		double u; 
		Scanner line = new Scanner(System.in);
		
		
		System.out.println("Please enter your first x coordinate");
		u = line.nextDouble();
		line.nextLine();
 
		//System.out.println(u);
		
		double v;
		Scanner pie = new Scanner(System.in);
		
		
		System.out.println("Please enter your first y coordinate");
		v = pie.nextDouble();
		pie.nextLine();
 
		//System.out.println(v);
		
		double w;
		Scanner main = new Scanner(System.in);
		
		
		System.out.println("Please enter your second x coordinate");
		w = main.nextDouble();
		main.nextLine();
 
		//System.out.println(w);
		
		double z;
		Scanner word = new Scanner(System.in);
		
		
		System.out.println("Please enter your second y coordinate");
		z = word.nextDouble();
		word.nextLine();
 
		//System.out.println(z);
	
		System.out.println("ok" + "," + " "+  p + " " + "the" + " " + c + "!");
	
		//calculations
		double m;
		
		m = (z - v) / (w - u);
				
		/*  m = slope of line
		 * z = y2
		 * v = y1
		 * w = x2
		 * u = x1
		 */
		
		// y = m*x + b
		// b : y-intercept
		
		double b;
		
		b = z - (m*w);
		
		//outputting info
		System.out.println("so" + " " + "the" + " " + "equation" + " " + "of" + " " + "the" + " " + "line" + " " + "is" + ":");
		
		System.out.println("y" + " " + "=" + " " + m + "x" + " " + "+" + " " + b );
	
	
	}
	
}

