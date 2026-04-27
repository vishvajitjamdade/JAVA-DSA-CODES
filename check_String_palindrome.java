import java.util.Scanner;

public class check_String_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start) != str.charAt(end)){
                System.out.println("String is not Palindrome");
                break;
            }
            start++;
            end--;
        }
        if(start == end){
            System.out.println("String is palindrome");
        }
        sc.close();
    }
}