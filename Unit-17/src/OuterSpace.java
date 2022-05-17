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
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;

	private AlienHorde horde;
	private Bullets shots;

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace() {
	    setBackground(Color.black);

	    keys = new boolean[5];

	    //instantiate other instance variables
	    //Ship, Alien
	    ship = new Ship(400, 500, 50, 50, 1);
	    shots = new Bullets();
	    horde = new AlienHorde(34);

	    this.addKeyListener(this);
	    new Thread(this).start();

	    setVisible(true);
	  }

	  public void update(Graphics window) {
	    paint(window);
	  }

	  public void paint(Graphics window) {
	    //set up the double buffering to make the game animation nice and smooth
	    Graphics2D twoDGraph = (Graphics2D) window;

	    //take a snap shop of the current screen and same it as an image
	    //that is the exact same width and height as the current screen
	    if (back == null) back = (BufferedImage) (createImage(getWidth(), getHeight()));

	    //create a graphics reference to the back ground image
	    //we will draw all changes on the background image
	    Graphics graphToBack = back.createGraphics();

	    graphToBack.setColor(Color.BLUE);
	    graphToBack.drawString("StarFighter ", 25, 50);
	    graphToBack.setColor(Color.BLACK);
	    graphToBack.fillRect(0, 0, 800, 600);

	    if (keys[0] && ship.getX() + ship.getSpeed() > 0) {
	      ship.move("left");
	    }
	    if (keys[1] && ship.getX() + ship.getSpeed() + ship.getWidth() < 800) {
	      ship.move("right");
	    }
	    if (keys[2] && ship.getY() + ship.getSpeed() > 0) {
	      ship.move("up");
	    }
	    if (keys[3] && ship.getY() + ship.getSpeed() + (ship.getHeight() * 2) < 600) {
	      ship.move("down");
	    }
	    if (keys[4]) {
	      shots.add(new Ammo(ship.getX(), ship.getY(), 5));
	      keys[4] = false;
	    }
	    //add code to move Ship, Alien, etc.
	    shots.drawEmAll(graphToBack);
	    shots.moveEmAll();
	    horde.drawEmAll(graphToBack);
	    horde.moveEmAll();
	    horde.removeDeadOnes(shots.getList());
	    ship.draw(graphToBack);
	    //add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship

	    twoDGraph.drawImage(back, null, 0, 0);
	  }

	  public void keyPressed(KeyEvent e) {
	    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
	      keys[0] = true;
	    }
	    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
	      keys[1] = true;
	    }
	    if (e.getKeyCode() == KeyEvent.VK_UP) {
	      keys[2] = true;
	    }
	    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
	      keys[3] = true;
	    }
	    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
	      keys[4] = true;
	    }
	    repaint();
	  }

	  public void keyReleased(KeyEvent e) {
	    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
	      keys[0] = false;
	    }
	    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
	      keys[1] = false;
	    }
	    if (e.getKeyCode() == KeyEvent.VK_UP) {
	      keys[2] = false;
	    }
	    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
	      keys[3] = false;
	    }
	    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
	      keys[4] = false;
	    }
	    repaint();
	  }

	  public void keyTyped(KeyEvent e) {}

	  public void run() {
	    try {
	      while (true) {
	        Thread.currentThread().sleep(5);
	        repaint();
	      }
	    } catch (Exception e) {}
	  }
	}

