//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy input = new Toy("sorry");
		System.out.println(input);
		
		input = new Toy("gi joe");
		input.setCount(5);
		System.out.println(input);
	}
}