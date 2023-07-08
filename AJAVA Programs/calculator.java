    import java.awt.*;  
public class calculator 
{ 
  Frame f;  
  Label l1; 
  Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0; 
  Button badd,bsub,bmult,bdiv,bmod,bcalc,bclr,bpts,bneg,bback ; 
  calculator(){   
  Frame f= new Frame("CALCULATOR"); 
 
l1=new Label();  
l1.setBackground(Color.LIGHT_GRAY); 
l1.setBounds(50,50,260,60); 
 
 
b1=new Button("1"); 
  b1.setBounds(50,340,50,50); 
b2=new Button("2"); 
  b2.setBounds(120,340,50,50); 
b3=new Button("3"); 
  b3.setBounds(190,340,50,50); 
b4=new Button("4"); 
  b4.setBounds(50,270,50,50); 
b5=new Button("5"); 
  b5.setBounds(120,270,50,50);  
b6=new Button("6"); 
  b6.setBounds(190,270,50,50); 
b7=new Button("7"); 
  b7.setBounds(50,200,50,50); 
b8=new Button("8"); 
  b8.setBounds(120,200,50,50); 
b9=new Button("9"); 
  b9.setBounds(190,200,50,50); 
b0=new Button("0"); 
  b0.setBounds(120,410,50,50); 
bneg=new Button("+/-"); 
  bneg.setBounds(50,410,50,50); 
bpts=new Button("."); 
  bpts.setBounds(190,410,50,50); 
bback=new Button("back"); 
 bback.setBounds(120,130,50,50); 
 
badd=new Button("+"); 
  badd.setBounds(260,340,50,50); 
bsub=new Button("-"); 
  bsub.setBounds(260,270,50,50); 
bmult=new Button("*"); 
  bmult.setBounds(260,200,50,50); 
bdiv=new Button("/"); 
  bdiv.setBounds(260,130,50,50); 
bmod=new Button("%"); 
  bmod.setBounds(190,130,50,50); 
bcalc=new Button("="); 
  bcalc.setBounds(245,410,65,50); 
bclr=new Button("CE");  
  bclr.setBounds(50,130,65,50); 
   
f.add(l1);   
f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5);f.add(b6); f.add(b7); f.add(b8);f.add(b9);f.add(b0); 
 
f.add(badd); f.add(bsub); f.add(bmod); f.add(bmult); f.add(bdiv); f.add(bmod);f.add(bcalc); 
 
f.add(bclr); f.add(bpts);f.add(bneg); f.add(bback); 
 
f.setSize(360,500);   
f.setLayout(new BorderLayout());   
f.setVisible(true);   
}  
 
 
  public static void main(String args[])
  {   
       new calculator();   
   } 
}