import java.util.Scanner;

public class Largest_subarray_with_0_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the numbers in array : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int maxlen = 0;
        
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                sum = sum + arr[j];
                if(sum == 0){
                    int len = j - i;
                    if(len+1>maxlen){
                        maxlen = len+1;
                    }
                }
            }

            
        }

        System.out.println("Max length of subarray with sum 0 : "+maxlen);
        sc.close();
    }
}
