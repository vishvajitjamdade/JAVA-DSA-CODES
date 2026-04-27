import java.util.Scanner;

public class insertion_sortPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the element in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        //insertion sort logic
        for(int i = 1;i<n;i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }

        System.out.println();
        System.out.println("Array after sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
