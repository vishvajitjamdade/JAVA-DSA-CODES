import java.util.Scanner;

public class recursion_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        int length = lengthOfString(str);
        System.out.println("Length of String is : " + length);
        sc.close();
    }

    public static int lengthOfString(String str){
        if(str.equals("")){
            return 0;
        }

        return 1+lengthOfString(str.substring(1));
    }
}
