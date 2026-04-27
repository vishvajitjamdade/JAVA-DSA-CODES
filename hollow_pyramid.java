import java.util.Scanner;

public class hollow_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j = 1;j<=(2*i-1);j++){
                if(i == 1 || j == 1 || j == (2*i-1) || i == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
