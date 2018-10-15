//Shruti J
//period 3

package gradesInClass;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) 
	
	{
		
		double grade;
		Scanner input = new Scanner(System.in);
		System.out.println("What numerical grade did you get? (leave out the %): ");
		grade = input.nextDouble();
		input.nextLine();
		
		if( grade >= 89.5)
		{
			System.out.println("You received in A! Nice work!");
			
		}
		else if ( grade >= 79.5)
		{
			System.out.println("You received a B :(");
		}
		
		else if ( grade >= 69.5 )
		{
			System.out.println("Your received a C :(");
		}
		
		else
		{
			
			System.out.println("You failed...don't even go home....not worth it");
			
		}
		
		
		
	}

}
