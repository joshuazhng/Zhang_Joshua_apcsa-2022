//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   //constructors
   public BlinkyBall()
   {
		super();
   }

   public BlinkyBall(int x, int y)
   {
	   super(x, y);
   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {
	   super(x, y, wid, ht);
   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, xSpd, ySpd);
   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, col, xSpd, ySpd);
   }

   public Color randomColor()
   {
	   Random rand = new Random();
	   int r = rand.nextInt(255);
	   int g = rand.nextInt(255);
	   int b = rand.nextInt(255);
	   Color randomColor = new Color(r, g, b);
	   return randomColor;
   }

   public void moveAndDraw(Graphics window)
   {
	 //draw a white ball at old ball location
	   draw(window, Color.white);

      setX(getX()+super.getXSpeed());
		//setY
      setY(getY()+super.getYSpeed());
		//draw the ball at its new location
      draw(window);
   }
}