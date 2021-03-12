import java.awt.*;

import java.awt.event.*; public class Laughter extends Frame { Laughter() { //for closing this.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){ System.exit(0); } }); }

public void paint(Graphics g)
{
	g.setColor(Color.green);
	g.fillRect(40,40,200,200);
	
	g.setColor(Color.yellow);
	g.fillOval(90,70,80,80);
	
	g.setColor(Color.blue);
	g.fillOval(110,95,5,5);
	g.fillOval(145,95,5,5);
	
	g.drawLine(130,95,130,115);
	
	g.setColor(Color.blue);
	g.drawArc(113,115,35,20,0,-180);
}

public static void main(String[] args)
{
	Laughter e=new Laughter();
	e.setTitle("Laughter");
	e.setSize(600,600);
	e.setVisible(true);
	}
}
