import java.util.Scanner;

public class swapNumbersWithThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        System.out.println("Before swapping A is " + a + " and B is " + b);
        int temp = a;
        a = b;
        b = temp;

        // a = a+b;
        // b = a-b;
        // a = a-b;

        System.out.println("After swapping A is " + a + " and B is " + b);

        sc.close();
    }
}