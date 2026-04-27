import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int org_num = num;
        int remainder = 0;
        int sum = 0;

        while(num>0){
            remainder = num%10;
            num = num/10;
            sum = sum + remainder;
        }
        System.out.println("Sum of digits of number " + org_num + " is " + sum);
        sc.close();
    }
}
