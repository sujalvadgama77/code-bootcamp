import java.util.Scanner;
class Marks
{
	public static void main(String[]args)
	{
		int eng,guj,math,sci,ss,total,avg;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter marks of English");
		eng = s.nextInt();

		System.out.println("Enter marks of Gujarati");
		guj = s.nextInt();

		System.out.println("Enter marks of Maths");
		math = s.nextInt();

		System.out.println("Enter marks of Science");
		sci = s.nextInt();

		System.out.println("Enter marks of Social Science");
		ss = s.nextInt();

		total = eng+guj+math+sci+ss;
		System.out.println("Total Marks Obtained by Student : "+total+"");

		avg = total/5;
		System.out.println("Percentage Obtained by Student : "+avg+"%");

		if(avg<=100 && avg>=90)
		{
			System.out.println("Grade : AA");
		}
		else if (avg<=90 && avg>=80) 
		{
			System.out.println("Grade : AB");	
		}
		else if (avg<=80 && avg>=70) 
		{
			System.out.println("Grade : BB");
		}
		else if (avg<=70 && avg>=60) 
		{
			System.out.println("Grade ; BC");
		}
		else if (avg<=60 && avg>=50) 
		{
			System.out.println("Grade : CC");
		}
		else if (avg<=50 && avg>=40) 
		{
			System.out.println("Grade : CD");
		}
		else if (avg<=40 && avg>=35) 
		{
			System.out.println("Grade : DD");
		}
		else if (avg<=34) 
		{
			System.out.println("Grade : FF");
		}
}
}