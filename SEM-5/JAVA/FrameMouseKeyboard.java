import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}

class MyKeyAdapter extends KeyAdapter {
	FrameMouseKeyboard frame;

	public MyKeyAdapter(FrameMouseKeyboard frame) {
		this.frame = frame;
	}

	public void keyTyped(KeyEvent ke) {
		frame.keymsg += ke.getKeyChar();

		frame.repaint();
	};
}

class MyMouseAdapter extends MouseAdapter {
	FrameMouseKeyboard frame;

	public MyMouseAdapter(FrameMouseKeyboard frame) {
		this.frame = frame;
	}

	public void mousePressed(MouseEvent me) {
		frame.mouseX = me.getX();
		frame.mouseY = me.getY();
		frame.mousemsg = "Mouse Down at " + frame.mouseX + ", " + frame.mouseY;

		frame.repaint();
	}
}

public class FrameMouseKeyboard extends Frame {
	String keymsg = "";
	String mousemsg = "";
	int mouseX = 30, mouseY = 30;

    public FrameMouseKeyboard() {
        addKeyListener(new MyKeyAdapter(this));
		addMouseListener(new MyMouseAdapter(this));
    	addWindowListener(new MyWindowAdapter());
    }

    public void paint(Graphics g) {
    	g.drawString(keymsg, 100, 100);
		g.drawString(mousemsg, mouseX, mouseY);
    }

    public static void main(String args[]) {
		FrameMouseKeyboard frame = new FrameMouseKeyboard();

		frame.setSize(new Dimension(300, 200));
		frame.setTitle("Frame");
		frame.setVisible(true);
	}
}
