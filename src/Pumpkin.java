import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Pumpkin extends Canvas
{
   public Pumpkin()    //constructor method - sets up the class
   {
      setSize(800,600);
      Color twilight = new Color(23, 29, 32);
      setBackground(twilight);       
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.RED);

      window.drawString("***SANJANA***'s Carved Pumpkin! ", 35, 35 );

      theGround(window);
      pumpkin(window);
      carveThatPumpkin(window);
      
      
   }
   public void theGround(Graphics window)
   {
	   Color dirt = new Color(155,118,83);
	   window.setColor(dirt);
       window.fillRect(0,400,800,200);
   }

   public void pumpkin( Graphics window )
   {
	  Color stemGreen = new Color(25,89,5);
	  window.setColor(stemGreen);
	  int[] x1 = {345,390,465,510};
      int[] y1 = {140,70,70,140};
      window.fillPolygon(x1, y1, 4);
	  Color pumpkinOrange = new Color(255,117,24);
	  window.setColor(pumpkinOrange);
	  window.fillOval(460, 140, 250, 360);
	  window.setColor(Color.BLACK);
	  window.drawOval(460, 140, 250, 360);
	  window.setColor(pumpkinOrange);
	  window.fillOval(140, 140, 250, 360);
	  window.setColor(Color.BLACK);
	  window.drawOval(140, 140, 250, 360);
	  window.setColor(pumpkinOrange);
	  window.fillOval(220, 130, 250, 380);
	  window.setColor(Color.BLACK);
	  window.drawOval(220, 130, 250, 380);
	  window.setColor(pumpkinOrange);
	  window.fillOval(380, 130, 250, 380);
	  window.setColor(Color.BLACK);
	  window.drawOval(380, 130, 250, 380);
	  window.setColor(pumpkinOrange);
	  window.fillOval(300, 120, 250, 400);
	  window.setColor(Color.BLACK);
	  window.drawOval(300, 120, 250, 400);       
   }
   public void carveThatPumpkin( Graphics window )
   {
	 //add code here to carve your pumpkin
	   window.setColor(Color.BLACK);
	   window.fillOval(450,200,75,85);
	   
	   window.setColor(Color.BLACK);
	   window.fillOval(350,200,75,85);
	   
	   window.setColor(Color.WHITE);
	   window.fillOval(468,200,35,45);
	   
	   window.setColor(Color.WHITE);
	   window.fillOval(370,200,35,45);
	   
	   window.setColor(Color.BLACK);
	   window.fillRect(429,272,15,40);
	   
	   window.setColor(Color.BLACK);
	   window.fillOval(240,350,400,100);
	   
	   window.setColor(Color.WHITE);
	   window.fillRect(422,350,40,57);
	   
	   window.setColor(Color.WHITE);
	   window.fillRect(489,352,40,57);
	   
	   window.setColor(Color.WHITE);
	   window.fillRect(355,350,40,57);
	   
	   window.setColor(Color.WHITE);
	   window.fillRect(300,360,35,50);
	   
	   window.setColor(Color.WHITE);
	   window.fillRect(550,361,35,46);
	   
//	   window.setColor(Color.GREEN);
//	   window.fillOval(240,350,95,85);
//	   
//	   window.setColor(Color.BLACK);
//	   window.fillOval(240,350,400,100);
	   
//	   window.setColor(Color.GREEN);
//	   window.fillRect(267,260,67,67);
	   
	   
	   
	   
	            
   }
  

   
}