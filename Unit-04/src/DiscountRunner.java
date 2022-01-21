//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt1 = keyboard.nextDouble();
		Discount.getDiscountedBill(amt1);
		out.println("Bill after discount :: " + amt1 + "\n");
		
		out.print("Enter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		Discount.getDiscountedBill(amt2);
		out.println("Bill after discount :: " + amt2 + "\n");
		
		out.print("Enter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		Discount.getDiscountedBill(amt1);
		out.println("Bill after discount :: " + amt3 + "\n");
		
		out.print("Enter the original bill amount :: ");
		double amt4 = keyboard.nextDouble();
		Discount.getDiscountedBill(amt1);
		out.println("Bill after discount :: " + amt4 + "\n");
		
		out.print("Enter the original bill amount :: ");
		double amt5 = keyboard.nextDouble();
		Discount.getDiscountedBill(amt1);
		out.println("Bill after discount :: " + amt5 + "\n");
	}
}