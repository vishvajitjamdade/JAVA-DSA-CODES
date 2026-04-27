import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        System.out.println("Given string is " + input);
        char ch;
        String nstr = "";
        for(int i = 0;i<input.length();i++){
            ch = input.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed string is " + nstr);

        sc.close();
    }
}
