import java.awt.* ;
import java.awt.event.* ;
public class House  extends Frame   
{
  public House()   
  {
    setBackground(Color.white);
    setTitle("House");
    setSize(800,600);
    setVisible(true);

    addWindowListener(new WindowAdapter() 
    { 
            // for frame closing 
	public void windowClosing( WindowEvent e )  {
 	  System.exit(0);
     } } ) ;
  }
  public void paint( Graphics g )  
  {

   //home

g.drawRect (600,150,150,300);
g.drawRect (430,130,160,20);
g.drawRect (600,130,150,20);
g.drawRect (600,150,150,300);
g.drawRect (400,150,200,300);
g.drawRect (400,150,10,300);
g.drawRect (400,300,350,10);
g.drawRect (590,130,10,320);
g.drawRect (430,130,10,20);


// bottom door
g.drawArc (460,336,81,25,0,180);
g.drawRect (460,348,40,91);
g.drawRect (500,348,41,91);
g.drawRect (463,353,36,85);
g.drawRect (503,353,35,85);

// Roof
g.setColor (Color.red);
int c [] = {380,500,620};
int d [] = {130,60,130};
g.fillPolygon (c, d, 3);
g.setColor (Color.black);
int x [] = {380,500,620};
int y [] = {130,60,130};
g.drawPolygon (x, y, 3);
g.setColor (Color.blue);
int m [] = {515,750,750,620};
int n [] = {70,70,130,130};
g.fillPolygon (m, n, 4);
g.setColor (Color.red);
int q [] = {515,750,750,620};
int z [] = {70,70,130,130};



//page
g.setColor (Color.green);
g.fillRect (0,450,900,100);
  }
  public static void main(String args[])  {
  // call the constructor
    new House();   				
  }
}
