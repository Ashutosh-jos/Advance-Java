import java.awt.*;
import java.awt.event.*;
class Grocerylist extends Frame implements ItemListener {
	//declaring list
	List l1 ;
	//start of constructor
	MyList(){	
	l1=new List(5,true);//initializing list with multiple enabled	
	setLayout(new FlowLayout());//setting layout
	//adding items in list
	l1.add("Select Items");
	l1.add("Milk");
	l1.add("Soap");
	l1.add("Chocolate");
	l1.add("Vegetable ");
	l1.add("Loli pop");
	l1.add("Maggi");
	l1.add("Apple");
	l1.add("Cooking Oil");
	
	add(l1);//adding list in frame
	l1.addItemListener(this);//adding itemlistener
	//closing the window
	addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent e){
    System.exit(0);
    }
	});
	}
	//method when user clicks on items
	public void itemStateChanged(ItemEvent ie){
    repaint();
	}
	//graphics methods to show selected items
	public void paint(Graphics g){
	g.drawString("Your Cart:",100,150);
	String[] items=l1.getSelectedItems();//getting selected items
	int count=items.length;//getting count of items
	int y=150;
	for (int i=0;i < items.length ; i++ ) {
		g.drawString(items[i],160,y);		
		y=y+30;
	    }
	    g.drawString("Total Items Selected:"+count,160,480);
    }

	public static void main(String[] args){
    MyList m1=new MyList();
    m1.setTitle("Grocery List");
    m1.setSize(450,500);
    m1.setVisible(true);
	}
}
