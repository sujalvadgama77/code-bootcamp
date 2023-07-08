import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class colorb extends Frame
{
public static void main(String[] args)
{
System.out.println("Sujal Vadgama 196250307069");
JFrame frame=new JFrame();
JButton button=new JButton("CLICK");
Container c=frame.getContentPane();
c.setBackground(Color.white);
frame.setVisible(true);
FlowLayout ff=new FlowLayout();
c.setLayout(ff);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(button);
button.addActionListener(new ActionListener()

{

public void actionPerformed(ActionEvent e)
{
changeColor(c);
}
});
}
public static void changeColor(Container c)
{
Color cc=c.getBackground();

if(cc.equals(Color.white)){
c.setBackground(Color.blue);
}
if(cc.equals(Color.red)){
c.setBackground(Color.green);
}
if(cc.equals(Color.green)){
c.setBackground(Color.black);
}
if(cc.equals(Color.blue)){
c.setBackground(Color.red);
}

}
}