import java.util.Scanner;

public class get_ith_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to ckeck its ith bit : ");
        int n = sc.nextInt();
        System.out.println("Enter bit : ");
        int i = sc.nextInt();
        int bitMask = 1<<i;
        if((n&bitMask) == 0){
            System.out.println("Bit at ith : "+0);
        }
        else{
            System.out.println("Bit at ith : "+1);
        }
        sc.close();
    }
    
}
