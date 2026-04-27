import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the numbers in array : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Given array is : ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i<n-1; i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
        }

        System.out.println();

        System.out.println("Sorted Array : ");
        for(int i = 0; i<n;i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
