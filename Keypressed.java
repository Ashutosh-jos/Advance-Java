import java.awt.*;  
 import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class keyPressed
 { 
  public static void main(String[] args)
   {
    
    Frame frame = new Frame();
    frame.setSize(600, 400);
    frame.addKeyListener(new KeyAdapter()
     {
        
   
      public void keyTyped(KeyEvent e)
       {
        System.out.println("keyTyped: '" + e.getKeyChar() + "'");
      }
    });
    frame.setVisible(true);
  }
}
