import java.util.Scanner;

public class evenOrodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check even or odd : ");
        int n = sc.nextInt();
        if((n&1)==0){
            System.out.println("even");
        }

        if((n&1)==1){
            System.out.println("odd");
        }
        sc.close();
    }
}
