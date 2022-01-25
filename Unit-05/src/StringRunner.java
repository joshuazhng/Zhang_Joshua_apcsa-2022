//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class StringRunner
{
	public static void main ( String[] args )
	{
		StringOddOrEven test = new StringOddOrEven();
		Scanner Keyboard = new Scanner(System.in);
		
		out.print("Enter a word :: ");
		String input = Keyboard.nextLine();
		test.setString(input);
		out.println(test);
		
		out.print("\nEnter a word :: ");
		input = Keyboard.nextLine();
		test.setString(input);
		out.println(test);
		
		out.print("\nEnter a word :: ");
		input = Keyboard.nextLine();
		test.setString(input);
		out.println(test);
		
		out.print("\nEnter a word :: ");
		input = Keyboard.nextLine();
		test.setString(input);
		out.println(test);
		
		out.print("\nEnter a word :: ");
		input = Keyboard.nextLine();
		test.setString(input);
		out.println(test);
		
		out.print("\nEnter a word :: ");
		input = Keyboard.nextLine();
		test.setString(input);
		out.println(test);
		
		out.print("\nEnter a word :: ");
		input = Keyboard.nextLine();
		test.setString(input);
		out.println(test);
		
		out.print("\nEnter a word :: ");
		input = Keyboard.nextLine();
		test.setString(input);
		out.println(test);
	}
}