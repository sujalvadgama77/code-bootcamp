import java.util.*;
import java.awt.*;

public class calendar 
{  
   public static void main(String[] args) {  
   Calendar calendar = Calendar.getInstance();  
   System.out.println("The current date is : " + calendar.getTime());  
   calendar.add(Calendar.DATE, -15);  
   System.out.println("12 days ago: " + calendar.getTime());  
   calendar.add(Calendar.MONTH, 4);  
   System.out.println("5 months later: " + calendar.getTime());  
   calendar.add(Calendar.YEAR, 2);  
   System.out.println("5 years later: " + calendar.getTime());  
   System.out.println("Sujal Vadgama 196250307069");
   }  
}  
