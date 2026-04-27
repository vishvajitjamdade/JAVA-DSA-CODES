import java.util.Scanner;

public class numberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int org_num = num;
        int count = 0;

        while(num>0){
            num = num/10;
            count++;
        }

        System.out.println(count + " digits are in given number " + org_num);
        sc.close();
    }
}
