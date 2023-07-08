import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class changelbl extends Applet implements ActionListener{
Button button1;
public void init(){

button1=new Button("Click");
add(button1);
button1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){
if(ae.getSource() == button1)
{
button1.setLabel("DENISHA");
}
else
{
button1.setLabel("Button not pressed");
}
}
  public void paint(Graphics g)
     {
     g.drawString("Sujal Vadgama 196250307069",250,60);
 
    }
}
/*<applet code="changelbl.class" width=500 height=500></applet>*/
