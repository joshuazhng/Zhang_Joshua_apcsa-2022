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
		double final1 = Discount.getDiscountedBill(amt1);
		out.printf("Bill after discount :: %.2f\n", final1);
		
		out.print("\nEnter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		double final2 = Discount.getDiscountedBill(amt2);
		out.printf("Bill after discount :: %.2f\n", final2);
		
		out.print("\nEnter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		double final3 = Discount.getDiscountedBill(amt3);
		out.printf("Bill after discount :: %.2f\n", final3);
		
		out.print("\nEnter the original bill amount :: ");
		double amt4 = keyboard.nextDouble();
		double final4 = Discount.getDiscountedBill(amt4);
		out.printf("Bill after discount :: %.2f\n", final4);
		
		out.print("\nEnter the original bill amount :: ");
		double amt5 = keyboard.nextDouble();
		double final5 = Discount.getDiscountedBill(amt5);
		out.printf("Bill after discount :: %.2f\n", final5);
	}
}