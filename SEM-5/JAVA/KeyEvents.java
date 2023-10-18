import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="KeyEvents" width=500 height=500></applet>*/

public class KeyEvents extends Applet implements KeyListener
{
	char ch;
	String msg = "";
	int x = 10;
	int y = 20;

	public void init()
	{
		addKeyListener(this);
		requestFocus();
	}

	public void keyPressed(KeyEvent ke)
	{
		showStatus("Key Pressed");
	}

	public void keyReleased(KeyEvent ke)
	{
		showStatus("Key Released");
	}

	public void keyTyped(KeyEvent ke)
	{
		
		ch = ke.getKeyChar();
		if(ch == ke.VK_ENTER)
		{
			y = y+5;
			msg += ke.getKeyChar();
		}
		else
		{
			msg += ke.getKeyChar();
		}
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}