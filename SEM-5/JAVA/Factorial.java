import java.util.Scanner;

class Factorial {

    static int rec(int n) {
        if(n == 1) {
            return n;
        } else {
            return n * rec(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("-----Factorial-----");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value : ");
        int val = sc.nextInt();

        int ans = rec(val);

        System.out.println("Factorial of " + val + " is : " + ans);

    }
}