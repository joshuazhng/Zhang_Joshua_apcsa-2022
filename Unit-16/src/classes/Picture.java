package classes;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */

	public class Picture extends SimplePicture 
	{
	  ///////////////////// constructors //////////////////////////////////
	  
	  /**
	   * Constructor that takes no arguments 
	   */
	  public Picture ()
	  {
	    /* not needed but use it to show students the implicit call to super()
	     * child constructors always call a parent constructor 
	     */
	    super();  
	  }
	  
	  /**
	   * Constructor that takes a file name and creates the picture 
	   * @param fileName the name of the file to create the picture from
	   */
	  public Picture(String fileName)
	  {
	    // let the parent class handle this fileName
	    super(fileName);
	  }
	  
	  /**
	   * Constructor that takes the width and height
	   * @param height the height of the desired picture
	   * @param width the width of the desired picture
	   */
	  public Picture(int height, int width)
	  {
	    // let the parent class handle this width and height
	    super(width,height);
	  }
	  
	  /**
	   * Constructor that takes a picture and creates a 
	   * copy of that picture
	   * @param copyPicture the picture to copy
	   */
	  public Picture(Picture copyPicture)
	  {
	    // let the parent class do the copy
	    super(copyPicture);
	  }
	  
	  /**
	   * Constructor that takes a buffered image
	   * @param image the buffered image to use
	   */
	  public Picture(BufferedImage image)
	  {
	    super(image);
	  }
	  
	  ////////////////////// methods ///////////////////////////////////////
	  
	  /**
	   * Method to return a string with information about this picture.
	   * @return a string with information about the picture such as fileName,
	   * height and width.
	   */
	  public String toString()
	  {
	    String output = "Picture, filename " + getFileName() + 
	      " height " + getHeight() 
	      + " width " + getWidth();
	    return output;
	    
	  }
	  
	  /** Method to set the blue to 0 */
	  public void zeroBlue()
	  {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setBlue(0);
	      }
	    }
	  }
	  
	  public void keepOnlyBlue() {
		  Pixel[][] pixels = this.getPixels2D();
		  for (Pixel[] row : pixels) {
			  for (Pixel pix : row) {
				  pix.setRed(0);
				  pix.setGreen(0);
			  }
		  }
	  }
	  
	  public void keepOnlyGreen() {
		  Pixel[][] pixels = this.getPixels2D();
		  for (Pixel[] row : pixels) {
			  for (Pixel pix : row) {
				  pix.setRed(0);
				  pix.setBlue(0);
			  }
		  }
	  }
	  
	  public void keepOnlyRed() {
		  Pixel[][] pixels = this.getPixels2D();
		  for (Pixel[] row : pixels) {
			  for (Pixel pix : row) {
				  pix.setBlue(0);
				  pix.setGreen(0);
			  }
		  }
	  }
	  
	  public void negate() {
		  Pixel[][] pixels = this.getPixels2D();
		  for (Pixel[] row : pixels) {
			  for (Pixel pix : row) {
				  pix.setRed(255 - pix.getRed());
				  pix.setGreen(255 - pix.getGreen());
				  pix.setBlue(255 - pix.getBlue());
			  }
		  }
	  }
	  
	  public void grayscale() {
		  Pixel[][] pixels = this.getPixels2D();
		  for (Pixel[] row : pixels) {
			  for (Pixel pix : row) {
				  int avg = (pix.getBlue() + pix.getRed() + pix.getGreen()) / 3;
				  pix.setRed(avg);
				  pix.setGreen(avg);
				  pix.setBlue(avg);
			  }
		  }
	  }
	  
	  public void fixUnderwater() {
		  Pixel[][] pixels = this.getPixels2D();
		  for (Pixel[] row : pixels) {
			  for (Pixel pix : row) {
				  if (pix.getRed() <= 18) {
					  pix.setRed(pix.getRed() * pix.getRed()/18);
					  pix.setGreen(pix.getGreen()* pix.getRed()/18);
					  pix.setBlue(pix.getBlue() * pix.getRed()/18);
				  }
			  }
		  }
	  }
	  
	  /**
	   * 
		5. Write the grayscale method to turn the picture into shades of gray. Set the red, green, and
		blue values to the average of the current red, green, and blue values (add all three values and
		divide by 3). Create a class (static) method to test this new method in the class
		PictureTester. Be sure to call the new test method in the main method in
		PictureTester.
		6. Challenge — Explore the “water.jpg” picture in the images folder. Write a method
		fixUnderwater() to modify the pixel colors to make the fish easier to see. Create a class
		(static) method to test this new method in the class PictureTester. Be sure to call the new
		test method in the main method in PictureTester.
	   */
	  
	  /** Method that mirrors the picture around a 
	    * vertical mirror in the center of the picture
	    * from left to right */
	  public void mirrorVertical()
	  {
	    Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int width = pixels[0].length;
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; col < width / 2; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][width - 1 - col];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    } 
	  }
	  
	  public void mirrorVerticalRightToLeft()
	  {
	    Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int width = pixels[0].length;
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; col < width / 2; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][width - 1 - col];
	        leftPixel.setColor(rightPixel.getColor());
	      }
	    } 
	  }
	  
	  public void mirrorHorizontal()
	  {
	    Pixel[][] pixels = this.getPixels2D();
	    Pixel upperPixel = null;
	    Pixel lowerPixel = null;
	    int height = pixels.length;
	    for (int row = 0; row < pixels.length / 2; row++)
	    {
	      for (int col = 0; col < pixels[0].length; col++)
	      {
	        upperPixel = pixels[row][col];
	        lowerPixel = pixels[height - row - 1][col];
	        lowerPixel.setColor(upperPixel.getColor());
	      }
	    } 
	  }
	  
	  public void mirrorHorizontalBotToTop()
	  {
	    Pixel[][] pixels = this.getPixels2D();
	    Pixel upperPixel = null;
	    Pixel lowerPixel = null;
	    int height = pixels.length;
	    for (int row = 0; row < pixels.length / 2; row++)
	    {
	      for (int col = 0; col < pixels[0].length; col++)
	      {
	        upperPixel = pixels[row][col];
	        lowerPixel = pixels[height - row - 1][col];
	        upperPixel.setColor(lowerPixel.getColor());
	      }
	    } 
	  }
	  
	  public void mirrorDiagonal()
	  {
	    Pixel[][] pixels = this.getPixels2D();
	    Pixel firstPixel = null;
	    Pixel secondPixel = null;
	    int width = pixels[0].length;
	    int height = pixels.length;
	    for (int row = 0; row < Math.min(width, height); row++)
	    {
	      for (int col = 0; col < Math.min(width, height); col++)
	      {
	        firstPixel = pixels[row][col];
	        secondPixel = pixels[col][row];
	        firstPixel.setColor(secondPixel.getColor());
	      }
	    } 
	  }
	  
	  /** Mirror just part of a picture of a temple */
	  public void mirrorTemple()
	  {
	    int mirrorPoint = 276;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int count = 0;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 27; row < 97; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 13; col < mirrorPoint; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row]                       
	                         [mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	        count++;
	      }
	    }
	    System.out.println(count);
	  }
	  
	  public void mirrorArms()
	  {
	    int mirrorPoint = 197;
	    Pixel upperPixel = null;
	    Pixel lowerPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 158; row < mirrorPoint; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 105; col < 295; col++)
	      {
	        
	        upperPixel = pixels[row][col];      
	        lowerPixel = pixels[mirrorPoint - row + mirrorPoint][col];
	        lowerPixel.setColor(upperPixel.getColor());
	      }
	    }
	  }
	  
	  public void mirrorGull()
	  {
	    int mirrorPoint = 350;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 233; row < mirrorPoint; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 230; col < 350; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row]                       
	                         [mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    }
	  }
	  
	  /** copy from the passed fromPic to the
	    * specified startRow and startCol in the
	    * current picture
	    * @param fromPic the picture to copy from
	    * @param startRow the start row to copy to
	    * @param startCol the start col to copy to
	    */
	  public void copy(Picture fromPic, 
	                 int startRow, int startCol)
	  {
	    Pixel fromPixel = null;
	    Pixel toPixel = null;
	    Pixel[][] toPixels = this.getPixels2D();
	    Pixel[][] fromPixels = fromPic.getPixels2D();
	    for (int fromRow = 0, toRow = startRow; 
	         fromRow < fromPixels.length &&
	         toRow < toPixels.length; 
	         fromRow++, toRow++)
	    {
	      for (int fromCol = 0, toCol = startCol; 
	           fromCol < fromPixels[0].length &&
	           toCol < toPixels[0].length;  
	           fromCol++, toCol++)
	      {
	        fromPixel = fromPixels[fromRow][fromCol];
	        toPixel = toPixels[toRow][toCol];
	        toPixel.setColor(fromPixel.getColor());
	      }
	    }   
	  }
	  
	  public void copy(Picture fromPic,
			  int fromStartRow,int fromEndRow, int fromStartCol, int fromEndCol,
	          int startRow, int startCol)
	  {
		  Pixel fromPixel = null;
		  Pixel toPixel = null;
		  Pixel[][] toPixels = this.getPixels2D();
		  Pixel[][] fromPixels = fromPic.getPixels2D();
		  for (int fromRow = fromStartRow, toRow = startRow; 
				  fromRow < fromEndRow &&
				  toRow < toPixels.length; 
				  fromRow++, toRow++)
		  {
			  for (int fromCol = fromStartCol, toCol = startCol; 
					  fromCol < fromEndCol &&
					  toCol < toPixels[0].length;  
					  fromCol++, toCol++)
			  {
				  fromPixel = fromPixels[fromRow][fromCol];
				  toPixel = toPixels[toRow][toCol];
				  toPixel.setColor(fromPixel.getColor());
			  }
		  }   
	  }

	  /** Method to create a collage of several pictures */
	  public void createCollage()
	  {
	    Picture flower1 = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\flower1.jpg");
	    Picture flower2 = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\flower2.jpg");
	    this.copy(flower1,0,0);
	    this.copy(flower2,100,0);
	    this.copy(flower1,200,0);
	    Picture flowerNoBlue = new Picture(flower2);
	    flowerNoBlue.zeroBlue();
	    this.copy(flowerNoBlue,300,0);
	    this.copy(flower1,400,0);
	    this.copy(flower2,500,0);
	    this.mirrorVertical();
	    this.write("collage.jpg");
	  }
	  
	  public void myCollage()
	  {
	    Picture flower1 = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\flower1.jpg");
	    Picture flower2 = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\flower2.jpg");
	    this.copy(flower1, 20, 50, 10, 60, 50, 200);
	    this.copy(flower2, 40, 50, 50, 60, 300, 300);
	    flower1.keepOnlyRed();
	    this.copy(flower1,200,0);
	    flower1.negate();
	    this.copy(flower1,300,0);
	    this.mirrorDiagonal();
	    this.write("C:\\Users\\selen\\Documents\\GitHub\\qiao_selena_apcsa-2022\\unit16\\src\\collage.jpg");
	  }
	  
	  
	  /** Method to show large changes in color 
	    * @param edgeDist the distance for finding edges
	    */
	  public void edgeDetection(int edgeDist)
	  {
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel lowerPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    Color rightColor = null;
	    Color lowerColor = null;
	    for (int row = 0; row < pixels.length-1; row++)
	    {
	      for (int col = 0; 
	           col < pixels[0].length-1; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][col+1];
	        lowerPixel = pixels[row+1][col];
	        rightColor = rightPixel.getColor();
	        lowerColor = lowerPixel.getColor();
	        if (leftPixel.colorDistance(rightColor) > 
	            edgeDist || leftPixel.colorDistance(lowerColor) > 
	            edgeDist)
	          leftPixel.setColor(Color.BLACK);
	        else
	          leftPixel.setColor(Color.WHITE);
	      }
	    }
	  }
	  
	  public void edgeDetection2(int edgeDist)
	  {
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel lowerPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    Color rightColor = null;
	    Color lowerColor = null;
	    for (int row = 0; row < pixels.length-1; row++)
	    {
	      for (int col = 0; 
	           col < pixels[0].length-1; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][col+1];
	        lowerPixel = pixels[row+1][col];
	        rightColor = rightPixel.getColor();
	        lowerColor = lowerPixel.getColor();
	        if (leftPixel.colorDistance(rightColor) > 
	            edgeDist || leftPixel.colorDistance(lowerColor) > 
	            edgeDist)
	          leftPixel.setColor(Color.BLACK);
	        else
	          leftPixel.setColor(Color.WHITE);
	      }
	    }
	  }
	  
	  public void multiply(Color col) {
		  Pixel[][] pixels = this.getPixels2D();
		  for (Pixel[] row : pixels) {
			  for (Pixel pix : row) {
				  pix.setRed(pix.getRed() * col.getRed() / 255);
				  pix.setBlue(pix.getBlue() * col.getBlue() / 255);
				  pix.setGreen(pix.getGreen() * col.getGreen() / 255);
			  }
		  }
	  }
	  
	  
	  
	  
	  /* Main method for testing - each class in Java can have a main 
	   * method 
	   */
	  public static void main(String[] args) 
	  {
//	    Picture beach = new Picture("beach.jpg");
//	    beach.explore();
//	    beach.zeroBlue();
//	    beach.explore();
	  }
	  
  
} // this } is the end of class Picture, put all new methods before this
