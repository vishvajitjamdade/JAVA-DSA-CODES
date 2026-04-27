import java.util.Scanner;

public class recursion_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String str[] ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        numberToString(str,n);
        sc.close();
    }

    public static void numberToString(String str[],int n){
        if(n == 0){
            return;
        }

        numberToString(str, n/10);
        int digits = n%10;
        System.out.print(str[digits] + " ");
    }
}
