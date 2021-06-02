import java.awt.*;
import javax.swing.*;
public class flow{
	JFrame f;
flow() {
f=new 	JFrame();

JButton b1= new JButton("only");
JButton b2= new JButton("allen solley");
JButton b3= new JButton("vero moda");
JButton b4= new JButton("tokyo talkies");
JButton b5= new JButton("forever 21");
JButton b6= new JButton("AND");
JButton b7= new JButton("GAP");
JButton b8= new JButton("sassafras");
JButton b10= new JButton("H&M");
JButton b11= new JButton("kook N Keech");
JButton b12= new JButton("Roadster");
JButton b13= new JButton("Mast&Harbour");
JButton b14= new JButton("Here&Now");
JButton b15= new JButton("ether");
JButton b16= new JButton("chemistry");
JButton b17= new JButton("mango");
JButton b18= new JButton("levis");
JButton b19= new JButton("Marie claire");
JButton b20= new JButton("Zink London");
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);

f.add(b10);
f.add(b11);
f.add(b12);
f.add(b13);
f.add(b14);
f.add(b15);
f.add(b16);
f.add(b17);
f.add(b18);
f.add(b19);
f.add(b20);

f.setLayout(new FlowLayout(FlowLayout.CENTER));
f.setSize(600,600);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[]) {
	new flow();
}
}
