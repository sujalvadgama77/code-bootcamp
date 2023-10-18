import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="MouseEvents" width = 500 height = 500></applet>*/

public class MouseEvents extends Applet implements MouseListener, MouseMotionListener
{

	String msg = "";
	int mouseX = 0 , mouseY = 0;

	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvent me)
	{
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse clicked.";
		repaint();
	}

	public void mousePressed(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Down";
		repaint();
	}

	public void mouseReleased(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Up";
		repaint();
	}

	public void mouseEntered(MouseEvent me)
	{
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse entered.";
		repaint();
	}

	public void mouseExited(MouseEvent me)
	{
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Exited.";
		repaint();
	}

	public void mouseDragged(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "*";
		showStatus("Dragging Mouse at " + mouseX + "," + mouseY);
		repaint();
	}

	public void mouseMoved(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		showStatus("Moving at " + mouseX + "," + mouseY);
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,mouseX,mouseY);
	}
}