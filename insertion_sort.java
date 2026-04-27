import java.util.Scanner;

public class insertion_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter numbers in array : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Numbers in array : ");
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }

        //  1st METHOD
        // for(int i = 1;i<n;i++){
        //     int curr = arr[i];
        //     int prev = i-1;
        //     while(prev>=0 && arr[prev] > curr){
        //         arr[prev+1] = arr[prev];
        //         prev--;
        //     }
        //     arr[prev+1] = curr;
        // }

        //2nd METHOD
        for(int i = 0;i<n;i++){
            int min_idx = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[min_idx] ){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

        System.out.println("Sorted Array");
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}