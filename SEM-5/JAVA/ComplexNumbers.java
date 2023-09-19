import java.util.*;

class ComplexNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n----- Complex Numbers -----");
        System.out.println("\n1 : Addition\n2 : Subtraction\n\nEnter your choice : ");
        int choice = sc.nextInt();

        if(choice >= 1 && choice <= 3) {
                System.out.println("\nEnter the number 1 : ");
                int num1_real = sc.nextInt();
                System.out.println("\nEnter the number 1 complex part : ");
                int num1_imagi = sc.nextInt();

                System.out.println("\nEnter the number 2 : ");
                int num2_real = sc.nextInt();
                System.out.println("\nEnter the number 2 complex part : ");
                int num2_imagi = sc.nextInt();

                System.out.println("\nComplex Number 1 : " + num1_real + " , " + num1_imagi + "i");
                System.out.println("Complex Number 2 : " + num2_real + " , " + num2_imagi + "i");

                if(choice == 1) {
                    int sum_real = num1_real + num2_real;
                    int sum_imagi = num1_imagi + num2_imagi;

                    System.out.println("\nAddition : " + sum_real + " + " + sum_imagi + "i");
                } else {
                    int sub_real = num1_real - num2_real;
                    int sub_imagi = num1_imagi - num2_imagi;

                    System.out.println("\nSubtraction : " + sub_real + " - " + sub_imagi + "i");
                }
            
        } else {
            System.out.println("\n\nInvalid Input");
        }
    }

}
