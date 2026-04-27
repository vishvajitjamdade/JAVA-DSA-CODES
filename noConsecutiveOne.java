import java.util.Scanner;

public class noConsecutiveOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        binaryProblem(n,0,"");
        sc.close();
    }

    public static void binaryProblem(int n , int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }

        binaryProblem(n-1, 0, str+="0");
        if(lastPlace == 0){
            binaryProblem(n-1, 1, str+="1");
        }
    }
}

