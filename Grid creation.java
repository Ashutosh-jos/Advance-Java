import java.awt.*;
import javax.swing.*;
public class grid{
	JFrame f;
grid() {
f=new 	JFrame();

JButton b1= new JButton("only");
JButton b2= new JButton("allen solley");
JButton b3= new JButton("vero moda");
JButton b4= new JButton("tokyo talkies");
JButton b5= new JButton("forever 21");
JButton b6= new JButton("AND");
JButton b7= new JButton("GAP");
JButton b8= new JButton("sassafras");
JButton b9= new JButton("H&M");

f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);
f.add(b9);
f.setLayout(new GridLayout(3,3));
f.setSize(500,500);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[]) {
	new grid();
}
}
