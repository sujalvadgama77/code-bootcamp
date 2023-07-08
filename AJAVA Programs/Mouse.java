import java.awt.*;    
import java.awt.event.*;    
  
public class mouse extends MouseAdapter {    
    
    Frame f;    
    mouse() {    

        f = new Frame ("Mouse Adapter");    
        f.addMouseListener(this);    
        f.setSize (400, 400);    
        f.setLayout (null);    
        f.setVisible (true);    
    }    
   public void mousePressed(MouseEvent e) { 

    Graphics g = f.getGraphics();  
    	g.setColor(Color.RED);  
		g.drawString("Mouse is being pressed by Sujal",190, 90); 
    }  
  
     public void mouseReleased(MouseEvent e) 
    {    
        Graphics g = f.getGraphics();    
		g.drawString("Mouse is being released by 7069",200, 200); 
    }    
public static void main(String[] args) {    
    new mouse();    
}    
}
