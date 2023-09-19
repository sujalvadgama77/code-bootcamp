import java.util.*;

class PrimeNumber
{
	static void prime_N(int num1,int num2)
    {
         int x, y, flg;
         System.out.println("All the Prime numbers within " +num1+ " and " +num2+ " are:");
 		
 		for (x = num1; x <= num2; x++) 
 		{
            if (x == 1 || x == 0)
            continue;

            flg = 1;
 
            for (y = 2; y <= x / 2; ++y) 
            {
                if (x % y == 0) {
                flg = 0;
                break;
                }
            }

            if (flg == 1)
            {
            	System.out.print(x + " ");
            } 
    	}
    
    }
 
    public static void main(String[] args)
    {

    	Scanner s = new Scanner(System.in);
        int num1;
        System.out.println("Enter Range 1:");
        num1 = s.nextInt();

        int num2;
        System.out.println("Enter Range 2:");
        num2 = s.nextInt();
 
        prime_N(num1,num2);
    }
}