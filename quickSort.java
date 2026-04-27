import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in array ");
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        sort(arr, 0, n-1);
        printArr(arr);
        sc.close();
    }

    public static void printArr(int arr[]){
        System.out.println();
        System.out.println("Array after sorting : ");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int arr[] , int si, int ei){

        if(si>=ei){
            return;
        }
        //last element
        int pidx = partition(arr,si,ei);
        sort(arr, si, pidx-1);      //left array
        sort(arr, pidx+1, ei);      //right array
    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;  // to make a places for element smaller than pivot

        for(int j = si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
}
