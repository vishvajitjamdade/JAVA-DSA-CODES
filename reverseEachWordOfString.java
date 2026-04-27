// import java.util.Scanner;

// public class reverseEachWordOfString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string");
//         String input = sc.nextLine();
//         String result = reverse(input);

//         System.out.println("Reversed string by each word is : " + result);
        
//         sc.close();
//     }

//     static String reverse(String inputString){
//         String words[] = inputString.split(" ");
//         String reverseString = "";
//         for(int i = 0;i<words.length;i++){
//             String nstr = "";
//             char ch;
//             String word = words[i];

//             for(int j = 0;j<word.length();j++){
//                 ch = word.charAt(j);
//                 nstr = ch + nstr;
//             }
//             reverseString = reverseString + nstr + " ";
//         }
//         return reverseString;
//     }
// }

                                            //OPTIMIZED CODE

import java.util.Scanner;

public class reverseEachWordOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        String result = reverse(input);

        System.out.println("Reversed string by each word is : " + result);
        
        sc.close();
    }

    static String reverse(String inputString){
        String words[] = inputString.split(" ");
        StringBuilder reverseString = new StringBuilder();
        for(int i = 0;i<words.length;i++){
            String word = words[i];
            StringBuilder rev = new StringBuilder(word);
            reverseString.append(rev.reverse().toString()).append(" ");
        }
        return reverseString.toString().trim();
    }
}
