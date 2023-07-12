import java.util.Scanner;
class LeapYear
{
	public static void main(String []args)
	{
		int year;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Year to check weather it is a leap year or not : ");
		year = s.nextInt();

		if(year%4==0){
			if(year%100 == 0){
				if(year%400 == 0){
					System.out.println(year+" is a leap year!!!");
				}
				else{
					System.out.println(year+" is not a leap year!!!");
				}
			}
			else{
				System.out.println(year+" is a leap year!!!");
			}
		}
		else{
			System.out.println(year+" is not a leap year!!!");
		}


	}
}