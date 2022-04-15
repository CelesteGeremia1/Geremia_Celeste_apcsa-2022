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
    Picture beach = new Picture("C:/Users/geremiac1730/Documents/GitHub/Geremia_Celeste_apcsa-2022/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:/Users/geremiac1730/Documents/GitHub/Geremia_Celeste_apcsa-2022/Unit16/src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:/Users/geremiac1730/Documents/GitHub/Geremia_Celeste_apcsa-2022/Unit16/src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:/Users/geremiac1730/Documents/GitHub/Geremia_Celeste_apcsa-2022/Unit16/src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:/Users/geremiac1730/Documents/GitHub/Geremia_Celeste_apcsa-2022/Unit16/src/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Method to test KeepBlue */
  public static void testKeepOnlyBlue()
  {
    Picture mark = new Picture("C:/Users/geremiac1730/Documents/GitHub/Geremia_Celeste_apcsa-2022/Unit16/src/images/blue-mark.jpg");
    mark.keepBlue();
    mark.explore();
  }
  
  /** Method to test keepRed */
  public static void testKeepOnlyRed()
  {
    Picture jenny = new Picture("C:/Users/geremiac1730/Documents/GitHub/Geremia_Celeste_apcsa-2022/Unit16/src/images/jenny-red.jpg");
    jenny.keepRed();
    jenny.explore();
  }
   
  public static void testKeepOnlyGreen()
  {
    Picture koala = new Picture("C:/Users/geremiac1730/Documents/GitHub/Geremia_Celeste_apcsa-2022/Unit16/src/images/koala.jpg");
    koala.keepGreen();
    koala.explore();
  }
   
  public static void testNegate()
  {
    Picture wall = new Picture("C:/Users/geremiac1730/Documents/GitHub/Geremia_Celeste_apcsa-2022/Unit16/src/images/wall.jpg");
    wall.negate();
    wall.explore();
  }
   
  public static void testGrayscale()
  {
    Picture arch = new Picture("C:/Users/geremiac1730/Documents/GitHub/Geremia_Celeste_apcsa-2022/Unit16/src/images/arch.jpg");
    arch.grayscale();
    arch.explore();
  }
   
  public static void testFixUnderwater()
  {
    Picture water = new Picture("C:/Users/geremiac1730/Documents/GitHub/Geremia_Celeste_apcsa-2022/Unit16/src/images/water.jpg");
    water.fixUnderwater();
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
    testMirrorVertical();
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