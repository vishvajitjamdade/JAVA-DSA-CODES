import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        str = str.toLowerCase();
        int freq[] = new int[26];
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }

        int count = 0;
        for(int i = 0;i<26;i++){
            count = count + freq[i];
        }

        System.out.println("Number of characters : " + count);

        sc.close(); 
    }
}
