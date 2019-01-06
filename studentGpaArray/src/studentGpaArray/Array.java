package studentGpaArray;

import java.util.ArrayList;

//import java.util.ArrayList;

public class Array {
	public static void main( String [] args)
	{
		int [] x = new int[30];
		x[1] = 1;
		
		Student Kimberly = new Student("Kimberly", 4.0);
		
		
		ArrayList<String> newStudent = new ArrayList<String>();
		//newStudent.add(1, "Kimberly");
		//String name = newStudent.get(1);
		

		System.out.println(Kimberly.toString());

		
		
	}
}
