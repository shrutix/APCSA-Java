package shoe;

import java.util.*;

public class sauce {
	public static void  main (String [] args)
	{
		
		System.out.println("Girls Shoes \n");
		
		Shoess flats = new Shoess(7, "muave");
		flats.setSize(8);
		flats.setColor("muave");
		System.out.println( flats.getSize() );
		System.out.println( flats.getColor() );
		System.out.println( flats.toString() );
		System.out.println(" ");

		
		Shoess sneakers = new Shoess(7, "white");
		sneakers.setSize(8);
		sneakers.setColor("white");
		System.out.println( sneakers.getSize() );
		System.out.println( sneakers.getColor() );
		System.out.println( sneakers.toString() );
		System.out.println(" ");
		
		Shoess uggs = new Shoess(7, "tan");
		uggs.setSize(8);
		uggs.setColor("tan");
		System.out.println( uggs.getSize() );
		System.out.println( uggs.getColor() );
		System.out.println( uggs.toString() );
		System.out.println(" ");
		
		System.out.println("Boys Shoes \n");

		Shoess nike = new Shoess(10, "black");
		nike.setSize(11);
		nike.setColor("black");
		System.out.println( nike.getSize() );
		System.out.println( nike.getColor() );
		System.out.println( nike.toString() );
		System.out.println(" ");

		
		Shoess dressshoes = new Shoess(10, "black");
		dressshoes.setSize(11);
		dressshoes.setColor("black");
		System.out.println( dressshoes.getSize() );
		System.out.println( dressshoes.getColor() );
		System.out.println( dressshoes.toString() );
		System.out.println(" ");

		
		Shoess flops = new Shoess(10, "pink");
		flops.setSize(11);
		flops.setColor("pink");
		System.out.println( flops.getSize() );
		System.out.println( flops.getColor() );
		System.out.println( flops.toString() );
		System.out.println(" ");

		
		//Shoess whitesneakers = new Shoess(11, "white");
		
		//System.out.println( whitesneakers.getSize() );
		
		int[] arrayShelf = new int[6];
		arrayShelf[0] = 1;
		int[] shelf = {1, 2, 3, 4, 5, 6};
		System.out.println( arrayShelf[6]);
		
	}
}
