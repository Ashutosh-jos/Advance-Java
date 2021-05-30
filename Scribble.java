//import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class  Scribble2 extends Frame implements MouseListener,MouseMotionListener
{
public int last_x, last_y;
Scribble2 ()
{
this.addMouseListener(this);
this.addMouseMotionListener(this);
addWindowListener (new WindowAdapter()
{
	public void windowClosing (WindowEvent e)
	{
		System.exit(0);
	}
});
}
public void mousePressed (MouseEvent e){
	last_x=e.getX();
	last_y=e.getY();
}
public void mouseDragged(MouseEvent e){
	Graphics g = this.getGraphics();
	int x=e.getX(), y=e.getY();
	g.drawLine(last_x, last_y,x,y);
	last_x=x; last_y=y;
}
public void mouseClicked(MouseEvent e) {}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
public void mouseMoved(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
public static void main(String args[])
{
	Scribble2 ch= new Scribble2();
	ch.setTitle("Scribble");
	ch.setSize(450,400);
	ch.setVisible(true);
}
}
