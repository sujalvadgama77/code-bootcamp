import java.util.Scanner;

class SumofDigits{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num,temp;
        int sum=0;
        
        System.out.print("Enter the Number : ");
        num = s.nextInt();

        temp = num;

        while(temp>0)
        {
            sum+=temp%10;
            temp/=10;
        }
        System.out.println("Sum of digits is : " +sum);
    }
}