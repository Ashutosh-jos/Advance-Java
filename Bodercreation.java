import java.awt.*;
import javax.swing.*;
public class border{
	JFrame f;
border() {
f=new 	JFrame();

JButton b1= new JButton("INSTAGRAM");
JButton b2= new JButton("FACEBOOK");
JButton b3= new JButton("TWITTER");
JButton b4= new JButton("LINKDIN");
JButton b5= new JButton("SNAPCHAT");
f.add(b1,BorderLayout.NORTH);
f.add(b2,BorderLayout.SOUTH);
f.add(b3,BorderLayout.EAST);
f.add(b4,BorderLayout.WEST);
f.add(b5,BorderLayout.CENTER);
f.setSize(500,500);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[]) {
	new border();
}
}
