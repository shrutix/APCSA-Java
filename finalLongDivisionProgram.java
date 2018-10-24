import java.util.Scanner;
public class finalLongDivisionProgram {

	public static void main(String[] args)
    { 
    	 
        int x;
        int y;
        int n = 10;
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of your dividend.");
		x = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the value of your divisor.");
		y = input.nextInt();
		input.nextLine();
		
        int d = x / y;
        
        for (int i = 0; i <= n; i++) 
        { 
            System.out.print(d); 
            x = x - (y * d); 
            if (x == 0) 
                break; 
            x = x * 10; 
            d = x / y; 
           if (i == 0) 
            {
            System.out.print("."); 
            } 
        }
    }
}
