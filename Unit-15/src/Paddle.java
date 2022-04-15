//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }

   //add the other Paddle constructors
   public Paddle(int x, int y)
   {
	   super(x, y, 20, 40, Color.red);
	   speed = 5;
   }

   public Paddle(int x, int y, int s)
   {
	   super(x, y, 20, 40, Color.red);
	   speed = s;
   }

   public Paddle(int x, int y, int wid, int ht, int s)
   {
	   super(x, y, wid, ht, Color.red);
	   speed = s;
   }
   
   public Paddle(int x, int y, int wid, int ht, Color col, int s)
   {
	  super(x, y, wid, ht, col);
	  speed = s;
   }

   public void setSpeed(int s)
   {
	   speed = s;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setY(getY()-getSpeed());
	   draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setY(getY()+getSpeed());
	   draw(window);
   }

   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   //add a toString() method
   public String toString() {
	   return super.toString() + " " + speed;
   }
}