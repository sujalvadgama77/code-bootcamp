import java.awt.*;
import java.applet.*;

/*
<applet code="AppletBanner" width="500" height="500">
<param name=fontSize value=20>
</applet>
*/

public class AppletBanner extends Applet implements Runnable {
	Thread t1 = null;
	boolean flag = true;
	String str = "";
	String msg = "Jai Shree Krishna !!!";
	Font f;

	public void init() {
		setBackground(Color.black);
		setForeground(Color.yellow);
		f = new Font("Times New Roman", Font.PLAIN, 50);
	}

	public void start() {
		t1 = new Thread(this);
		flag = true;
		t1.start();
	}

	public void run() {
		try {
			char ch;
			while(flag) {
				repaint();
				Thread.sleep(300);
				ch = msg.charAt(0);
				msg = msg.substring(1, msg.length());
				msg += ch;
				str = msg;
			}
		} catch(InterruptedException e) {
			System.out.println("Exception : " + e);
		}
	}

	public void stop() {
		flag = false;
		t1 = null;
	}

	public void paint(Graphics g) {
		g.setFont(f);
		g.drawString(str, 300, 400);
	}
}
