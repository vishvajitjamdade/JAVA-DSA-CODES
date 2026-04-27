import java.util.Scanner;

public class armStrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check armstrong or not");
        double num = sc.nextInt();
        double org_num = num;
        double remainder = 0;
        double sum = 0;
        while(num>0){
            remainder = num%10;
            num = num/10;
            sum = sum + remainder*remainder*remainder;
        }

        if(sum == org_num){
            System.out.println(org_num + " is armstrong number");
        }
        else{
            System.out.println(org_num + " is not armstrong number");
        }
        sc.close();
    }
}
