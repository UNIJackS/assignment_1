// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 - 2024T1, Assignment 1
 * Name:
 * Username:
 * ID:
 */

 import ecs100.*;
 import java.awt.Color;
 import java.util.*; 
 
 /**
  * Draws various flags
  *
  * You can find lots of flag details (including the correct dimensions and colours)
  * from  http://www.crwflags.com/fotw/flags/
  */
 
 public class App{
 
     public static final double LEFT = 100;  // the left side of the flags
     public static final double TOP = 50;    // the top of the flags
 
 
     /**
      * Draw the flag of the United Arab Emirates.
      * The flag has a vertical red stripe on the left, and
      * three horizontal stripes (green, white, black) on the right.
      * See the assignment for dimensions and details.
      */
     public void drawUAEFlag() {
         UI.clearGraphics();
         UI.println("UAE Flag");
         double width = UI.askDouble("How wide: ");
        

         UI.setColor(Color.black);
         UI.fillRect(LEFT-3, TOP-3, (width + 6),((1f/2f * width) + 6) );
         UI.setColor(Color.red);
         UI.fillRect(LEFT, TOP, (1f/4f *width),(1f / 2f * width)); //red rectangle on the left
         UI.setColor(Color.green);
         UI.fillRect(LEFT+(1f/4f *width), TOP, (3f/4f *width), (1f/6f * width)); //green rectangle on the left
         UI.setColor(Color.white);
         UI.fillRect(LEFT+(1f/4f *width), TOP+(1f/6f *width), (3f/4f *width), (1f/6f * width)); //white rectangle on the left
         UI.setColor(Color.black);
         UI.fillRect(LEFT+(1f/4f *width), TOP+(2f/6f *width), (3f/4f *width), (1f/6f * width)); //blue rectangle on the left

     }
 
     /**
      * Draw the flag of Greenland.
      * The top half of the flag is white, and the bottom half is red.
      * There is a circle in the middle (off-set to left) which is
      * also half white/red but on the opposite sides.
      * The flag is 2/3 as high as it is wide (ratio 2:3).
      */
     public void drawGreenlandFlag() {
         UI.clearGraphics();
         UI.println("Greenland Flag");
         double width = UI.askDouble("How wide: ");
        
         UI.setColor(Color.black);
         UI.fillRect(LEFT-3, TOP-3, width + 6,((2f/3f * width) + 6) );

         UI.setColor(Color.white);
         UI.fillRect(LEFT, TOP, width, 2f/6f*width);

         UI.setColor(Color.red);
         UI.fillRect(LEFT, TOP+2f/6f*width, width, 2f/6f*width);         

         UI.setColor(Color.white);
         UI.fillArc(LEFT + 1f/6f*width,TOP + 1f/9f*width, 4f/9f * width, 4f/9f*width,180,180);

         UI.setColor(Color.red);
         UI.fillArc(LEFT + 1f/6f*width,TOP + 1f/9f*width, 4f/9f * width, 4f/9f*width,0,180);

         
     }
     
     /**
      *  The Czech flag
      *  The flag is 2/3 as high as it is wide (ratio 2:3).
      *  Two horizontal stripes (white and red) with a blue isoceles triangle on the left side.
      *  Note: there is no fillTriangle method in the UI class! Maybe you could use arcs?
      */
     public  void drawCzechFlag(){
         UI.clearGraphics();  
         UI.println("Czech Flag");
         double width = UI.askDouble("How wide: ");

         UI.setColor(Color.black);
         UI.fillRect(LEFT-3, TOP-3, width + 6,((2f/3f * width) + 6) );
         
         UI.setColor(Color.blue);
         UI.fillRect(LEFT, TOP,1f/2f *width, 2f/3f*width); 

         UI.setColor(Color.white);
         UI.fillArc(LEFT- width,TOP - width,2*width,2*width,326.34,33.66);

         UI.setColor(Color.red);
         UI.fillArc(LEFT- width,TOP+ 2f/3f*width - width,2*width,2*width,0,33.66);

         UI.setColor(Color.white);
         UI.fillRect(LEFT+1f/2f*width, TOP, 1f/2f*width,1f/3f*width);

         UI.setColor(Color.red);
         UI.fillRect(LEFT+1f/2f*width,TOP+ 1f/3f*width, 1f/2f*width,1f/3f*width);
     }
     
     /**   CHALLENGE
      * DO NOT DO THIS IF YOU HAVE NOT DONE THE PREVIOUS METHODS
      * Draw the Misubishi Logo.
      */
     public void drawMitsubishiLogo() {
         /*# YOUR CODE HERE */
         double width = UI.askDouble("How wide: ");
         UI.setColor(Color.red);
         UI.fillArc(LEFT-(Math.cos(Math.PI/3)*width ) , TOP-width, 2*width, 2*width, 240, 60);

         UI.setColor(Color.black);
         UI.fillRect(LEFT,TOP + (Math.sin(Math.PI/3)*width),width,width-(Math.sin(Math.PI/3)*width));

         
         
 
     }
 
     /**   CHALLENGE
      * DO NOT DO THIS IF YOU HAVE NOT DONE THE PREVIOUS METHODS
      * Draw the Koru Flag.
      * It was one of the new flag designs for the 2016 referendum,
      * designed by Sven Baker from Wellington
      * The flag is 1/2 as high as it is wide (ratio 1:2).
      */
     public void drawKoruFlag() {
         /*# YOUR CODE HERE */
 
     }
 
     public void setupGUI(){
         UI.addButton("Clear", UI::clearPanes);
         UI.addButton("Flag of UAE", this::drawUAEFlag);
         UI.addButton("Flag of Greenland", this::drawGreenlandFlag);
         UI.addButton("Czech Flag", this::drawCzechFlag);        
         UI.addButton("CHALLENGE: Mitsubishi logo", this::drawMitsubishiLogo);        
         UI.addButton("CHALLENGE: Koru Flag", this::drawKoruFlag);
         UI.addButton("Quit", UI::quit);
 
         UI.setDivider(0.3);
     }
 
     public static void main(String[] arguments){
         App fd = new App();
         fd.setupGUI();
     }
 
 }
 