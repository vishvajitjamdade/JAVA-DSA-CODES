import java.util.Scanner;

public class swap_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the first number");
        int b = sc.nextInt();
        System.out.println("Values before swapping : a = "+a+" b = " + b);
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("Values after swapping : a = "+a+" b = " + b);
         sc.close();
    }
}
