import java.util.Scanner;

public class checkArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter element in array");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean result = isSorted(arr, 0);
        System.out.println("Is Sorted : "+result);
        sc.close();
    }

    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        boolean res = isSorted(arr, i+1);
        return res;
    }
}
