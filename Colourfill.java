import java.awt.*;  
public class ColouredShape
{  
  public ColouredShape()  
  {  
    Frame f= new Frame("ColouredShape");  
    f.add(new MyCanvas());  
    f.setLayout(null);  
    f.setSize(400, 400);  
    f.setVisible(true);  
  }  
  public static void main(String args[])  
  {  
    new ColouredShape();  
  }  
}  
class MyCanvas extends Canvas  
{  
        public MyCanvas() {  
        setBackground (Color.GREEN);  
        setSize(300, 200);  
     }  
  public void paint(Graphics g)  
  {  
    g.setColor(Color.pink);  
    g.fillOval(75, 75, 150, 75);  
  }  
}   
