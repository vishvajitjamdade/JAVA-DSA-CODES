import java.util.*;

public class mergeSort{

    public static void divide(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = si+(ei-si)/2;
        divide(arr, si, mid); //left part
        divide(arr, mid+1, ei); //right part

        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[],int si,int ei,int mid) {
        int i = si;
        int j = mid+1;
        int k = 0;
        int temp[] = new int[ei-si+1];

        while(i<=mid && j<=ei){
            if(arr[i] > arr[j]){
                temp[k] = arr[j++];
            }else{
                temp[k] = arr[i++];
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=ei){
            temp[k++] = arr[j++];
        }

        int x = si;
        for(int l = 0;l<temp.length;l++){
            arr[x++] = temp[l];
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements in array : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        divide(arr, 0, n-1);
        System.out.println("Sorted Array : ");
        for(int l = 0;l<arr.length;l++){
            System.out.print(arr[l] + " ");
        }

        sc.close();
    }
}