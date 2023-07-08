import java.awt.*;    
import java.awt.event.*;    
public class ten 
{    
     ten() {    
        Frame f = new Frame ("CheckBox Example");    
        Label label = new Label();            
        label.setAlignment(Label.CENTER);    
        label.setSize(400,100);    
        Checkbox c1 = new Checkbox("Sujal Vadgama");    
        c1.setBounds(100, 100,  80, 60);    
        Checkbox c2 = new Checkbox("196250307069");    
        c2.setBounds(100, 150,  100, 50);    
        f.add(c1);  
        f.add(c2);   
        f.add(label);    
  
        c1.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                label.setText("DENISHA Checkbox: "     
                + (e.getStateChange()==1?"checked":"unchecked"));    
             }    
          });    
        c2.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                label.setText("196250307066 Checkbox: "     
                + (e.getStateChange()==1?"checked":"unchecked"));    
             }    
          });    
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    
     }    
public static void main(String args[])    
{    
    new ten();    
}    
}   
