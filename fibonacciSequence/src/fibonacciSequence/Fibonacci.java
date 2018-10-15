//Shruti Janardhanan 
//period 3 APCS
package fibonacciSequence;

import java.util.Scanner;

public class Fibonacci {
	public static void main (String[] args)
	{ 
		System.out.println("Welcome to the Fibonacci Sequence Calculator!");
		int fib;
		int w = 0, x = 1, y = 0, z;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of which term in the fibonacci sequence you want to know.");
		fib = input.nextInt();
		input.nextLine();
		
		while (y < fib - 1)
		{
			z = x;
			x = w + x;
			w = z;
			y = y + 1;
		}
		
		System.out.println("Your number is" + " " + x);
		
		
		
	}
}
