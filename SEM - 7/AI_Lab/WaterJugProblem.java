// import required classes and packages if any  
import java.io.*;  
import java.util.Scanner;  
// create class WaterJugProblemExample to solve water jug problem in Java  
class WaterJugProblem {  
  
    //create function getGCD() that returns GCD of 'x' and 'y'.  
    public static int getGCD(int x, int y) {  
        if (y == 0) {  
            return x;  
        }  
          
        return getGCD(y, x % y);  
    }  
  
    /* create method pourWater() that accept three parameters, i.e., fromCapacity, toCapacity and d*/  
    /*fromCapacity is the capacity of the jug from which water is poured, toCapacity is the capacity of the jug to which water is poured, and ltr is the amount of water to be measured */  
    public static int pourWater(int fromCapacity, int toCapacity, int d) {  
      
        // declare and initialize variables which indicate the current amount of water in source and destination jugs  
        int fromCap = fromCapacity;  
        int toCap = 0;  
  
        // declare and initialize variable 'reqStep' that will help us to fill from jug  
        int reqStep = 1;  
  
        // use while loop to fill d ltr amount and break it when one of the two jugs has d liter amount  
        while (fromCap != d && toCap != d) {  
          
            // find maximum amount of water which we can pour  
            int maxPaur = Math.min(fromCap, toCapacity - toCap);  
  
            // we pour "maxPaur" liters water from "fromCap" to "toCap"  
            toCap = toCap + maxPaur;  
            fromCap = fromCap - maxPaur;  

            reqStep++;  
              
            if (fromCap == d || toCap == d)  
                break; 
            if (fromCap == 0) {  
                fromCap = fromCapacity;  
                reqStep++;  
            }  
            if (toCap == toCapacity) {  
                toCap = 0;  
                reqStep++;  
            }  
        }  
        return reqStep;  
    }  

    public static int findMinSteps(int i, int j, int d) {  
      
        if (i > j) {   
            int temp = i;  
            i = j;  
            j = i;  
        }  
       
        if (d > j) {  
            return -1;  
        } 
        if ((d % getGCD(j, i)) != 0)  
            return -1;    

        return Math.min(pourWater(j, i, d), 
                pourWater(i, j, d)); 
    }  
  
    public static void main(String[] args) {  
        
        int i, j, d;  
            
        Scanner sc = new Scanner(System.in);  
          
        System.out.println("Enter the size of Jug1 in liters");  
        i = sc.nextInt();  
          
        System.out.println("Enter the size of Jug2 in liters");  
        j = sc.nextInt();  
          
        System.out.println("Enter the amount of water which you want to messure:");  
        d = sc.nextInt();  
          
        sc.close();  
          
        System.out.println("Minimum number of steps required to messure water is " + findMinSteps(i, j, d));  
    }  
}  