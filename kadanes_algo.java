import java.util.Scanner;

public class kadanes_algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int max = 0;

        for(int num : arr){
            sum = sum + num;
            max = Math.max(max, sum);
            if(sum<0){
                sum = 0;
            }
        }

        System.out.println("Maximum sum of subarray is : " + max);

        sc.close();
    }
}