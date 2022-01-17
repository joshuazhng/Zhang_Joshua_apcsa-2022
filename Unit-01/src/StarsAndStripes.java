//� A+ Computer Science

//www.apluscompsci.com

//Name - Joshua Zhang
//Date - 1/14/22
//Class - AP CSA Mauro Period 1
//Lab  - Stars and Stripes

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   for (int i=0; i<20; i++) {
		   out.print("*");
	   }
	   out.println();
   }

   public void printTwentyDashes()
   {
	   for (int i=0; i<20; i++) {
		   out.print("-");
	   }
	   out.println();
   }

   public void printTwoBlankLines()
   {
	   out.println();
	   out.println();
   }
   
   public void printASmallBox()
   {	
	   for (int i=0; i<3; i++) {
		   printTwentyDashes();
		   printTwentyStars();
	   }
	   printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
	   printASmallBox();
	   printASmallBox();
   }   
}