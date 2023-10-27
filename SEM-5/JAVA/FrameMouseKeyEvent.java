import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}

class MyKeyAdapter extends KeyAdapter {
	FrameMouseKeyEvent frame;

	public MyKeyAdapter(FrameMouseKeyEvent frame) {
		this.frame = frame;
	}

	public void keyTyped(KeyEvent ke) {
		frame.keymsg += ke.getKeyChar();

		frame.repaint();
	};
}

class MyMouseAdapter extends MouseAdapter {
	FrameMouseKeyEvent frame;

	public MyMouseAdapter(FrameMouseKeyEvent frame) {
		this.frame = frame;
	}

	public void mousePressed(MouseEvent me) {
		frame.mouseX = me.getX();
		frame.mouseY = me.getY();
		frame.mousemsg = "Mouse Down at " + frame.mouseX + ", " + frame.mouseY;

		frame.repaint();
	}
}

public class FrameMouseKeyEvent extends Frame {
	String keymsg = "";
	String mousemsg = "";
	int mouseX = 30, mouseY = 30;

    public FrameMouseKeyEvent() {
        addKeyListener(new MyKeyAdapter(this));
		addMouseListener(new MyMouseAdapter(this));
    	addWindowListener(new MyWindowAdapter());
    }

    public void paint(Graphics g) {
    	g.drawString(keymsg, 100, 100);
		g.drawString(mousemsg, mouseX, mouseY);
    }

    public static void main(String args[]) {
		FrameMouseKeyEvent frame = new FrameMouseKeyEvent();

		frame.setSize(new Dimension(300, 200));
		frame.setTitle("Frame");
		frame.setVisible(true);
	}
}
