import java.util.*;

class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int num,temp,rem;
		int sum=0;

		System.out.println("Enter a Number to check weather it is palindrome or not");
		num = s.nextInt();
		temp = num;

		while(num > 0)
		{
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;

		}

		if(temp == sum)
		{
			System.out.println("Entered number is a Palindrome Number.");
		}
		else
		{
			System.out.println("Entered number is not a Palindrome Number.");
		}
	}
}