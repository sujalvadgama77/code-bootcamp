import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class twelve extends JFrame implements ActionListener {  
     JMenuItem newOne,save,SaveAs,exit;
     JTextArea l;
     JLabel l1;
    public twelve()
    {
        FlowLayout f=new FlowLayout();      
        JMenuBar menubar=new JMenuBar();
        JMenu menu=new JMenu("File");
        l=new JTextArea(null,1,5);      
        JPanel p=new JPanel();
        add(p);
        l1= new JLabel();
        l.setLayout(new FlowLayout());
        p.add(l);
        newOne=new JMenuItem("new");
        save=new JMenuItem("save");
        SaveAs=new JMenuItem("SaveAs");
        exit=new JMenuItem("Exit");
        newOne.setMnemonic('n');
        save.setMnemonic('s');
        SaveAs.setMnemonic('d');
        exit.setMnemonic('x');
        newOne.setAccelerator(KeyStroke.getKeyStroke('N',Event.CTRL_MASK));
        save.setAccelerator(KeyStroke.getKeyStroke('S',Event.CTRL_MASK));
        SaveAs.setAccelerator(KeyStroke.getKeyStroke('D',Event.CTRL_MASK));
        exit.setAccelerator(KeyStroke.getKeyStroke('X',Event.CTRL_MASK));
        menubar.add(menu);
        menu.add(newOne);
        menu.add(save);
        menu.add(SaveAs);
        menu.add(exit);
        
        newOne.addActionListener(this);
        save.addActionListener(this);
        SaveAs.addActionListener(this);
        exit.addActionListener(this);     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(menubar);
        setSize(300,300);
        //setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()== newOne)
    {
       l.setText("new");
    }
      else if(e.getSource()== save)
    {
      l.setText("save");
    }
      else if(e.getSource()== SaveAs)
   {
       l.setText("saveAS");
   }
      else if(e.getSource()== exit)
   {            l.setText("exit");
        }   
    }            
public static void main(String args[])
{
    System.out.println("DENISHA TANK 196250307066");
    new twelve();
}    
}
