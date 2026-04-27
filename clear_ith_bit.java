import java.util.Scanner;

public class clear_ith_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the ith bit to set");
        int i = sc.nextInt();
        int bitmask = ~(1<<i);
        System.out.println(n & bitmask);
        sc.close();
    }
}
