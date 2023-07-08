import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
public class thirteen extends JApplet implements ItemListener 
{
  JLabel l1=new JLabel();
  public void init()
  {  
    Container c= getContentPane();
    FlowLayout f1= new FlowLayout();
    c.setLayout(f1);
    JRadioButton r1= new JRadioButton("DOG");
    r1.addItemListener(this);
    JRadioButton r2= new JRadioButton("CAT");
    r2.addItemListener(this);
    c.add(r1);
    c.add(r2);
    ButtonGroup bg=new ButtonGroup();
    bg.add(r1);
    bg.add(r2);
    c.add(l1);
  }
  public void itemStateChanged(ItemEvent IE)
  {
    JRadioButton Rb=(JRadioButton)IE.getItem();
    if (Rb.isSelected()) 
    {
    	l1.setText("It is a "+ Rb.getText());	
    }
  } 
}
/*
 <applet code="thirteen.class" width="500" height="500">
 </applet>
 */
