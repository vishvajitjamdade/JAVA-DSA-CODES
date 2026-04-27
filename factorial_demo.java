import java.util.Scanner;

public class factorial_demo {

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fn = n*fact(n-1);
        
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        int res = fact(n);
        System.out.println("Factorial of "+n+" is "+res);
    }
}
