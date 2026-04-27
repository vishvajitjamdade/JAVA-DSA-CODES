import java.util.Scanner;

class recursion_demo{
    public static void recursionInc(int n ){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        recursionInc(n-1);
    }

    public static void recursionDec(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        
        recursionDec(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        recursionInc(n);
        recursionDec(n);
        sc.close();
    }



}