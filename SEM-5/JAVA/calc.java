import java.util.Scanner;

class calc
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		int a,b,ans,choice;

		System.out.println("Select Operation");
		System.out.println("1 : Addition");
		System.out.println("2 : Subtraction");
		System.out.println("3 : Multiplication");
		System.out.println("4 : Division");
		System.out.println("5 : Modulo");

		choice = s.nextInt();

		if(choice > 0 && choice < 6 )
		{
			System.out.println("Enter 1st Number : ");
			a = s.nextInt();
			System.out.println("Enter 2nd Number : ");
			b = s.nextInt();

			switch(choice)
			{
			case 1 : ans = a + b;
					System.out.println("Addition of "+a+" "+b+" is "+ans+"");
					break;

			case 2 : ans = a - b;
					System.out.println("Subtraction of "+a+" "+b+" is "+ans+"");
					break;

			case 3 : ans = a * b;
					System.out.println("Multiplication of "+a+" "+b+" is "+ans+"");
					break;
			case 4 : ans = a / b;
					System.out.println("Division of "+a+" "+b+" is "+ans+"");
					break;

			case 5 : ans = a % b;
					System.out.println("Modulo of "+a+" "+b+" is "+ans+"");
					break;

			}
		
		}		
		else
		{
			System.out.println("Invalid Selection");
		}	

	}
}