import java.util.Scanner;

public class removeDuplicatesString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to remove duplicates : ");
        String str = sc.nextLine();        
        remove(str,0,new StringBuilder(""),new boolean[26]);
        sc.close();
    }

    public static void remove(String str,int idx,StringBuilder sb,boolean map[]){
         if(idx == str.length()){
            System.out.println("After removing duplicates : "+sb);
            return;
         }

         char currChar = str.charAt(idx);
         if(map[currChar-'a'] == true){
            remove(str, idx+1, sb, map);
         }else{
            map[currChar-'a'] = true;
            remove(str, idx+1, sb.append(currChar), map);
         }
    }
}
