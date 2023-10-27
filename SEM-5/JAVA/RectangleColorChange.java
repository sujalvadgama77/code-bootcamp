import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="RectangleColorChange" width=500 height=500>
</applet>
*/

public class RectangleColorChange extends Applet implements ActionListener {
	private TextField redField, greenField, blueField;
    private int redValue = 0, greenValue = 0, blueValue = 0;

    public void init() {
        redField = new TextField(3);
        greenField = new TextField(3);
        blueField = new TextField(3);

        Button submitButton = new Button("Submit");
        submitButton.addActionListener(this);

        add(new Label("Red:"));
        add(redField);
        add(new Label("Green:"));
        add(greenField);
        add(new Label("Blue:"));
        add(blueField);
        add(submitButton);
    }

    public void paint(Graphics g) {
        Color color = new Color(redValue, greenValue, blueValue);
        g.setColor(color);
        g.fillRect(80, 50, 200, 100);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            redValue = Integer.parseInt(redField.getText());
            greenValue = Integer.parseInt(greenField.getText());
            blueValue = Integer.parseInt(blueField.getText());

            if((redValue <= 255 && redValue >= 0) && (greenValue <= 255 && greenValue >= 0) && (blueValue <= 255 && blueValue >= 0)) {
            	repaint();
            } else {
            	showStatus("Value must in range ( 0 - 255)");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input. Please enter integers.");
        }
    }
}
