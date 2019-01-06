package studentGpaArray;

public class Student {
	//object variables
		private String name;
		private double gpa;
		
		//default constructor
		public Student()
		{
			name = " ";
			gpa = 0.0;
		}
		
		//custom constructor
		public Student( String a, double b )
		{
			name = a;
			gpa = b;
		}
		
		//getters
		public String getName()
		{
			return name;
		}
		
		public double getGpa()
		{
			return gpa;
		}
		
		//setters
		public void setName( String a)
		{
			name = a;
		}
		
		public void setGpa( double b)
		{
			gpa = b;
		}
		public String toString()
		{
			return("This is " + name + " and her GPA is " + gpa + ".");
			
		}
	
}
