import java.util.Scanner;

public class replaceLast2WordsOfStringWithFirst2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        char charArr[] = str.toCharArray();
        for(int i = 0;i<2;i++){
            char ch = charArr[i];
            charArr[i] = charArr[charArr.length - (i+1)];
            charArr[charArr.length - (i+1)] = ch;
        }

        System.out.println("After Swapping last two : ");
        for (char c : charArr) {
            System.out.print(c + " ");
        }
        System.out.println();

        String result = new String(charArr);
        System.out.println("After Swapping Output is : "+ result);
        sc.close();
    }
}
