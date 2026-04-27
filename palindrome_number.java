import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check number is palindrome or not");
        int num = sc.nextInt();
        int org_num = num;
        int remainder = 0;
        int reverse = 0;

        while(num>0){
            remainder = num%10;
            num = num/10;
            reverse = reverse*10 + remainder;
        }

        if(reverse == org_num){
            System.out.println(org_num + " is palindrome");
        }
        else{
            System.out.println(org_num + " is not palindrome");
        }
        sc.close();
    }
    
}
