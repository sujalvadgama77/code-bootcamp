import java.util.Scanner;

class Gcd {

    static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);

    }

    public static void main(String[] args) {
        System.out.println("----- GCD -----");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value 1  : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Value 2  : ");
        int num2 = sc.nextInt();

        int gcd = gcd(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is : " + gcd);
    }
}