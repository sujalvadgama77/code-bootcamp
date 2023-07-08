import java.awt.*;
import java.applet.*;
public class rform extends Applet{
public void init() 
{
setLayout(new FlowLayout(FlowLayout.LEFT));
add(new Label("Name          :"));
add(new TextField(10));

add(new Label("Address       :"));
add(new TextField(10));
        
add(new Label("Birthday      :"));
add(new TextField(10));

add(new Label("Gender        :"));
Choice gender = new Choice(); 
gender.addItem("Male"); 
gender.addItem("Female"); 

Component add = add(gender);  
CheckboxGroup job = new CheckboxGroup();

add(new Label("Job            :"));
add(new Checkbox("Student", job, false));
add(new Checkbox("Teacher", job, false));

add(new Button("Register"));
add(new Button("Exit"));
}
}
/*<applet code="rform.class" width=500 height=500></applet>*/
