//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		String nm = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		int sz = keyboard.nextInt();
		
		//instantiate monster one
		Skeleton monster1 = new Skeleton(nm, sz);
		
		//ask for name and size
		System.out.print("Enter 2nd monster's name : ");
		String nm2 = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");
		int sz2 = keyboard.nextInt();
		
		//instantiate monster two
		Skeleton monster2 = new Skeleton(nm2, sz2);
		
		out.println("\nMonster 1 - " + monster1);
		out.println("Monster 2 - " + monster2 + "\n");
		
		if(monster1.isBigger(monster2))
			out.println("Monster one is bigger than Monster two.");
		else if (monster1.isSmaller(monster2))
			out.println("Monster one is smaller than Monster two.");
		else
			out.println("Monster one is the same size as Monster two.");
		
		if(monster1.namesTheSame(monster2))
			out.println("Monster one has the same name as Monster two.");
		else
			out.println("Monster one does not have the same name as Monster two.");
	}
}