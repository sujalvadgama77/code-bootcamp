import java.util.Scanner;
class Conversion
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		double ferehnite,calcious;

		System.out.println("Enter Temprature in Ferehnite");
		ferehnite = s.nextDouble();
		calcious = (ferehnite-32)*5/9;
		System.out.println(""+ferehnite+" in Calcious is "+calcious+"");
	}
}