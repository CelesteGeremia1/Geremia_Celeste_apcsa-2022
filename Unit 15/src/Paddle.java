//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;
   private int height;
   private int width;
   private int xPostion;
   private int yPostion;
   

   public Paddle()
   {
		super(10,10);
	   speed =5;
   }
   

   //add the other Paddle constructors
   public Paddle(int one, int two)
   {
		super(10,10);
      speed =5;
   }
   public Paddle(int one, int two, int three)
   {
		super(10,10);
      speed =5;
   }
   public Paddle(int one, int two, int three, int four, Color c, int five)
   {
		super(10,10);
      speed =5;
   }
   public Paddle(int one, int two, int three, int four, int five)
   {
		super(10,10);
      speed =5;
   }









   public void moveUpAndDraw(Graphics window)
   {


   }

   public void moveDownAndDraw(Graphics window)
   {


   }

   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   public int getHeight() {
	   return height;
   }
   
   public int getWidth() {
	   return width;
   }
   
   public int getxPostion() {
	   return xPostion;
   }
   
   public int getyPostion() {
	   return yPostion;
   }

   
   //add a toString() method
}