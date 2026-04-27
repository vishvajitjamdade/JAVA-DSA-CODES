import java.util.Scanner;

public class v_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<i;j++){
                System.out.print(" ");
            }

            System.out.print("*");

            int spaces = 2*(n-i)-1;
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }

            if(i != n){
                System.out.print("*");
            }

            System.out.println();

        }

        sc.close();
    }
}
