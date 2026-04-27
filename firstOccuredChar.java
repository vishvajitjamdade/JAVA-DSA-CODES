import java.util.Scanner;

public class firstOccuredChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter the string");
        str = sc.next();
        int freq[] = new int[26];
        sc.close();
        for(int i = 0;i<26;i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                ch = Character.toLowerCase(ch);
                freq[ch-'a']++;

                if(freq[ch-'a'] == 2){
                    System.out.println("Occured First Character : " + ch);
                    return;
                }
            }
        }
        System.out.println("Not Found");
        
    }
}
