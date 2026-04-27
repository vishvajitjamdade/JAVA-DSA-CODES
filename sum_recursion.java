import java.util.Scanner;

public class sum_recursion {

    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        int fn = n + sum(n-1);
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Sum of first " + n + " number is "+sum(n));
    }
}
