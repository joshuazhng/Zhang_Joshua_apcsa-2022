//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive test = new TriangleFive();
	   test.setLetter('C');
	   test.setAmount(4);
	   out.print(test);
	   out.println();
	   
	   test.setLetter('A');
	   test.setAmount(5);
	   out.print(test);
	   out.println();
	   
	   test.setLetter('B');
	   test.setAmount(7);
	   out.print(test);
	   out.println();
	   
	   test.setLetter('B');
	   test.setAmount(7);
	   out.print(test);
	   out.println();
	   
	   test.setLetter('X');
	   test.setAmount(6);
	   out.print(test);
	   out.println();
	   
	   test.setLetter('Z');
	   test.setAmount(8);
	   out.print(test);
	   out.println();
   }
}