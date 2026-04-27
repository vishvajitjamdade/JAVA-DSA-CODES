import java.util.Scanner;

public class recursion_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to find contigious substring : ");
        String str = sc.nextLine();
        int count = contigiousString(str,0,0);
        System.out.println("Total contigious substring are : " + count);
        sc.close();
    }

    public static int contigiousString(String str,int start,int end){
        int n = str.length();
        if(start>=n){
            return 0;
        }

        if(end>=n){
            return contigiousString(str, start+1, start+1);
        }

        int count = (str.charAt(start) == str.charAt(end)) ? 1 : 0;

        return count+contigiousString(str, start, end+1);

    }
}
