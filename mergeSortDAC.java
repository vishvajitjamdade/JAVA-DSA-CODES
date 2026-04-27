import java.util.Scanner;

public class mergeSortDAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in array : ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting : ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        mergeSort(arr,0,arr.length-1);
        printArr(arr);
        sc.close();
    }

    public static void printArr(int arr[]){
        System.out.println("Sorted array : ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int arr[] ,int si ,int ei){
        if(si>=ei){
            return;
        }

        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si , int mid , int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for(k = 0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
}
