import java.util.*;


class Equation{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a,b,c;

		System.out.print("Enter value for a : ");
		a=s.nextInt();

		System.out.print("Enter value for b : ");
		b=s.nextInt();

		System.out.print("Enter value for c : ");
		c=s.nextInt();

		double d = ((b*b) - (4*a*c));

		if(d<0){
			System.out.println("Roots of this equation is imaginary");
		}else{
			double root1 = (-b+Math.sqrt(d))/(2*a);
			double root2 = (-b-Math.sqrt(d))/(2*a);

			System.out.println("Roots of equation "+a+"X + "+b+"X^1 + "+c+"X^2 is : \n"+"Root 1 : "+root1+"\nRoot 2 : "+root2);
		}
	}
}