package classes;

import java.awt.Color;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
    Picture beach = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  public static void testNegate()
  {
    Picture beach = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture caterpillar = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorDiagonal();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture temple = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  
  public static void testCopy()
  {
    Picture dest = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\640x480.jpg");
    dest.copy( new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\flower1.jpg"), 20, 50, 10, 60, 50, 200);
    dest.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testMyCollage()
  {
    Picture canvas = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\swan.jpg");
    swan.edgeDetection(20);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\swan.jpg");
    swan.edgeDetection2(20);
    swan.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture water = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\water.jpg");
    water.fixUnderwater();
    water.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  
  public static void testMultiply()
  {
	
    Picture water = new Picture("C:\\Users\\zhangj1616\\Desktop\\APCSA_2022\\Zhang_Joshua_apcsa-2022\\Unit-16\\src\\images\\water.jpg");
    water.explore();
    water.multiply(new Color(230,225,250));
    water.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}