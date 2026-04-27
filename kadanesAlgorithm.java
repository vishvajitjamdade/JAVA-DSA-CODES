import java.util.Scanner;

public class kadanesAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();
        System.out.println();
        System.out.println("Enter the numbers in array : ");
        int sum = 0;
        int arr[] = new int[n];
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<n;i++){
            sum = sum + arr[i];

            if(sum<0){
                sum = 0;
            }
            maxSum = Math.max(maxSum, sum);
            
        }

        System.out.println("Maximum sum is : " + maxSum);
        sc.close();
    }
}
