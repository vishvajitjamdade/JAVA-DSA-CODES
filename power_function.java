import java.util.Scanner;

public class power_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its power");
        int x = sc.nextInt();
        System.out.println("Enter the power of " + x );
        int n = sc.nextInt();
        int ans = power(x,n);
        System.out.println("Power of "+x + "^" + n + " = " + ans);
        sc.close(); 
    }

    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }

        // int xnm1 = power(x, n-1);
        // int xn = xnm1 * x;
        // return xn;
        return x * power(x, n-1);
    }
}
