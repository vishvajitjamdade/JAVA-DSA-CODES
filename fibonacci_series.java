// import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int num = 6;
        int first = 0;
        int second = 1;
        int next = 0;
        for(int i = 0;i<=num;i++){
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }
}
