//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		
		//add test cases	
		out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();
		
		Distance test1 = new Distance(x1, y1, x2, y2);
		test1.calcDistance();
		test1.print();
		out.println("\n\n");
		
		out.print("Enter X1 :: ");
		x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		y2 = keyboard.nextInt();
		
		Distance test2 = new Distance(x1, y1, x2, y2);
		test2.calcDistance();
		test2.print();
		out.println("\n\n");
		
		out.print("Enter X1 :: ");
		x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		y2 = keyboard.nextInt();
		
		Distance test3 = new Distance(x1, y1, x2, y2);
		test3.calcDistance();
		test3.print();
	}
}