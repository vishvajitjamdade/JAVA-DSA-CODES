import java.util.Scanner;

public class optimizedPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its power ");
        int x = sc.nextInt();
        System.out.println("Enter power of number : ");
        int n = sc.nextInt();
        int ans = Opower(x,n);
        System.out.println("Power of " + x + "^" + n + " is " + ans);
        sc.close();
    }

    public static int Opower(int x , int n){
        if(n == 0){
            return 1;
        }
        int halfpower = Opower(x, n/2);
        int fullpower = halfpower * halfpower;

        if(n % 2 != 0){
            fullpower = x * fullpower;
        }

        return fullpower;
    }
}
