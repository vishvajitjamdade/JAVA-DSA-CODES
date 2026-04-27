import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int org_num = num;

        int remainder = 0;
        int rev = 0;
        while(num>0){
            remainder = num%10;
            num = num/10;
            rev = rev*10 + remainder;
        }
        System.out.println("Number before reversed : " + org_num);
        System.out.println("Reversed number is : " + rev);

        sc.close();
    }
}
