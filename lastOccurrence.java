import java.util.Scanner;

public class lastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter element in array");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to find last occurrence : ");
        int k = sc.nextInt();
        int result = lastIndex(arr,k,0);
        System.out.println("Index of last occured : "+result);
        sc.close();
    }

    public static int lastIndex(int arr[],int k,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastIndex(arr, k, i+1);
        if(isFound == -1 && arr[i] == k){
            return i;
        }
        return isFound;

    }

}
