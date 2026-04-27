import java.util.Scanner;

public class search_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the character you want to search");
        char target = sc.next().charAt(0);

        System.out.println(search(str,target));

        sc.close();
    }

    public static boolean search(String str,char target){
        for(int i = 0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }
}
