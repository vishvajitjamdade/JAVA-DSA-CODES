import java.util.Scanner;

public class tillingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the floor");
        int n = sc.nextInt();
        int result = tilling(n);
        System.out.println("Number of ways to place the tiles are : " + result);
        sc.close();
    }

    public static int tilling(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        int fnm1 = tilling(n-1);
        int fnm2 = tilling(n-2);

        int total = fnm1 + fnm2;

        return total;
    }
}
