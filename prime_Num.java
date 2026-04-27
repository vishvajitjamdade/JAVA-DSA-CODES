import java.util.Scanner;

public class prime_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        

        if(isPrime(num))
        {
            System.out.println(num + " is prime number");
        }
        else{
            System.out.println(num + " is not prime number");
        }
        sc.close();
    }

    public static boolean isPrime(int num){
        for(int i = 2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
