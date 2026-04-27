import java.util.Scanner;

public class maxProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element in array");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int maxProd = Integer.MIN_VALUE;
        System.out.println("maximum subarray sum");
        for(int i = 0;i<n;i++){
            System.out.println("Starts from index   :" + i);
            int prod = 1;
            for(int j = i;j<n;j++){
                prod = prod * arr[j];
                maxProd = Math.max(maxProd, prod);
                System.out.println(prod);
            }
        }

        System.out.println("Maximum product of subarray is : " + maxProd);
        sc.close();
    }
}
