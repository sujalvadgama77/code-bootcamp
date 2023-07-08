import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class fourteen extends Applet implements ActionListener
{
	TextField t1 = new TextField(30);
	Choice c1;
	String data;
	public void init()
	{
		Label l1 = new Label("Select Subject to display marks");
		add(l1);
		
		c1 = new Choice();
		
		c1.addItem("MCAD");
		c1.addItem("AJAVA");
		c1.addItem("NMA");
		
		add(c1);
		
		Button b1= new Button("Display");
		add(b1);
		b1.addActionListener(this);
		
		add(t1);
	}
	public void actionPerformed(ActionEvent e)
	{
		data = c1.getItem(c1.getSelectedIndex());
		int ajava=98, mcad=88, nma=94;
		
		if(data=="AJAVA")
		{
			t1.setText("Your "+data+ " Mark is: "+ajava);
		}
		
		if(data=="MCAD")
		{
			t1.setText("Your "+data+ " Mark is: "+mcad);
		}
		
		if(data=="NMA")
		{
			t1.setText("Your "+data+ " Mark is: "+nma);
		}
	}
		public void paint(Graphics g)
     {
     g.drawString("Sujal Vadgama 196250307069",250,60);
 
	}
}
/*<applet code="fourteen.class" height=500 width=500></applet>*/
