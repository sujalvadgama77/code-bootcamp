import java.util.Scanner;

class Armstrong{
    public static void main(String[] args){
        int num,temp,rem,check=0,digit=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------Armstrong------");
        System.out.println("Enter num : ");
        num=sc.nextInt();
        temp=num;

        while(temp>0){
            temp/=10;
            digit++;
        }

        temp=num;

        while(temp>0){
            rem=temp%10;
            check+=Math.pow(rem,digit);
            temp/=10;
        }

        if(num==check){
            System.out.println(num +" is an armstrong number");
        }else{
            System.out.println(num +" is not an armstrong number");
        }
    }
}