import java.util.Scanner;
class Calc
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		int a,b,sum,choice;
		System.out.println("------Calculator------");
		System.out.println("Enter 1st Number : ");
		a = s.nextInt();
		System.out.println("Enter 2nd Number : ");
		b = s.nextInt();
		System.out.println("Enter Operation.....\n 1 : Addition \n 2 : Subtraction \n 3 : Multipilcation \n 4 : Division \n 5 : Modulo \n");
		choice = s.nextInt();
		switch(choice)
		{
		case 1 : sum = a + b;
			System.out.println("Addition of "+a+" and "+b+" is : "+sum);
			break;
		case 2 : sum = a - b;
			System.out.println("Subtraction of "+b+" from "+a+" is : "+sum);
			break;
		case 3 : sum = a * b;
			System.out.println("Multiplication of "+a+" with "+b+" is : "+sum);
			break;
		case 4 : sum = a / b;
			System.out.println("Division of "+b+" from "+a+" is : "+sum);
			break;
		case 5 : sum = a % b;
			System.out.println("Modulo of "+a+" and "+b+" is : "+sum);
		}
	}
}