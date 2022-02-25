//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String choice = "";
		
		do{
			System.out.print("Enter a word :: ");
			String word = keyboard.next();
	
 			TriangleWord.printTriangle(word);

			System.out.print("\nDo you want to enter more sample input (Enter Y or N)? ");
			choice=keyboard.next();			
			System.out.println();
		}while(choice.equals("Y")||choice.equals("y"));	
	}
}