//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;
	
	private boolean hitLeftPaddle = false;
	private boolean hitRightPaddle = false;

	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(10, 100, 10, 10, Color.blue, 2, 1);
		leftPaddle = new Paddle(20, 200, 10, 40, Color.orange, 2);
		rightPaddle = new Paddle(760, 200, 10, 40, Color.orange, 2);
		keys = new boolean[4];
		leftScore = 0;
		rightScore = 0;

		keys = new boolean[4];

    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall

		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			
			if(ball.getX() <=40)
			{
				rightScore++;
			}
			if(ball.getX() >=720)
			{
				leftScore++;
			}
			
			try
			{
				Thread.currentThread().sleep(950);
				
			}catch(Exception e) {}
			
			ball.draw(graphToBack, Color.WHITE);
			ball.setX((int)(Math.random()*50)+400);
			
			ball.setY((int)(Math.random()*50)+300);
			int whoot = (int)(Math.random()*2);
			if(whoot == 0)
			{
				ball.setXSpeed(2);
				ball.setYSpeed(1);
			}
			else
			{
				ball.setXSpeed(-2);
				ball.setYSpeed(1);
			}
			
			
		}
		
		
		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(440, 520, 80, 80);
		graphToBack.fillRect(640, 520, 100, 100);
		graphToBack.fillRect(140, 520, 100, 100);
		
		graphToBack.setColor(Color.red);
		
		graphToBack.drawString("rightScore = " + rightScore, 400, 540);
		graphToBack.drawString("leftScore = " +leftScore, 400, 540);
		
		graphToBack.drawString("hitRightPaddle = " + hitRightPaddle, 600, 540);
		graphToBack.drawString("hitLeftPaddle = " + hitLeftPaddle, 600, 540);
		
		
		if(!(ball.getY() >=20 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getXSpeed());
			if(ball.getY() < 20 && hitLeftPaddle)
			{
				hitLeftPaddle = false;
				leftScore++;
			}
			if(ball.getY() > 450 && hitRightPaddle)
			{
				hitRightPaddle = false;
				rightScore++;
			}
			
			
			
		}


		if((ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed()))
		&&
		(ball.getY() >= leftPaddle.getY() &&
		ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight() ||
		ball.getY() + ball.getHeight() >= leftPaddle.getY() &&
		ball.getY() + ball.getHeight() <= leftPaddle.getY() + leftPaddle.getHeight()))

		{
			hitLeftPaddle = true;
			
			if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed()))
			{
				ball.setYSpeed(-ball.getYSpeed());
				
			}
			else
				ball.setXSpeed(-ball.getXSpeed());
			
		}
		
		
		if((ball.getX() + ball.getWidth() >= rightPaddle.getX() - Math.abs(ball.getXSpeed()))
			&&
			(ball.getY()-ball.getHeight() >= rightPaddle.getY() &&
			ball.getY()-ball.getHeight() <= rightPaddle.getY() + rightPaddle.getHeight() ||
			ball.getY()-ball.getHeight() >= rightPaddle.getY() &&
			ball.getY()-ball.getHeight() <= rightPaddle.getY() + leftPaddle.getHeight()))
		{
			hitRightPaddle = true;
			if(ball.getX()+ball.getWidth() >= rightPaddle.getX()+Math.abs(ball.getXSpeed()))
			{
				ball.setYSpeed(-ball.getYSpeed());
				
			}
			else
				ball.setXSpeed(-ball.getXSpeed());
			
		}
	
		if(keys[0] == true)
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
	
		//see if the ball hits the left paddle
		
		//see if the ball hits the right paddle

		//see if the paddles need to be moved
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}